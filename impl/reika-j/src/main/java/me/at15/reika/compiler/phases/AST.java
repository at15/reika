package me.at15.reika.compiler.phases;

import me.at15.reika.common.Loggable;
import me.at15.reika.common.ReikaInternalException;
import me.at15.reika.compiler.ast.Block;
import me.at15.reika.compiler.ast.Tree;
import me.at15.reika.compiler.ast.UntypedVisitor;
import me.at15.reika.compiler.reporter.Err;
import me.at15.reika.compiler.util.CompilationUnit;

import java.util.List;

public class AST extends Phase implements Loggable {
    public static final String NAME = "ast";
    public static final String DESCRIPTION = "build abstract syntax tree from parse tree";
    private boolean nullParseTree = false;
    private UntypedVisitor builder;

    public AST(int id) {
        super(id, NAME, DESCRIPTION);
        builder = new UntypedVisitor();
    }

    @Override
    public String runsAfter() {
        return ANTLR.NAME;
    }

    @Override
    public void printErrors() {
        logger().warn("print error is not implemented in AST phase");
    }

    @Override
    public boolean canContinue() {
        return false;
    }

    @Override
    public void reset() {
        logger().warn("reset is not implemented in AST phase");
    }

    @Override
    public List<? extends Err> getErrors() {
        // TODO: count errors is not implemented
        return null;
    }

    @Override
    public int countErrors() {
        // TODO: count errors is not implemented
        return 0;
    }

    @Override
    public void setLogToStdout(boolean l) {
        // TODO: pass down to underlying error collector
    }

    @Override
    public void run(CompilationUnit unit) {
        if (unit.parseTree == null) {
            nullParseTree = true;
            return;
        }
        Tree tree = builder.visit(unit.parseTree);
        if (!(tree instanceof Block)) {
            // TODO: might change after we add file, and we should return the real type, maybe the tree node as well ...
            throw new ReikaInternalException("ast builder must return tree of Block type after visiting entire parse tree");
        }
        // TODO: maybe type of unit.tree should be block
        unit.updateTree(tree, id);
    }

    @Override
    public boolean hasError() {
        logger().warn("hasError is not fully implemented in AST phase");
        return nullParseTree;
    }
}
