package me.at15.reika.compiler.ast;

import me.at15.reika.compiler.reporter.Position;

public class Constant extends Tree {
    public static enum Tag {
        INT, DOUBLE, STRING, BOOL
    }

    public final Object value;
    public final Tag tag;

    public Constant(Position pos, Object value, Tag tag) {
        super(pos);
        this.value = value;
        this.tag = tag;
    }

}
