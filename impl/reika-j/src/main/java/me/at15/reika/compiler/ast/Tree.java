package me.at15.reika.compiler.ast;

import me.at15.reika.compiler.reporter.Position;
import me.at15.reika.compiler.reporter.Positioned;

public abstract class Tree implements Positioned {
    public Position pos;

    public Tree(Position pos) {
        this.pos = pos;
    }

    @Override
    public Position getPosition() {
        return pos;
    }
}
