package me.at15.reika.compiler.ast;

import me.at15.reika.compiler.namer.Symbol;
import me.at15.reika.compiler.reporter.Position;

public class Ident extends Tree {
    public final String name;
    public boolean isType;
    public Symbol symbol;

    public Ident(Position pos, String name) {
        super(pos);
        this.name = name;
    }
}
