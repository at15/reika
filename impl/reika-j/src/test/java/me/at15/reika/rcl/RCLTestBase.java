package me.at15.reika.rcl;

import me.at15.reika.rcl.parser.RCLLexer;
import me.at15.reika.rcl.parser.RCLParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import me.at15.reika.TestBase;

import java.io.IOException;

public class RCLTestBase implements TestBase {

    public ParseTree getParseTreeFromResource(String path) throws IOException {
        CharStream charStream = CharStreams.fromStream(readResourceStream(path));
        RCLLexer lexer = new RCLLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        RCLParser parser = new RCLParser(tokenStream);
        return parser.rcl();
    }
}
