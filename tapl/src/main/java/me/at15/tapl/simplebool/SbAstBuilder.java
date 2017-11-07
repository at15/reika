package me.at15.tapl.simplebool;

import me.at15.tapl.common.Loggable;

import java.util.ArrayList;
import java.util.List;

public class SbAstBuilder extends SbBaseVisitor<SbAst.Node> implements Loggable {
    private List<SbAst.Node> terms;

    public SbAstBuilder() {
    }

    @Override
    public SbAst.Node visitProg(SbParser.ProgContext ctx) {
        terms = new ArrayList<>();
        logger().debug("visit program");
        for (SbParser.StatContext stat : ctx.stat()) {
            terms.add(visit(stat.term()));
        }
        logger().debug("total {} statements in program", terms.size());
        return new SbAst.Prog(terms);
    }

    // visitStat is never called since we don't have nested statement

    @Override
    public SbAst.Node visitApp(SbParser.AppContext ctx) {
        return new SbAst.App(
                visit(ctx.term(0)), // func
                visit(ctx.term(1)) // arg
        );
    }

    @Override
    public SbAst.Node visitAbs(SbParser.AbsContext ctx) {
        return new SbAst.Abs(
                new SbAst.Var(ctx.ID().getText()),
                (SbAst.Ty) visit(ctx.type()),
                visit(ctx.term())
        );
    }

    @Override
    public SbAst.Node visitBrackets(SbParser.BracketsContext ctx) {
        return visit(ctx.term());
    }

    @Override
    public SbAst.Node visitVar(SbParser.VarContext ctx) {
        return new SbAst.Var(ctx.ID().getText());
    }

    @Override
    public SbAst.Node visitConsTrue(SbParser.ConsTrueContext ctx) {
        return new SbAst.True();
    }

    @Override
    public SbAst.Node visitConsFalse(SbParser.ConsFalseContext ctx) {
        return new SbAst.False();
    }

    @Override
    public SbAst.Node visitIf(SbParser.IfContext ctx) {
        return new SbAst.If(
                visit(ctx.term(0)), // if
                visit(ctx.term(1)), // then
                visit(ctx.term(2))  // else
        );
    }

    @Override
    public SbAst.Node visitTyBool(SbParser.TyBoolContext ctx) {
        return new SbAst.TyBool();
    }

    @Override
    public SbAst.Node visitTyArr(SbParser.TyArrContext ctx) {
        return new SbAst.TyArr((SbAst.Ty) visit(ctx.type(0)), (SbAst.Ty) visit(ctx.type(1)));
    }
}
