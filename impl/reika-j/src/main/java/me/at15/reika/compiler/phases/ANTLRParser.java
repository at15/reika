package me.at15.reika.compiler.phases;

import me.at15.reika.compiler.util.CompilationUnit;

public class ANTLRParser extends Phase {
    public static final String NAME = "antlr-parser";
    public static final String DESCRIPTION = "run ANTLR generated parser to get parse tree";

    public ANTLRParser(int id) {
        super(id, NAME, DESCRIPTION);
    }

    @Override
    public String runsAfter() {
        return ANTLRLexer.NAME;
    }

    @Override
    public void run(CompilationUnit unit) {

    }

    @Override
    public boolean hasError() {
        return false;
    }

//    @Override
//    public Format inputFormat() {
//        return Format.TEXT;
//    }
//
//    @Override
//    public Format outputFormat() {
//        return Format.PARSE_TREE;
//    }
}
