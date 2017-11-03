package me.at15.tapl.untyped;

import me.at15.tapl.common.Loggable;

import java.util.ArrayList;
import java.util.List;

public class UntypedAstBuilder extends UntypedBaseVisitor<UntypedAst.Node> implements Loggable {
    private List<UntypedAst.Node> terms;

    public UntypedAstBuilder() {
    }

    @Override
    public UntypedAst.Node visitProg(UntypedParser.ProgContext ctx) {
        terms = new ArrayList<>();
        logger().debug("visit program");
        for (UntypedParser.StatContext stat : ctx.stat()) {
            terms.add(visit(stat.term()));
        }
        logger().debug("total {} statements in program", terms.size());
        return new UntypedAst.Prog(terms);
    }

    // visitStat is never called since we don't have nested statement


    @Override
    public UntypedAst.Node visitApp(UntypedParser.AppContext ctx) {
        return new UntypedAst.App(visit(ctx.term(0)), visit(ctx.term(1)));
    }

    @Override
    public UntypedAst.Node visitAbs(UntypedParser.AbsContext ctx) {
        return new UntypedAst.Abs(new UntypedAst.Var(ctx.ID().getText()), visit(ctx.term()));
    }

    @Override
    public UntypedAst.Node visitBrackets(UntypedParser.BracketsContext ctx) {
        return visit(ctx.term());
    }

    @Override
    public UntypedAst.Node visitVar(UntypedParser.VarContext ctx) {
        return new UntypedAst.Var(ctx.ID().getText());
    }
}
