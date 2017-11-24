package me.at15.reika.parser;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.List;

/**
 * keep track of parse error instead of just log to stderr
 * copied from old reika https://github.com/xephonhq/tsdb-proxy-java/issues/5
 */
public class ErrorListener extends BaseErrorListener {
    private List<SyntaxError> errors;
    private boolean stderrEnabled;

    public ErrorListener() {
        errors = new ArrayList<>();
        stderrEnabled = false;
    }

    public ErrorListener(boolean stderrEnabled) {
        this();
        this.stderrEnabled = stderrEnabled;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        if (stderrEnabled) {
            // default behaviour of ANTLR error listener is log to stderr
            System.err.printf("line %d:%d %s", line, charPositionInLine, msg);
        }
        errors.add(new SyntaxError(line, charPositionInLine, msg));
    }

    public boolean hasError() {
        return errors.size() > 0;
    }

    public void enableStderr() {
        stderrEnabled = true;
    }

    public void disableStderr() {
        stderrEnabled = false;
    }

    public void printErrors() {
        System.out.printf("\u001b[91mERROR\u001b[0m: %d syntax errors\n", errors.size());
        for (SyntaxError error : errors) {
            System.out.println(error);
        }
    }
}
