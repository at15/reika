package me.at15.reika.compiler.ast;

import me.at15.reika.common.ReikaInternalException;
import me.at15.reika.compiler.reporter.Position;

public class OpBinary extends Tree {
    public enum Op {
        Add, Minus,
        Mul, Div, Mod
    }

    public final Op op;
    public final Tree lhs;
    public final Tree rhs;

    public OpBinary(Position pos, Op op, Tree lhs, Tree rhs) {
        super(pos);
        this.op = op;
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public static Op opFromText(String s) {
        if ("+".equals(s)) {
            return Op.Add;
        } else if ("-".equals(s)) {
            return Op.Minus;
        } else if ("*".equals(s)) {
            return Op.Mul;
        } else if ("/".equals(s)) {
            return Op.Div;
        } else if ("%".equals(s)) {
            return Op.Mod;
        } else {
            throw new ReikaInternalException("unknown binary operator " + s);
        }
    }
}
