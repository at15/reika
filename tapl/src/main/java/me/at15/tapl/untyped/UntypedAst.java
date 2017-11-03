package me.at15.tapl.untyped;

import java.util.List;

public class UntypedAst {
    public static abstract class Node {
    }

    public static class Prog extends Node {
        public final List<Node> terms;

        public Prog(List<Node> terms) {
            this.terms = terms;
        }
    }

    public static class Var extends Node {
        public final String name;

        public Var(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static class Abs extends Node {
        public final Var param;
        public final Node body;

        public Abs(Var param, Node body) {
            this.param = param;
            this.body = body;
        }

        @Override
        public String toString() {
            return String.format("lambda %s %s", param.toString(), body.toString());
        }
    }

    public static class App extends Node {
        // NOTE" we use Node instead of Abs because it can be a var i.e. lambda x. x x
        // see https://github.com/at15/reika/issues/8
        public final Node abs;
        public final Node param;

        public App(Node abs, Node param) {
            this.abs = abs;
            this.param = param;
        }

        // FIXMED: abs can be evaluated further, so it's toString should never be called? No!
        // lambda x. x x, we got x x
        @Override
        public String toString() {
            return String.format("%s %s", abs.toString(), param.toString());
        }
    }
}
