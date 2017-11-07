package me.at15.tapl.simplebool;


import me.at15.tapl.common.ParserWrapper;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class SbParserTest {
    public static ParserWrapper<SbParser, SbLexer> readResource(String fileName) throws IOException {
        ClassLoader classLoader = SbParserTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream(fileName);
        CharStream charStream = CharStreams.fromStream(is);
        ParserWrapper<SbParser, SbLexer> wrapper = new ParserWrapper<>();
        SbLexer lexer = new SbLexer(charStream);
        wrapper.wrapLexer(lexer);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SbParser parser = new SbParser(tokens);
        wrapper.wrapParser(parser);
        is.close();
        return wrapper;
    }

    @Test
    public void testOfficialExample() throws IOException {
        ParserWrapper<SbParser, SbLexer> wrapper = readResource("simplebool.f");
        SbParser parser = wrapper.getParser();
        parser.prog();
        assertFalse(wrapper.hasError());
    }
}
