package me.at15.reika.compiler.reporter;

import java.util.List;

public interface ErrorCollector {
    // TODO: allow print summary

    void setLogToStdout(boolean l);

    void reset();

    boolean hasError();

    List<? extends Err> getErrors();

    int countErrors();
}
