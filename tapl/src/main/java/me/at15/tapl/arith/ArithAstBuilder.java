package me.at15.tapl.arith;

import me.at15.tapl.common.Loggable;

import java.util.ArrayList;
import java.util.List;

public class ArithAstBuilder extends ArithBaseVisitor<ArithAst.Node> implements Loggable {
    private List<ArithAst.Node> terms;

    public ArithAstBuilder() {
    }

    @Override
    public ArithAst.Node visitProg(ArithParser.ProgContext ctx) {
        terms = new ArrayList<>();
        logger().debug("visit program");
        List<ArithParser.StatContext> statContexts = ctx.stat();
        for (ArithParser.StatContext stat : statContexts) {
            terms.add(visit(stat.term()));
        }
        logger().debug("total {} statements in program", terms.size());
        return new ArithAst.Prog(terms);
    }

    // TODO: override others
}
