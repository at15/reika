package me.at15.reika.compiler.phases;

public abstract class Phase {
    //    public final int LEXER = 0;
//    public final int P
//    public abstract Format inputFormat();
//
//    public abstract Format outputFormat();
    public final int id;

    public Phase(int id) {
        this.id = id;
    }
}
