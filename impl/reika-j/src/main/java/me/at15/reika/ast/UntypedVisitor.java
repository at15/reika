package me.at15.reika.ast;

import me.at15.reika.common.Loggable;
import me.at15.reika.parser.ReikaBaseVisitor;
import me.at15.reika.parser.ReikaParser;

import java.util.ArrayList;
import java.util.List;

public class UntypedVisitor extends ReikaBaseVisitor<Node> implements Loggable {
    private List<Node> terms;

    @Override
    public Node visitProg(ReikaParser.ProgContext ctx) {
        // TODO: we need extra handling in interactive environment, because the input stream in instead of one batch,
        // we need to keep previous context, old reika code has a flag for that, but if we split the type process out of
        // visitor, type check can be delegated to downstream
        terms = new ArrayList<>();
        logger().debug("visit program");
        for (ReikaParser.TermContext tm : ctx.term()) {
            terms.add(visit(tm));
        }
        logger().debug("total {} statements in program", terms.size());
        return new Program(terms);
    }

    // TODO: forgot visitTmValue, though the default one might work directly?

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
}
