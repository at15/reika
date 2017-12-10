package me.at15.reika.compiler.reporter;

import java.util.List;

public interface ErrorCollector {
    // TODO: add flag for allow printing right away
    // TODO: add warning and error methods
    // TODO: allow print summary

    void reset();

    boolean hasError();

    List<? extends Err> getErrors();

    int countErrors();

//    public final void printErrors() {
////        System.out.println("ErrorCollector need to print errors");
//        printErrors(writer);
//        // NOTE: need to call writer.flush to see it on console, and might use logger? add LogErrors?
//        writer.flush();
//    }
//
//    // TODO: it seems we should implement this by default ....
//    public abstract void printErrors(PrintWriter writer);
}
