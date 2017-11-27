package me.at15.reika.ast;

import me.at15.reika.common.ReikaException;
import me.at15.reika.type.Ty;

public abstract class Node {
    public Ty type;

//    public <T> T accept(ASTVisitor<? extends T> visitor) throws ReikaException {
//        return visitor.visit(this);
//    }

    public abstract <T> T accept(ASTVisitor<? extends T> visitor) throws ReikaException;
    //    public abstract void NodeType();
}
