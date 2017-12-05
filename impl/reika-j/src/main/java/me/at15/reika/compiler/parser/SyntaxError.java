package me.at15.reika.compiler.parser;

// TODO: extends or implement a common class/interface for all compiler errors, like Locatable/Positioned
public class SyntaxError {
    public final int line;
    public final int charPos;
    public final String msg;

    public SyntaxError(int line, int charPos, String msg) {
        this.line = line;
        this.charPos = charPos;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return String.format("line %d:%d %s", line, charPos, msg);
    }
}