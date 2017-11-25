package me.at15.reika.ast;

public class Literal extends Node {
    public static class Bool extends Literal {
        public final boolean v;

        public Bool(boolean v) {
            this.v = v;
        }

        @Override
        public String toString() {
            return String.valueOf(v);
        }
    }

    public static class Int extends Literal {
        public final int v;

        public Int(int v) {
            this.v = v;
        }

        @Override
        public String toString() {
            return String.valueOf(v);
        }
    }

    public static class Double extends Literal {
        public final double v;

        public Double(double v) {
            this.v = v;
        }

        @Override
        public String toString() {
            return String.valueOf(v);
        }
    }
}