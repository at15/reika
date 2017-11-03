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

    @Override
    public ArithAst.Node visitConsTrue(ArithParser.ConsTrueContext ctx) {
        return new ArithAst.True();
    }

    @Override
    public ArithAst.Node visitConsFalse(ArithParser.ConsFalseContext ctx) {
        return new ArithAst.False();
    }

    @Override
    public ArithAst.Node visitConditional(ArithParser.ConditionalContext ctx) {
        return new ArithAst.If(
                visit(ctx.term(0)), // if
                visit(ctx.term(1)), // then
                visit(ctx.term(2))); // else
    }

    @Override
    public ArithAst.Node visitConsZero(ArithParser.ConsZeroContext ctx) {
        return new ArithAst.Zero();
    }

    @Override
    public ArithAst.Node visitSucc(ArithParser.SuccContext ctx) {
        return new ArithAst.Succ(visit(ctx.term()));
    }

    @Override
    public ArithAst.Node visitPred(ArithParser.PredContext ctx) {
        return new ArithAst.Pred(visit(ctx.term()));
    }

    @Override
    public ArithAst.Node visitIsZero(ArithParser.IsZeroContext ctx) {
        return new ArithAst.IsZero(visit(ctx.term()));
    }

    @Override
    public ArithAst.Node visitBrackets(ArithParser.BracketsContext ctx) {
        return visit(ctx.term());
    }
}
