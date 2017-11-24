package me.at15.reika.ast;

import me.at15.reika.common.ReikaRuntimeException;

/**
 * the parse tree built from ANTLR4 grammar file has some new features (operators etc.) not supported by AST
 *
 * @NOTE: in order to override base visitor, we can't throw checked exception
 */
public class InvalidGrammarException extends ReikaRuntimeException {
    public InvalidGrammarException(String s) {
        super(s);
    }
}
