package me.at15.tapl.arith;

import static org.junit.Assert.*;

import me.at15.tapl.common.ParserWrapper;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import java.io.IOException;

public class ArithEvaluatorTest {
    @Test
    public void testOfficialExample() throws IOException {
        ParserWrapper<ArithParser, ArithLexer> wrapper = ArithParserTest.readResource("arith.f");
        ArithParser parser = wrapper.getParser();
        ParseTree tree = parser.prog();
        assertFalse(wrapper.hasError());
        ArithAstBuilder astBuilder = new ArithAstBuilder();
        ArithAst.Node prog = astBuilder.visit(tree);
        ArithEvaluator evaluator = new ArithEvaluator();
        evaluator.evalProg((ArithAst.Prog) prog);
    }
}
