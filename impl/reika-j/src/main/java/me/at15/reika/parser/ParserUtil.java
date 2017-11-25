package me.at15.reika.parser;

import me.at15.reika.common.Reika;
import me.at15.reika.common.ReikaException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;

public class ParserUtil {
    public static Wrapper readResource(String path, boolean stderrEnabled) throws IOException {
        if (!path.endsWith(Reika.EXT)) {
            path = path + Reika.EXT;
        }
        ClassLoader classLoader = ParserUtil.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream(path);
        if (is == null) {
            throw new IOException(String.format("resource %s not found", path));
        }
        CharStream charStream = CharStreams.fromStream(is);
        Wrapper wrapper = new Wrapper(stderrEnabled);
        ReikaLexer lexer = new ReikaLexer(charStream);
        wrapper.wrapLexer(lexer);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ReikaParser parser = new ReikaParser(tokenStream);
        wrapper.wrapParser(parser);
        is.close();
        return wrapper;
    }

    public static ParseTree readResourceAsTree(String path) throws ReikaException {
        try {
            Wrapper wrapper = readResource(path, false);
            if (wrapper.hasError()) {
                throw new InvalidSyntaxException(wrapper);
            }
            return wrapper.getParser().prog();
        } catch (IOException e) {
            throw new ReikaException("can't read resource", e);
        }
    }
}
