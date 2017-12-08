package me.at15.reika.compiler.util;

import me.at15.reika.common.Loggable;
import me.at15.reika.compiler.ast.Tree;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.Map;

public class CompilationUnit implements Loggable {
    public SourceFile source;
    public int phaseId = 0;
    public ParseTree parseTree;
    // TODO: maybe type of unit.tree should be block
    public Tree tree;
    // tree in different phases
    // TODO: use linked list instead of map, how about different run? (too complex for now ...)
    public Map<Integer, Tree> treeInPhases;
    // TODO: symbol, scope in different phases

    public CompilationUnit(SourceFile source) {
        this.source = source;
        this.treeInPhases = new HashMap<>();
    }

    public void updateTree(Tree tree, int phaseId) {
        treeInPhases.put(phaseId, tree);
        if (phaseId > this.phaseId) {
            this.phaseId = phaseId;
            this.tree = tree;
        }
    }

}
