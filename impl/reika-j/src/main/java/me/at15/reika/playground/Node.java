package me.at15.reika.playground;

import java.util.List;

public abstract class Node {
    public abstract <T> T accept(Visitor<? extends T> visitor);

    public static class Prog extends Node {
        public List<Node> terms;

        public Prog(List<Node> terms) {
            this.terms = terms;
        }

        @Override
        public <T> T accept(Visitor<? extends T> visitor) {
            return visitor.visit(this);
        }
    }

    public static class Bool extends Node {
        public boolean val;

        public Bool(boolean val) {
            this.val = val;
        }

        @Override
        public <T> T accept(Visitor<? extends T> visitor) {
            return visitor.visit(this);
        }
    }

    public static class Int extends Node {
        public int val;

        public Int(int val) {
            this.val = val;
        }

        @Override
        public <T> T accept(Visitor<? extends T> visitor) {
            return visitor.visit(this);
        }
    }

    public static class BinOp extends Node {
        public String op;
        public Node l;
        public Node r;

        public BinOp(String op, Node l, Node r) {
            this.op = op;
            this.l = l;
            this.r = r;
        }

        @Override
        public <T> T accept(Visitor<? extends T> visitor) {
            return visitor.visit(this);
        }

    }
}
