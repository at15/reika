package me.at15.tapl.untyped;

public class UntypedEvaluator {
    // environment is actually a linked list, following this blog http://www.yinwang.org/blog-cn/2012/08/01/interpreter
    private class Environment {
        private Environment prev;
        private String name;
        private UntypedAst.Node val;

        public Environment() {
            prev = null;
            name = "";
        }

        public Environment(Environment prev, String name, UntypedAst.Node val) {
            this();
            this.prev = prev;
            this.name = name;
            this.val = val;
        }

        public UntypedAst.Node Lookup(String name) {
            if (this.name.equals(name)) {
                return val;
            }
            if (prev == null) {
//                return null;
                // TODO: is this the proper with to deal with free (unbound?) variable
                // i.e. x; in OCaml implementation gives x, but if you have x;; in real OCamel, it yells Unbound value x;
                return new UntypedAst.Var(name);
            }
            return prev.Lookup(name);
        }

        public Environment extend(String name, UntypedAst.Node node) {
            return new Environment(this, name, node);
        }
    }

    public void evalProg(UntypedAst.Prog prog) {
        for (UntypedAst.Node node : prog.terms) {
            System.out.println(eval(node, new Environment()));
        }
    }

    // TODO: we didn't handle renaming
    public Object eval(UntypedAst.Node node, Environment env) {
        if (node instanceof UntypedAst.Var) {
            return env.Lookup(((UntypedAst.Var) node).name);
        } else if (node instanceof UntypedAst.Abs) {
            return node;
        } else if (node instanceof UntypedAst.App) {
            UntypedAst.App app = (UntypedAst.App) node;
            if (!(app.abs instanceof UntypedAst.Abs)) {
                return "left side of app is not abs";
            }
            UntypedAst.Abs abs = (UntypedAst.Abs) app.abs;
            // bind
            Environment newEnv = env.extend(abs.param.name, app.param);
            return eval(abs.body, newEnv);
        } else {
            return "unknown node";
        }
    }
}
