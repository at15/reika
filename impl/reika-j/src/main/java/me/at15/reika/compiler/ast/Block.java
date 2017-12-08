package me.at15.reika.compiler.ast;

import me.at15.reika.compiler.reporter.Position;

import java.util.List;

/**
 * i.e. prog rule is a block, TODO: what should be the semantic of block, return last value, print it in repl?
 */
public class Block extends Tree {
    public final List<Tree> trees;

    public Block(Position pos, List<Tree> trees) {
        super(pos);
        this.trees = trees;
    }
}
