package me.at15.reika.type;

import me.at15.reika.ast.*;
import me.at15.reika.common.ReikaException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Checker implements ASTVisitor<Node> {
    private Map<String, Ty> env;
//    private boolean inplace;

    public Checker() {
        env = new HashMap<>();
//        inplace = false;
    }

    @Override
    public Node visit(Node n) throws ReikaException {
//        throw new ReikaException("Abstract class Node should never be visited");
        return n.accept(this);
    }

    @Override
    public Node visit(Program n) throws ReikaException {
//        if (inplace) {
//            for (Node tm : n.terms) {
//                visit(tm);
//            }
//            return n;
//        }

        List<Node> terms = new ArrayList<>();
        for (Node tm : n.terms) {
            terms.add(visit(tm));
        }
        return new Program(terms);
    }

    @Override
    public Node visit(Val.Bool n) {
        Val.Bool v = new Val.Bool(n.v);
        v.type = new Primitive.Bool();
        return v;
    }

    @Override
    public Node visit(Val.Int n) {
        Val.Int v = new Val.Int(n.v);
        v.type = new Primitive.Int();
        return v;
    }

    @Override
    public Node visit(Val.Double n) {
        Val.Double v = new Val.Double(n.v);
        v.type = new Primitive.Double();
        return v;
    }

    @Override
    public Node visit(Var n) throws ReikaException {
        if (!env.containsKey(n.name)) {
            throw new UnboundTypeException(n.name);
        }
        Var var = new Var(n.name);
        var.type = env.get(n.name);
        return var;
    }

    @Override
    public Node visit(OpUnary n) throws ReikaException {
        Node arg = visit(n.arg);
        switch (n.op) {
            case Not:
                if (arg.type instanceof Primitive.Bool) {
                    break;
                }
                throw new IncompatibleTypeException("unary bool operation got " + arg.type.toString());
            case Negative:
                if (arg.type instanceof Primitive.Int || arg.type instanceof Primitive.Double) {
                    break;
                }
                throw new IncompatibleTypeException("unary numeric operation got " + arg.type.toString());
            default:
                throw new InvalidGrammarException("unknown unary operator");
        }
        OpUnary u = new OpUnary(n.op, arg);
        u.type = arg.type;
        return u;
    }

    @Override
    public Node visit(OpBinary n) throws ReikaException {
        Node l = visit(n.l);
        Node r = visit(n.r);
        // NOTE: we don't have binary op for bool
        if (!l.type.equals(r.type)) {
            throw new IncompatibleTypeException("binary operator has " + l.type.toString() + " and " + r.type.toString());
        }
        OpBinary b = new OpBinary(n.op, l, r);
        b.type = l.type;
        return b;
    }

    @Override
    public Node visit(Let n) throws ReikaException {
        // right hand side
        Node term = visit(n.term);
        // TODO: we should change varType to Ty instead of having a dedicated Type Node? now VarType also type field, which is confusing with v
        if (n.varType.v instanceof Unspecified || n.varType.v.equals(term.type)) {
            env.put(n.var.name, term.type);
            // TODO: is this really needed?
            Var var = new Var(n.var.name);
            var.type = term.type;
            return new Let(var, n.varType, term);
        }
        throw new IncompatibleTypeException("user specified type " + n.varType.v.toString() +
                " but right hand side is " + term.type.toString());
    }
}
