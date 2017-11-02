package me.at15.tapl.arith;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class ArithParserTest {
    public static ArithParser readResource(String fileName) throws IOException {
        ClassLoader classLoader = ArithParserTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream(fileName);
        // NOTE: we are using charStream instead ANTLRInputStream, which is deprecated in 4.7
        // see https://github.com/antlr/antlr4/blob/master/doc/unicode.md for detail
        CharStream charStream = CharStreams.fromStream(is);
        ArithLexer lexer = new ArithLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ArithParser parser = new ArithParser(tokens);
        is.close();
        return parser;
    }

    @Test
    public void testOfficialExample() throws IOException {
        // https://www.cis.upenn.edu/~bcpierce/tapl/checkers/arith/test.f
        ArithParser parser = readResource("arith.f");
        // TODO: ANTLR by default would log to stderr instead of throw exception, need to migrate the error tracker from old reika
        parser.prog();
    }
}
