package me.at15.reika.ast;

import me.at15.reika.common.ReikaException;

public class OpBinary extends Node {
    public enum Op {
        Add, Minus,
        Mul, Div, Mod
    }

    public final Op op;
    public final Node l;
    public final Node r;

    public OpBinary(Op op, Node l, Node r) {
        this.op = op;
        this.l = l;
        this.r = r;
    }

    public static Op opFromText(String s) {
        if (s.equals("+")) {
            return Op.Add;
        } else if (s.equals("-")) {
            return Op.Minus;
        } else if (s.equals("*")) {
            return Op.Mul;
        } else if (s.equals("/")) {
            return Op.Div;
        } else if (s.equals("%")) {
            return Op.Mod;
        } else {
            throw new InvalidGrammarException("unknown binary operator " + s);
        }
    }

    @Override
    public <T> T accept(ASTVisitor<? extends T> visitor) throws ReikaException {
        return visitor.visit(this);
    }
}
