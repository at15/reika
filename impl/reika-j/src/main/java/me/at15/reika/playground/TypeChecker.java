package me.at15.reika.playground;

public class TypeChecker implements Visitor<Type> {
    @Override
    public Type visit(Node n) {
        return n.accept(this);
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
        return null;
    }
}
