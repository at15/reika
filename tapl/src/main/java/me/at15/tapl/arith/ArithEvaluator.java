package me.at15.tapl.arith;

public class ArithEvaluator {
    public ArithEvaluator() {
        // nothing to initialize, we don't have type, don't have store
    }

    public void evalProg(ArithAst.Prog prog) {
        for (ArithAst.Node node : prog.terms) {
            System.out.println(eval(node));
        }
    }

    public Object eval(ArithAst.Node node) {
        if (node instanceof ArithAst.True) {
            return true;
        } else if (node instanceof ArithAst.False) {
            return false;
        } else if (node instanceof ArithAst.Zero) {
            return 0;
        } else if (node instanceof ArithAst.Succ) {
            return (Integer) eval(((ArithAst.Succ) node).params) + 1;
        } else if (node instanceof ArithAst.Pred) {
            // NOTE: this is to keep the output consistent w/ OCaml implementation, pred 0 is still 0
            Integer v = (Integer) eval(((ArithAst.Pred) node).params);
            return v == 0 ? 0 : v - 1;
        } else if (node instanceof ArithAst.IsZero) {
            return (Integer) eval(((ArithAst.IsZero) node).params) == 0;
        } else if (node instanceof ArithAst.If) {
            Boolean con = (Boolean) eval(((ArithAst.If) node).con);
            if (con) {
                return eval(((ArithAst.If) node).then);
            } else {
                return eval(((ArithAst.If) node).els);
            }
        } else {
            return "unknown node";
        }
    }
}
