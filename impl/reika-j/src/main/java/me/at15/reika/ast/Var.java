package me.at15.reika.ast;

import me.at15.reika.common.ReikaException;

public class Var extends Node {
    public final String name;

    public Var(String name) {
        this.name = name;
    }

    @Override
    public <T> T accept(ASTVisitor<? extends T> visitor) throws ReikaException {
        return visitor.visit(this);
    }
}
