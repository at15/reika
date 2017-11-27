package me.at15.reika.ast;

import me.at15.reika.common.ReikaException;

import java.util.List;

public class Program extends Node {
    // TODO: do we still need statement instead of terms, in old reika we have VarDecl and VarAssign
    public final List<Node> terms;

    public Program(List<Node> terms) {
        this.terms = terms;
    }

    @Override
    public <T> T accept(ASTVisitor<? extends T> visitor) throws ReikaException {
        return visitor.visit(this);
    }
}
