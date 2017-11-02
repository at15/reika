package me.at15.tapl.arith;

import static org.junit.Assert.*;

import me.at15.tapl.common.ParserWrapper;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class ArithParserTest {
    public static ParserWrapper<ArithParser, ArithLexer> readResource(String fileName) throws IOException {
        ClassLoader classLoader = ArithParserTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream(fileName);
        // NOTE: we are using charStream instead ANTLRInputStream, which is deprecated in 4.7
        // see https://github.com/antlr/antlr4/blob/master/doc/unicode.md for detail
        CharStream charStream = CharStreams.fromStream(is);
        ParserWrapper<ArithParser, ArithLexer> wrapper = new ParserWrapper<>();
        ArithLexer lexer = new ArithLexer(charStream);
        wrapper.wrapLexer(lexer);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ArithParser parser = new ArithParser(tokens);
        wrapper.wrapParser(parser);
        is.close();
        return wrapper;
    }

    @Test
    public void testOfficialExample() throws IOException {
        // https://www.cis.upenn.edu/~bcpierce/tapl/checkers/arith/test.f
        ParserWrapper<ArithParser, ArithLexer> wrapper = readResource("arith.f");
        ArithParser parser = wrapper.getParser();
        parser.prog();
        assertFalse(wrapper.getParseErrorListener().hasError());
    }

    @Test
    public void testLexerErrorListener() throws IOException {
        ParserWrapper<ArithParser, ArithLexer> wrapper = readResource("arith_lexer_err.f");
        ArithParser parser = wrapper.getParser();
        parser.prog();
        assertTrue(wrapper.hasError());
        assertTrue(wrapper.getLexerErrorListener().hasError());
        wrapper.getLexerErrorListener().printErrors();
    }

    @Test
    public void testParseErrorListener() throws IOException {
        ParserWrapper<ArithParser, ArithLexer> wrapper = readResource("arith_parser_err.f");
        ArithParser parser = wrapper.getParser();
        parser.prog();
        assertTrue(wrapper.hasError());
        assertTrue(wrapper.getParseErrorListener().hasError());
        wrapper.getParseErrorListener().printErrors();
    }
}
