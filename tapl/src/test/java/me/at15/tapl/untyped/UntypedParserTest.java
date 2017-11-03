package me.at15.tapl.untyped;

import me.at15.tapl.common.ParserWrapper;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class UntypedParserTest {
    public static ParserWrapper<UntypedParser, UntypedLexer> readResource(String fileName) throws IOException {
        ClassLoader classLoader = UntypedParserTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream(fileName);
        CharStream charStream = CharStreams.fromStream(is);
        ParserWrapper<UntypedParser, UntypedLexer> wrapper = new ParserWrapper<>();
        UntypedLexer lexer = new UntypedLexer(charStream);
        wrapper.wrapLexer(lexer);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        UntypedParser parser = new UntypedParser(tokens);
        wrapper.wrapParser(parser);
        is.close();
        return wrapper;
    }

    @Test
    public void testOfficialExample() throws IOException {
        ParserWrapper<UntypedParser, UntypedLexer> wrapper = readResource("untyped.f");
        UntypedParser parser = wrapper.getParser();
        parser.prog();
//        wrapper.getLexerErrorListener().printErrors();
//        wrapper.getParseErrorListener().printErrors();
        assertFalse(wrapper.hasError());
    }
}
