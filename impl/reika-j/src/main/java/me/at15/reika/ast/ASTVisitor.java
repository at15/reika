package me.at15.reika.ast;

import me.at15.reika.common.ReikaException;

public interface ASTVisitor<T> {
    T visit(Node n) throws ReikaException;

    T visit(Program n) throws ReikaException;

    T visit(Val.Bool n) throws ReikaException;

    T visit(Val.Int n) throws ReikaException;

    T visit(Val.Double n) throws ReikaException;

    // TODO: do we still need to visit type node?

    T visit(Var n) throws ReikaException;

    T visit(OpUnary n) throws ReikaException;

    T visit(OpBinary n) throws ReikaException;

    T visit(Let n) throws ReikaException;
}
