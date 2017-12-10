package me.at15.reika.compiler.parser;

import me.at15.reika.compiler.reporter.Err;
import me.at15.reika.compiler.reporter.Position;

public class SyntaxError extends Err {
    public static final String TYPE = "syntax";
    public final boolean lexer;

    // TODO: we have start location, can we have end location when we get error from ANTLR ?
    public SyntaxError(Position position, String msg, boolean lexer) {
        super(position, msg);
        this.lexer = lexer;
    }

    public static SyntaxError create(int line, int charPos, String msg, boolean lexer) {
        Position pos = new Position();
        pos.line = line;
        pos.column = charPos;
        return new SyntaxError(pos, msg, lexer);
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public String toString() {
        if (lexer) {
            return String.format("error:lexer at %d:%d %s", pos.line, pos.column, msg);
        } else {
            return String.format("error:parser at %d:%d %s", pos.line, pos.column, msg);
        }
    }
}
