package me.at15.reika.compiler.phases;

public class ANTLRParser extends Phase {
    public ANTLRParser(int id) {
        super(id);
    }

    @Override
    public String name() {
        return "antlr-parser";
    }

    @Override
    public String description() {
        return "run ANTLR generated parser to get parse tree";
    }

    @Override
    public void run() {

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
