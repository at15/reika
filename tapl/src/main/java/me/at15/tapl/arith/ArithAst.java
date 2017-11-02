package me.at15.tapl.arith;

import java.util.List;

public class ArithAst {
    public static abstract class Node {
    }

    // top level program (root) contains a list of terms as children
    public static class Prog extends Node {
        public final List<Node> terms;

        public Prog(List<Node> terms) {
            this.terms = terms;
        }
    }

    // literals, boolean and 0
    public static class Bool extends Node {
        public final boolean val;

        public Bool(boolean b) {
            val = b;
        }
    }

    public static class Zero extends Node {

    }

    // control flow
    public static class If extends Node {
        public final Node con;
        public final Node then;
        public final Node els;

        public If(Node t1, Node t2, Node t3) {
            con = t1;
            then = t2;
            els = t3;
        }
    }

    // built in function, +1, -1, =0?
    public static class Succ extends Node {
        public final Node params;

        public Succ(Node t) {
            params = t;
        }
    }

    public static class Pred extends Node {
        public final Node params;

        public Pred(Node t) {
            params = t;
        }
    }

    public static class IsZero extends Node {
        public final Node params;

        public IsZero(Node t) {
            params = t;
        }
    }
}
