package me.at15.reika.ast;

import me.at15.reika.common.ReikaException;

public class OpUnary extends Node {
    public enum Op {
        Negative, Not
    }

    public final Op op;
    public final Node arg;

    public OpUnary(Op op, Node arg) {
        this.op = op;
        this.arg = arg;
    }

    public static Op opFromText(String s) {
        if (s.equals("-")) {
            return Op.Negative;
        } else if (s.equals("!")) {
            return Op.Not;
        } else {
            throw new InvalidGrammarException("unknown unary operator " + s);
        }
    }

    @Override
    public <T> T accept(ASTVisitor<? extends T> visitor) throws ReikaException {
        return visitor.visit(this);
    }
}
