package me.at15.tapl.arith;

import me.at15.tapl.common.ParseErrorListener;
import org.antlr.v4.runtime.TokenStream;

public class ArithParserTracked extends ArithParser {
    private ParseErrorListener parseErrorListener;

    public ArithParserTracked(TokenStream input) {
        super(input);
        // FIXMED: removeErrorListeners does not seems to work, we still see stderr from default listener, it's lexer error
        this.removeErrorListeners();
        parseErrorListener = new ParseErrorListener();
        this.addErrorListener(parseErrorListener);
    }

    public ParseErrorListener getParseErrorListener() {
        return parseErrorListener;
    }
}
