package me.at15.reika.playground;

public class TypeChecker implements Visitor<Type> {
    @Override
    public Type visit(Node n) {
        return n.accept(this);
    }

    @Override
    public Type visit(Node.Prog n) {
        Type tp = Type.INT;
        for (Node tm : n.terms) {
            tp = visit(tm);
            System.out.println(tp.name());
        }
        return tp;
    }

    @Override
    public Type visit(Node.Int n) {
        return Type.INT;
    }

    @Override
    public Type visit(Node.Bool n) {
        return Type.BOOL;
    }

    @Override
    public Type visit(Node.BinOp n) {
        Type tl = visit(n.l);
        Type tr = visit(n.r);
        if (tl != tr) {
            System.out.printf("type error: l is %s but r is %s\n", tl.name(), tr.name());
        }
        return tl;
    }
}
