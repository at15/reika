package me.at15.reika.compiler.util;

import me.at15.reika.compiler.ast.Tree;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Map;

public class CompilationUnit {
    public SourceFile source;
    public int phaseId;
    public ParseTree parseTree;
    public Tree tree;
    // tree in different phases
    // TODO: use linked list instead of map, how about different run? (too complex for now ...)
    public Map<Integer, Tree> trees;
    // TODO: symbol, scope in different phases
}
