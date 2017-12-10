package me.at15.reika.compiler.phases;

import me.at15.reika.compiler.reporter.ConsoleReporter;
import me.at15.reika.compiler.reporter.Err;
import me.at15.reika.compiler.reporter.ErrorCollector;
import me.at15.reika.compiler.reporter.Reporter;
import me.at15.reika.compiler.util.CompilationUnit;

import java.util.List;

public abstract class Phase implements ErrorCollector {
    //    public final int P
//    public abstract Format inputFormat();
//
//    public abstract Format outputFormat();
    public final int id;
    public final String name;
    public final String description;
    public final boolean isStart;
    public final boolean isTerminal;
    private Reporter reporter;

    public Phase(int id, String name, String description) {
        this(id, name, description, false, false);
    }

    public Phase(int id, String name, String description, boolean isStart, boolean isTerminal) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.isStart = isStart;
        this.isTerminal = isTerminal;
        this.reporter = new ConsoleReporter();
    }

    public abstract String runsAfter();

    public abstract void run(CompilationUnit unit);

    public void printErrors() {
        reporter.errors(getErrors());
        reporter.flush();
    }

    public abstract boolean canContinue();

}
