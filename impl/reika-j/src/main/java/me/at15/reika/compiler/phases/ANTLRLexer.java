package me.at15.reika.compiler.phases;

public class ANTLRLexer extends Phase {
    public ANTLRLexer(int id) {
        super(id);
    }

    @Override
    public String name() {
        return "antlr-lexer";
    }

    @Override
    public String description() {
        return "run ANLTR generated lexer to tokenize";
    }

    @Override
    public void run() {

    }

    @Override
    public boolean hasError() {
        return false;
    }
}
