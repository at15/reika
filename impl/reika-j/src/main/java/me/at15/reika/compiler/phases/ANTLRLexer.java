package me.at15.reika.compiler.phases;

import me.at15.reika.compiler.parser.ErrorListener;
import me.at15.reika.compiler.parser.ReikaLexer;
import me.at15.reika.compiler.util.CompilationUnit;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.IOException;
import java.io.InputStream;

public class ANTLRLexer extends Phase {
    public static final String NAME = "antlr-lexer";
    public static final String DESCRIPTION = "run ANLTR generated lexer to tokenize";

    public ANTLRLexer(int id) {
        super(id, NAME, DESCRIPTION, true, false);
    }

    @Override
    public String runsAfter() {
        return null;
    }

    @Override
    public void run(CompilationUnit unit) {
        InputStream is = unit.source.getStream();

        try {
            CharStream charStream = CharStreams.fromStream(is);
            ReikaLexer lexer = new ReikaLexer(charStream);
            lexer.removeErrorListeners();
            ErrorListener listener = new ErrorListener();
            lexer.addErrorListener(listener);
        } catch (IOException ex) {
            // TODO: report error, and return hasError to true
        }

    }

    @Override
    public boolean hasError() {
        return false;
    }
}
