package me.at15.reika.parser;

public class Wrapper {

    private ErrorListener lexerErrorListener;
    private ErrorListener parserErrorListener;
    private ReikaParser parser;
    private ReikaLexer lexer;

    public Wrapper() {
        this(false);
    }

    public Wrapper(boolean stderrEnabled) {
        lexerErrorListener = new ErrorListener(stderrEnabled);
        parserErrorListener = new ErrorListener(stderrEnabled);
    }

    public void wrapParser(ReikaParser parser) {
        this.parser = parser;
        parser.removeErrorListeners();
        parser.addErrorListener(parserErrorListener);
    }

    public void wrapLexer(ReikaLexer lexer) {
        lexer.removeErrorListeners();
        lexer.addErrorListener(lexerErrorListener);
    }

    public ReikaParser getParser() {
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
