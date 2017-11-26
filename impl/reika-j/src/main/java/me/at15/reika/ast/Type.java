package me.at15.reika.ast;

import me.at15.reika.type.Ty;

public class Type extends Node {
    public final Ty v;

    public Type(Ty v) {
        this.v = v;
    }
}
