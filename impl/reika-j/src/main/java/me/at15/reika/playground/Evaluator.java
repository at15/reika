package me.at15.reika.playground;

public class Evaluator implements Visitor<Object> {
    @Override
    public Object visit(Node n) {
        return n.accept(this);
    }

    @Override
    public Object visit(Node.Prog n) {
        Object res = null;
        for (Node tm : n.terms) {
            res = visit(tm);
            System.out.println(res);
        }
        return res;
    }

    @Override
    public Object visit(Node.Int n) {
        return n.val;
    }

    @Override
    public Object visit(Node.Bool n) {
        return n.val;
    }

    @Override
    public Object visit(Node.BinOp n) {
        Object l = visit(n.l);
        Object r = visit(n.r);
        if (l == null || r == null) {
            System.out.println("eval result contains null");
        } else if ("+".equals(n.op) || "-".equals(n.op)) {
            if (l instanceof Integer && r instanceof Integer) {
                return "+".equals(n.op) ? (int) l + (int) r : (int) l - (int) r;
            }
            System.out.println("invalid add");
        } else if ("&&".equals(n.op)) {
            if (l instanceof Boolean && r instanceof Boolean) {
                return "&&".equals(n.op) ? (boolean) l && (boolean) r : (boolean) l || (boolean) r;
            }
        }
        return null;
    }
}
