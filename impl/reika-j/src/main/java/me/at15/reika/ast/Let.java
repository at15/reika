package me.at15.reika.ast;

public class Let extends Node {
    public final Var var;
    public final Type varType;
    public final Node term;

    public Let(Var var, Type varType, Node term) {
        this.var = var;
        this.varType = varType;
        this.term = term;
    }
}
