package me.at15.reika.compiler.reporter;

public class Position {
    public int line = -1;
    public int column = -1;
    public int lineEnd = -1;
    public int columnEnd = -1;

    public static Position UNKNOWN = new Position();
    public static Position BUILTIN = new Position();

    public void set(Position pos) {
        this.line = pos.line;
        this.column = pos.column;
        this.lineEnd = pos.lineEnd;
        this.columnEnd = pos.columnEnd;
    }

    public void setStart(Position pos) {
        this.line = pos.line;
        this.column = pos.column;
    }

    public void setEnd(Position pos) {
        this.lineEnd = pos.line;
        this.columnEnd = pos.columnEnd;
    }
}
