package me.at15.reika.compiler.phases;

import me.at15.reika.compiler.parser.SyntaxErrorListener;
import me.at15.reika.compiler.parser.ReikaLexer;
import me.at15.reika.compiler.parser.ReikaParser;
import me.at15.reika.compiler.parser.SyntaxError;
import me.at15.reika.compiler.util.CompilationUnit;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ANTLR extends Phase {
    public static final String NAME = "antlr";
    public static final String DESCRIPTION = "Tokenize and generate parse tree using ANLTR generated lexer and parser";

    private boolean cantOpenStream = false;
    private boolean nullParseTree = false;
    private SyntaxErrorListener lexerErr;
    private SyntaxErrorListener parserErr;

    public ANTLR(int id) {
        super(id, NAME, DESCRIPTION, true, false);
        lexerErr = new SyntaxErrorListener(true);
        parserErr = new SyntaxErrorListener(false);
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
    public boolean canContinue() {
        if (cantOpenStream || nullParseTree) {
            return false;
        }
        return true;
    }

    @Override
    public void reset() {
        lexerErr.reset();
        parserErr.reset();
    }

    @Override
    public List<SyntaxError> getErrors() {
        return Stream.concat(lexerErr.getErrors().stream(), parserErr.getErrors().stream()).collect(Collectors.toList());
    }

    @Override
    public int countErrors() {
        return lexerErr.countErrors() + parserErr.countErrors();
    }

    @Override
    public void setLogToStdout(boolean l) {
        lexerErr.setLogToStdout(l);
        parserErr.setLogToStdout(l);
    }
}
