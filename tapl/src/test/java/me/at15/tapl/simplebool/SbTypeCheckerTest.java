package me.at15.tapl.simplebool;

import static org.junit.Assert.*;

import me.at15.tapl.common.ParserWrapper;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import java.io.IOException;

public class SbTypeCheckerTest {
    @Test
    public void testOfficialExample() throws IOException {
        ParserWrapper<SbParser, SbLexer> wrapper = SbParserTest.readResource("simplebool.f");
        SbParser parser = wrapper.getParser();
        ParseTree tree = parser.prog();
        assertFalse(wrapper.hasError());
        SbAstBuilder astBuilder = new SbAstBuilder();
        SbAst.Node prog = astBuilder.visit(tree);
        SbTypeChecker typeChecker = new SbTypeChecker();
        typeChecker.checkProg((SbAst.Prog) prog);
    }
}
