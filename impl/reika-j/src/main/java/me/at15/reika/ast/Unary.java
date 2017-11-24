package me.at15.reika.ast;

public class Unary extends Node {
    public static enum Op {
        Negative
    }

    public final Op op;
    public final Node arg;

    public Unary(Op op, Node arg) {
        this.op = op;
        this.arg = arg;
    }

//    public static Op opFromText(String s) {
//        if (s.equals("-")) {
//            return Op.Negative;
//        } else {
//            // TODO: throw exception, the grammar file and the ast does not match, ast is likely to be outdated
//            return Op.Negative;
//        }
//    }
}
