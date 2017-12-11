package me.at15.reika.compiler.ast;

import me.at15.reika.compiler.reporter.ErrorCollector;

import java.util.ArrayList;
import java.util.List;

public class AstErrorListener implements ErrorCollector {
    private List<AstError> errors;
    private boolean log2Stdout = false;

    public AstErrorListener() {
        this.errors = new ArrayList<>();
    }

    public void add(AstError err) {
        if (log2Stdout) {
            System.out.println(err.toString());
        }
        errors.add(err);
    }

    @Override
    public void setLogToStdout(boolean l) {
        log2Stdout = l;
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
    public List<AstError> getErrors() {
        return errors;
    }

    @Override
    public int countErrors() {
        return errors.size();
    }
}
