package me.at15.reika.compiler.reporter;

public abstract class Err implements Positioned {
    public final Position pos;
    public final String msg;

    public Err(Position position, String msg) {
        this.pos = position;
        this.msg = msg;
    }

    public abstract String getType();

    @Override
    public Position getPosition() {
        return pos;
    }

    @Override
    public String toString() {
        return String.format("error:%s at %d:%d %s", getType(), pos.line, pos.column, msg);
    }
}
