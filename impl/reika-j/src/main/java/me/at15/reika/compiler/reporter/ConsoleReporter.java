package me.at15.reika.compiler.reporter;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class ConsoleReporter implements Reporter {
    private PrintWriter writer;

    public ConsoleReporter() {
        // TODO: allow disable buffer?
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8)));
    }

    @Override
    public void info(Position pos, String msg) {

    }

    @Override
    public void warn(Position pos, String msg) {

    }

    @Override
    public void error(Position pos, String msg) {

    }

    @Override
    public void errors(List<? extends Err> errors) {
        for (Err err : errors) {
            writer.println(err.toString());
        }
    }

    @Override
    public void flush() {
        writer.flush();
    }

    @Override
    public void finish() {
        // TODO: print summary?
    }

    private void log(Severity severity, Position pos, String msg) {

    }
}
