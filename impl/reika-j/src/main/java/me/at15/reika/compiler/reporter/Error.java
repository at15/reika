package me.at15.reika.compiler.reporter;

public abstract class Error implements Positioned {
    public final Position pos;
    public final String msg;

    public Error(Position position, String msg) {
        this.pos = position;
        this.msg = msg;
    }

    public abstract String type();

    @Override
    public Position getPosition() {
        return pos;
    }

    @Override
    public String toString() {
        return String.format("%s error at %d:%d %s", pos.line, pos.column, msg);
    }
}
