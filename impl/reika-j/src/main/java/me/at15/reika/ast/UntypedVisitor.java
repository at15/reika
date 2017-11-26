package me.at15.reika.ast;

import me.at15.reika.common.Loggable;
import me.at15.reika.parser.ReikaBaseVisitor;
import me.at15.reika.parser.ReikaParser;
import me.at15.reika.type.Primitive;
import me.at15.reika.type.Unspecified;

import java.util.ArrayList;
import java.util.List;

public class UntypedVisitor extends ReikaBaseVisitor<Node> implements Loggable {

    @Override
    public Node visitProg(ReikaParser.ProgContext ctx) {
        List<Node> terms = new ArrayList<>();
        logger().trace("visit program");
        for (ReikaParser.TermContext tm : ctx.term()) {
            terms.add(visit(tm));
        }
        logger().trace("total {} statements in program", terms.size());
        return new Program(terms);
    }

    @Override
    public Node visitValBool(ReikaParser.ValBoolContext ctx) {
        return new Val.Bool(Boolean.parseBoolean(ctx.BOOL().getText()));
    }

    @Override
    public Node visitValInt(ReikaParser.ValIntContext ctx) {
        return new Val.Int(Integer.parseInt(ctx.INT().getText()));
    }

    @Override
    public Node visitValDouble(ReikaParser.ValDoubleContext ctx) {
        return new Val.Double(Double.parseDouble(ctx.DOUBLE().getText()));
    }

    @Override
    public Node visitTypeInt(ReikaParser.TypeIntContext ctx) {
        return new Type(new Primitive.Int());
    }

    @Override
    public Node visitTypeDouble(ReikaParser.TypeDoubleContext ctx) {
        return new Type(new Primitive.Double());
    }

    @Override
    public Node visitTypeBool(ReikaParser.TypeBoolContext ctx) {
        return new Type(new Primitive.Bool());
    }

    @Override
    public Node visitTmValue(ReikaParser.TmValueContext ctx) {
        return visit(ctx.value());
    }

    @Override
    public Node visitTmVar(ReikaParser.TmVarContext ctx) {
        return new Var(ctx.ID().getText());
    }

    @Override
    public Node visitTmUnary(ReikaParser.TmUnaryContext ctx) {
        return new OpUnary(
                OpUnary.opFromText(ctx.op.getText()),
                visit(ctx.term())
        );
    }

    @Override
    public Node visitTmBinary(ReikaParser.TmBinaryContext ctx) {
        return new OpBinary(
                OpBinary.opFromText(ctx.op.getText()),
                visit(ctx.term(0)),
                visit(ctx.term(1))
        );
    }

    @Override
    public Node visitTmLet(ReikaParser.TmLetContext ctx) {
        // varType is optional in let, we can have let x = 1 and let x:Int = 1
        ReikaParser.TypeContext typeContext = ctx.type();
        Type type = new Type(new Unspecified());
        if (typeContext != null) {
            type = (Type) visit(typeContext);
        }
        return new Let(
                new Var(ctx.ID().getText()),
                type,
                visit(ctx.term())
        );
    }

    @Override
    public Node visitTmBrackets(ReikaParser.TmBracketsContext ctx) {
        return visit(ctx.term());
    }
}
