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
    }

    public static class Abs extends Node {
        public final Node param;
        public final Node body;

        public Abs(Node param, Node body) {
            this.param = param;
            this.body = body;
        }
    }

    public static class App extends Node {
        public final Node abs;
        public final Node param;

        public App(Node abs, Node param) {
            this.abs = abs;
            this.param = param;
        }
    }
}
