package me.at15.reika.compiler.phases;

import me.at15.reika.compiler.util.CompilationUnit;

public abstract class Phase {
    //    public final int P
//    public abstract Format inputFormat();
//
//    public abstract Format outputFormat();
    public final int id;
    public final String name;
    public final String description;
    public final boolean isStart;
    public final boolean isTerminal;

    public Phase(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        isStart = false;
        isTerminal = false;
    }

    public Phase(int id, String name, String description, boolean isStart, boolean isTerminal) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.isStart = isStart;
        this.isTerminal = isTerminal;
    }

    public abstract String runsAfter();

    public abstract void run(CompilationUnit unit);

    public abstract boolean hasError();

    public abstract void printError();

    public abstract boolean canContinue();

    public abstract void reset();
}
