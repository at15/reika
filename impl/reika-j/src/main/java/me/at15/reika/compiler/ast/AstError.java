package me.at15.reika.compiler.ast;

import me.at15.reika.compiler.reporter.Err;
import me.at15.reika.compiler.reporter.Position;

public class AstError extends Err {
    public static final String TYPE = "ast";

    public AstError(Position pos, String msg) {
        super(pos, msg);
    }

    @Override
    public String getType() {
        return TYPE;
    }
}
