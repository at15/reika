package me.at15.reika.playground;

import java.util.ArrayList;
import java.util.List;

public class AstBuilder extends SimpleBinBaseVisitor<Node> {
    @Override
    public Node visitProg(SimpleBinParser.ProgContext ctx) {
        List<Node> terms = new ArrayList<>();
        for (SimpleBinParser.TermContext tm : ctx.term()) {
            terms.add(visit(tm));
        }
        return new Node.Prog(terms);
    }

    @Override
    public Node visitInt(SimpleBinParser.IntContext ctx) {
        return new Node.Int(Integer.parseInt(ctx.getText()));
    }

    @Override
    public Node visitBool(SimpleBinParser.BoolContext ctx) {
        return new Node.Bool(Boolean.parseBoolean(ctx.getText()));
    }

    @Override
    public Node visitBinOp(SimpleBinParser.BinOpContext ctx) {
        return new Node.BinOp(ctx.op.getText(), visit(ctx.term(0)), visit(ctx.term(1)));
    }
}
