package me.at15.reika.compiler.phases;

import me.at15.reika.compiler.util.CompilationUnit;

public class AST extends Phase {
    public static final String NAME = "ast";
    public static final String DESCRIPTION = "build abstract syntax tree from parse tree";

    public AST(int id) {
        super(id, NAME, DESCRIPTION);
    }

    @Override
    public String runsAfter() {
        return ANTLRParser.NAME;
    }

    @Override
    public void run(CompilationUnit unit) {

    }

    @Override
    public boolean hasError() {
        return false;
    }
}
