package me.at15.reika.compiler.phases;

import me.at15.reika.compiler.parser.ErrorListener;
import me.at15.reika.compiler.parser.ReikaLexer;
import me.at15.reika.compiler.parser.ReikaParser;
import me.at15.reika.compiler.util.CompilationUnit;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;

public class ANTLR extends Phase {
    public static final String NAME = "antlr";
    public static final String DESCRIPTION = "Tokenize and generate parse tree using ANLTR generated lexer and parser";

    private boolean cantOpenStream = false;
    private boolean nullParseTree = false;
    private ErrorListener lexerErr;
    private ErrorListener parserErr;

    public ANTLR(int id) {
        super(id, NAME, DESCRIPTION, true, false);
        lexerErr = new ErrorListener(true);
        parserErr = new ErrorListener(false);
    }

    @Override
    public String runsAfter() {
        return null;
    }

    @Override
    public void run(CompilationUnit unit) {
        reset();
        InputStream is = unit.source.getStream();
        try {
            CharStream charStream = CharStreams.fromStream(is);
            ReikaLexer lexer = new ReikaLexer(charStream);
            lexer.removeErrorListeners();
            lexer.addErrorListener(lexerErr);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ReikaParser parser = new ReikaParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(parserErr);
            ParseTree tree = parser.prog();
            if (tree == null) {
                nullParseTree = true;
            } else {
                unit.parseTree = tree;
            }
        } catch (IOException ex) {
            cantOpenStream = true;
        }
    }

    @Override
    public boolean hasError() {
        if (cantOpenStream || nullParseTree ||
                lexerErr.hasError() || parserErr.hasError()) {
            return true;
        }
        return false;
    }

    @Override
    public void printError() {
        if (lexerErr.hasError()) {
            lexerErr.printErrors();
        }
        if (parserErr.hasError()) {
            parserErr.printErrors();
        }
    }

    @Override
    public boolean canContinue() {
        if (cantOpenStream || nullParseTree) {
            return false;
        }
        return true;
    }

    @Override
    public void reset() {
        this.lexerErr.reset();
        this.parserErr.reset();
    }
}
