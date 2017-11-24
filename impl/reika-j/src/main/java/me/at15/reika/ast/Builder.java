package me.at15.reika.ast;

import me.at15.reika.common.Loggable;
import me.at15.reika.parser.ReikaBaseVisitor;
import me.at15.reika.parser.ReikaParser;

import java.util.ArrayList;
import java.util.List;

public class Builder extends ReikaBaseVisitor<Node> implements Loggable {
    private List<Node> terms;

    @Override
    public Node visitProg(ReikaParser.ProgContext ctx) {
        // TODO: we need extra handling in interactive environment, because the input stream in instead of one batch,
        // we need to keep previous context, old reika code has a flag for that
        terms = new ArrayList<>();
        logger().debug("visit program");
        // TODO: since our statement is just term + ;, we can use term directly, it might change when we have assignment
        for (ReikaParser.StatContext stat : ctx.stat()) {
            terms.add(visit(stat.term()));
        }
        logger().debug("total {} statements in program", terms.size());
        return new Program(terms);
    }

    @Override
    public Node visitValInt(ReikaParser.ValIntContext ctx) {
        return new Literal.Int(Integer.parseInt(ctx.INT().getText()));
    }

    @Override
    public Node visitValDouble(ReikaParser.ValDoubleContext ctx) {
        return new Literal.Double(Double.parseDouble(ctx.DOUBLE().getText()));
    }

    @Override
    public Node visitTmUnaryNegative(ReikaParser.TmUnaryNegativeContext ctx) {
        return new Unary(Unary.Op.Negative, visit(ctx.term()));
    }

    @Override
    public Node visitTmBinaryHigh(ReikaParser.TmBinaryHighContext ctx) {
        Binary.Op op = Binary.opFromText(ctx.BINARY_OP_HIGH().getText());
        return new Binary(op, visit(ctx.term(0)), visit(ctx.term(1)));
    }

    @Override
    public Node visitTmBinaryLow(ReikaParser.TmBinaryLowContext ctx) {
        Binary.Op op = Binary.opFromText(ctx.BINARY_OP_LOW().getText());
        return new Binary(op, visit(ctx.term(0)), visit(ctx.term(1)));
    }
}
