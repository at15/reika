package me.at15.reika.compiler.ast;

import me.at15.reika.common.ReikaInternalException;
import me.at15.reika.compiler.reporter.Position;

public class OpUnary extends Tree {
    public enum Op {
        Negative, Not
    }

    public final Op op;
    public final Tree tree;

    public OpUnary(Position pos, Op op, Tree tree) {
        super(pos);
        this.op = op;
        this.tree = tree;
    }

    public static Op opFromText(String s) {
        if ("-".equals(s)) {
            return Op.Negative;
        } else if (s.equals("!")) {
            return Op.Not;
        } else {
            throw new ReikaInternalException("unknown unary operator " + s);
        }
    }
}
