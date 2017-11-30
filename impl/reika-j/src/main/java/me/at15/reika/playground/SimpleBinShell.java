package me.at15.reika.playground;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jline.reader.EndOfFileException;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.reader.UserInterruptException;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import java.io.IOException;

public class SimpleBinShell {
    private AstBuilder astBuilder;
    private final String commandPrefix;
    private LineReader reader;
    private String prompt;

    public SimpleBinShell() throws IOException {
        commandPrefix = ":";
        prompt = "> ";
        Terminal terminal = TerminalBuilder.builder().build();
        reader = LineReaderBuilder.builder().terminal(terminal).build();
        astBuilder = new AstBuilder();
    }

    public String readLine() {
        return reader.readLine(prompt);
    }

    public boolean isSysCommand(String cmd) {
        return cmd.startsWith(commandPrefix);
    }

    public void processCommand(String rawCmd) {
        String cmd = rawCmd.substring(1).trim();
        if (cmd.startsWith("help")) {
            System.out.println("Use Google and StackOverflow, luke");
        } else if (cmd.equals("exit")) {
            throw new EndOfFileException();
        }
    }

    public Node buildAst(String exp) {
        CharStream charStream = CharStreams.fromString(exp);
        SimpleBinLexer lexer = new SimpleBinLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SimpleBinParser parser = new SimpleBinParser(tokenStream);
        ParseTree tree = parser.prog();
        return astBuilder.visit(tree);
    }

    public void process() {
        String line = readLine();
        if (isSysCommand(line)) {
            processCommand(line);
        } else {
            buildAst(line);
        }
    }

    public static void main(String[] args) throws Exception {
        SimpleBinShell shell = new SimpleBinShell();
        System.out.println("SimpleBin shell");
        while (true) {
            try {
                shell.process();
            } catch (UserInterruptException ex) {
                System.out.println("Please use CTRL + D");
            } catch (EndOfFileException ex) {
                System.out.println("bye~");
                return;
            }
        }
    }
}
