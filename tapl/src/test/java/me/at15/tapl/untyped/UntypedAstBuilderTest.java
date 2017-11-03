package me.at15.tapl.untyped;

import static org.junit.Assert.*;

import me.at15.tapl.common.ParserWrapper;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import java.io.IOException;

public class UntypedAstBuilderTest {
    @Test
    public void testOfficialExample() throws IOException {
        ParserWrapper<UntypedParser, UntypedLexer> wrapper = UntypedParserTest.readResource("untyped.f");
        UntypedParser parser = wrapper.getParser();
        ParseTree tree = parser.prog();
        assertFalse(wrapper.hasError());
        UntypedAstBuilder astBuilder = new UntypedAstBuilder();
        astBuilder.visit(tree);
    }
}
