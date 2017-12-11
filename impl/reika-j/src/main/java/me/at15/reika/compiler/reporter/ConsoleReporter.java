package me.at15.reika.compiler.reporter;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class ConsoleReporter implements Reporter {
    private Writer originalWriter;
    private PrintWriter writer;

    public ConsoleReporter() {
        // TODO: allow disable buffer?
        originalWriter = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8));
        writer = new PrintWriter(originalWriter);
    }

    public ConsoleReporter(Writer writer) {
        originalWriter = writer;
        this.writer = new PrintWriter(originalWriter);
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

    @Override
    public String toString() {
        return originalWriter.toString();
    }
}
