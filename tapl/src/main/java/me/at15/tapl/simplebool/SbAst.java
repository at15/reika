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
    }

    // type
    public static abstract class Ty extends Node {
    }

    public static class TyBool extends Ty {
        @Override
        public String toString() {
            return "Bool";
        }
    }

    // Bool -> Bool
    public static class TyArr extends Ty {
        public final Ty arg;
        public final Ty res;

        public TyArr(Ty arg, Ty res) {
            this.arg = arg;
            this.res = res;
        }

        @Override
        public String toString() {
            return String.format("(%s -> %s)", arg.toString(), res.toString());
        }
    }

    // literal
    public static class True extends Node {
        @Override
        public String toString() {
            return "true";
        }
    }

    public static class False extends Node {
        @Override
        public String toString() {
            return "false";
        }
    }

    public static class Var extends Node {
        // TODOED: var might have type i.e. lambda x:Bool. x, we know x is Bool from function declaration
        // we can store Bool in AST of Abs and add it to context
        public final String name;

        public Var(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    // function
    public static class Abs extends Node {
        // TODOED: we have argument type specified, but it seems we need to infer the type of the body, leave it to the type checker
        public final Var arg;
        public final Ty argType;
        public final Node body;

        public Abs(Var arg, Ty argType, Node body) {
            this.arg = arg;
            this.argType = argType;
            this.body = body;
        }

        @Override
        public String toString() {
            return String.format("(lambda %s:%s. %s)", arg.toString(), argType.toString(), body.toString());
        }
    }

    // function call
    public static class App extends Node {
        // TODOED: we need to get the type of function first, leave it to the type checker
        public final Node abs;
        public final Node arg;

        public App(Node abs, Node arg) {
            this.abs = abs;
            this.arg = arg;
        }

        @Override
        public String toString() {
            return String.format("%s %s", abs.toString(), arg.toString());
        }
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

        @Override
        public String toString() {
            return String.format("if %s then %s else %s", con.toString(), then.toString(), els.toString());
        }
    }
}
