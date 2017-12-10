package me.at15.reika.compiler.reporter;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

public abstract class ErrorCollector {
    protected PrintWriter writer;

    public ErrorCollector() {
        this.writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8)));
    }

    public ErrorCollector(PrintWriter writer) {
        this.writer = writer;
    }

    // TODO: add flag for allow printing right away
    // TODO: add warning and error methods
    // TODO: allow print summary

    public abstract void reset();

    public abstract boolean hasError();

    public abstract List<? extends Err> getErrors();

    public final void printErrors() {
//        System.out.println("ErrorCollector need to print errors");
        printErrors(writer);
        // NOTE: need to call writer.flush to see it on console, and might use logger? add LogErrors?
        writer.flush();
    }

    // TODO: it seems we should implement this by default ....
    public abstract void printErrors(PrintWriter writer);
}
