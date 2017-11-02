package me.at15.tapl.arith;

import static org.junit.Assert.*;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class ArithParserTest {
    public static ArithParserTracked readResource(String fileName) throws IOException {
        ClassLoader classLoader = ArithParserTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream(fileName);
        // NOTE: we are using charStream instead ANTLRInputStream, which is deprecated in 4.7
        // see https://github.com/antlr/antlr4/blob/master/doc/unicode.md for detail
        CharStream charStream = CharStreams.fromStream(is);
        ArithLexer lexer = new ArithLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ArithParserTracked parser = new ArithParserTracked(tokens);
        is.close();
//        parser.removeErrorListeners();
//        ParseErrorListener listener = new ParseErrorListener(true);
//        parser.addErrorListener(listener);
        return parser;
    }

    @Test
    public void testOfficialExample() throws IOException {
        // https://www.cis.upenn.edu/~bcpierce/tapl/checkers/arith/test.f
        ArithParserTracked parser = readResource("arith.f");
        parser.prog();
        assertFalse(parser.getParseErrorListener().hasError());
    }

    @Test
    public void testParseErrorListener() throws IOException {
        ArithParserTracked parser = readResource("arith_parser_err.f");
        parser.prog();
        assertTrue(parser.getParseErrorListener().hasError());
        parser.getParseErrorListener().printErrors();
    }
}
