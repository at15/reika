package me.at15.reika.compiler.parser;

import me.at15.reika.compiler.reporter.ErrorCollector;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/**
 * keep track of parse error instead of just log to stderr
 * based on old reika https://github.com/xephonhq/tsdb-proxy-java/issues/5
 */
public class ErrorListener extends ErrorCollector implements ANTLRErrorListener {
    private List<SyntaxError> errors;
    private final boolean lexer; // either a lexer or parser

    public ErrorListener(boolean lexer) {
        this.lexer = lexer;
        errors = new ArrayList<>();
    }


    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        // default behaviour of ANTLR error listener is log to stderr
//            System.err.printf("line %d:%d %s\n", line, charPositionInLine, msg);
        errors.add(SyntaxError.create(line, charPositionInLine, msg, lexer));
    }

    // TODO: it seems we only encountered syntaxError so far, maybe because we didn't embed any code into grammar
    // so we simply ignore those three, and put empty method as BaseErrorListener did
    @Override
    public void reportAmbiguity(Parser recognizer,
                                DFA dfa,
                                int startIndex,
                                int stopIndex,
                                boolean exact,
                                BitSet ambigAlts,
                                ATNConfigSet configs) {
    }

    @Override
    public void reportAttemptingFullContext(Parser recognizer,
                                            DFA dfa,
                                            int startIndex,
                                            int stopIndex,
                                            BitSet conflictingAlts,
                                            ATNConfigSet configs) {
    }

    @Override
    public void reportContextSensitivity(Parser recognizer,
                                         DFA dfa,
                                         int startIndex,
                                         int stopIndex,
                                         int prediction,
                                         ATNConfigSet configs) {
    }

    @Override
    public void reset() {
        errors.clear();
    }

    @Override
    public boolean hasError() {
        return errors.size() > 0;
    }

    @Override
    public List<SyntaxError> getErrors() {
        return errors;
    }

    @Override
    public void printErrors(PrintWriter writer) {
        writer.printf("\u001b[91mERROR\u001b[0m: %d syntax errors\n", errors.size());
        for (SyntaxError error : errors) {
            writer.println(error);
        }
    }
}