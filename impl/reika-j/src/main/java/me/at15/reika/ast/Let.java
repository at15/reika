package me.at15.reika.ast;

public class Let extends Node {
    public final Var var;
    public final Type type;
    public final Node term;

    public Let(Var var, Type type, Node term) {
        this.var = var;
        this.type = type;
        this.term = term;
    }
}
