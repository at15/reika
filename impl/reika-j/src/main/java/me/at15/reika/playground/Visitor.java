package me.at15.reika.playground;

public interface Visitor<T> {
    T visit(Node n);
    T visit(Node.Prog n);
    T visit(Node.Int n);
    T visit(Node.Bool n);
    T visit(Node.BinOp n);
}
