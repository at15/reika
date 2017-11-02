package me.at15.tapl.common;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;

public class ParserWrapper<P extends Parser, L extends Lexer> {

    private ParseErrorListener lexerErrorListener;
    private ParseErrorListener parseErrorListener;
    private P parser;

    public ParserWrapper() {
        lexerErrorListener = new ParseErrorListener();
        parseErrorListener = new ParseErrorListener();
    }

    public void wrapParser(P parser) {
        this.parser = parser;
        parser.removeErrorListeners();
        parser.addErrorListener(parseErrorListener);
    }

    public void wrapLexer(L lexer) {
        lexer.removeErrorListeners();
        lexer.addErrorListener(lexerErrorListener);
    }

    public P getParser() {
        return parser;
    }

    public ParseErrorListener getParseErrorListener() {
        return parseErrorListener;
    }

    public ParseErrorListener getLexerErrorListener() {
        return lexerErrorListener;
    }

    public boolean hasError() {
        return lexerErrorListener.hasError() || parseErrorListener.hasError();
    }

}
