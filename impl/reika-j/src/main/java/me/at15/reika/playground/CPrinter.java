package me.at15.reika.playground;

public class CPrinter implements Visitor<String> {
    @Override
    public String visit(Node n) {
        return n.accept(this);
    }

    @Override
    public String visit(Node.Prog n) {
        StringBuilder sb = new StringBuilder();
        sb.append("#include <stdio.h>\n#include <stdbool.h>\n\nint main(){\n");
        for (Node tm : n.terms) {
            sb.append("  ");
            sb.append(visit(tm));
           sb.append("\n");
        }
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public String visit(Node.Int n) {
        return String.valueOf(n.val);
    }

    @Override
    public String visit(Node.Bool n) {
        return String.valueOf(n.val);
    }

    @Override
    public String visit(Node.BinOp n) {
        String l = visit(n.l);
        String r = visit(n.r);
        if ((l.contains("true") || l.contains("false")) &&
                r.contains("true") || r.contains("false")) {
            return String.format("if (%s %s %s) {\n printf(\"true\\n\"); \n} else {\n printf(\"false\\n\"); \n}", l, n.op, r);
        }
        // return String.format("printf(\"\\%d\", %s %s %s);\\n", l, n.op, r);
        return "printf(\"%d\\n\"," + l + n.op + r + ");";
    }
}
