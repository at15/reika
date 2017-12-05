package me.at15.reika.compiler.reporter;

public class Position {
    public int line = -1;
    public int column = -1;
    public int lineEnd = -1;
    public int columnEnd = -1;

    public static Position UNKNOWN = new Position();
}
