package me.at15.reika.ast;

public class OpBinary extends Node {
    public static enum Op {
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
}
