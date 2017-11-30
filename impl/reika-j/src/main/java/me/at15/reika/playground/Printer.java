package me.at15.reika.playground;

public class Printer implements Visitor<String> {
    @Override
    public String visit(Node n) {
        return n.accept(this);
    }

    @Override
    public String visit(Node.Prog n) {
        StringBuilder sb = new StringBuilder();
        for (Node tm : n.terms) {
            sb.append(visit(tm));
            sb.append('\n');
        }
        return sb.toString();
    }

    @Override
    public String visit(Node.Int n) {
        return String.valueOf(n.val);
    }

    @Override
    public String visit(Node.Bool n) {
        return String.valueOf(n.val);
    }

    @Override
    public String visit(Node.BinOp n) {
        return String.format("(%s %s %s)", visit(n.l), n.op, visit(n.r));
    }
}
