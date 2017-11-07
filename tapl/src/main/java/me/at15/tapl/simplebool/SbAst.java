package me.at15.tapl.simplebool;

import java.util.List;

public class SbAst {
    public static abstract class Node {
    }

    public static class Prog extends Node {
        public final List<Node> terms;

        public Prog(List<Node> terms) {
            this.terms = terms;
        }

        // literal
        public static class True extends Node {
        }

        public static class False extends Node {
        }

        public static class Var extends Node {
            // TODO: var might have type i.e. lambda x:Bool. x, we know x is Bool from function declaration
        }

        // function
        public static class Abs extends Node {
            // TODO: we have argument type specified, but it seems we need to infer the type of the body
        }

        // function call
        public static class App extends Node {
            // TODO: we need to get the type of function first
        }

        // control flow
        public static class If extends Node {

        }
    }
}
