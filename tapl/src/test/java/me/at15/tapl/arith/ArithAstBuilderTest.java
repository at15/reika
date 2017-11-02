package me.at15.tapl.arith;

import static org.junit.Assert.*;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import java.io.IOException;

public class ArithAstBuilderTest {
    @Test
    public void testOfficialExample() throws IOException {
        ArithParser parser = ArithParserTest.readResource("arith.f").getParser();
        ParseTree tree = parser.prog();
        ArithAstBuilder astBuilder = new ArithAstBuilder();
        astBuilder.visit(tree);
    }
}
