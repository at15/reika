package me.at15.tapl.untyped;

import java.util.HashMap;
import java.util.Map;

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

    public Object eval(UntypedAst.Node node, Environment env) {
        if (node instanceof UntypedAst.Var) {
            return node;
        } else if (node instanceof UntypedAst.Abs) {
            return node;
        } else if (node instanceof UntypedAst.App) {
            UntypedAst.App app = (UntypedAst.App) node;
//            Environment newEnv = env.extend(app.param.)
            return "TODO";
        } else {
            return "unknown node";
        }
    }
}
