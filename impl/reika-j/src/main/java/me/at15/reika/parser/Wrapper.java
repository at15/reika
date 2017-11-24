package me.at15.reika.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;

public class Wrapper<P extends Parser, L extends Lexer> {

    private ErrorListener lexerErrorListener;
    private ErrorListener parserErrorListener;
    private P parser;
    private L lexer;

    public Wrapper() {
        lexerErrorListener = new ErrorListener();
        parserErrorListener = new ErrorListener();
    }

    public void wrapParser(P parser) {
        this.parser = parser;
        parser.removeErrorListeners();
        parser.addErrorListener(parserErrorListener);
    }

    public void wrapLexer(L lexer) {
        lexer.removeErrorListeners();
        lexer.addErrorListener(lexerErrorListener);
    }

    public P getParser() {
        return parser;
    }

    public ErrorListener getParseErrorListener() {
        return parserErrorListener;
    }

    public ErrorListener getLexerErrorListener() {
        return lexerErrorListener;
    }

    public boolean hasError() {
        return lexerErrorListener.hasError() || parserErrorListener.hasError();
    }
}
