package me.at15.reika.compiler;

import com.google.common.io.CharStreams;
import me.at15.reika.common.ReikaException;
import me.at15.reika.compiler.ast.Block;
import me.at15.reika.compiler.ast.Constant;
import me.at15.reika.compiler.ast.Tree;
import me.at15.reika.compiler.phases.Phase;
import me.at15.reika.compiler.reporter.ConsoleReporter;
import me.at15.reika.compiler.setting.CompilerSetting;
import me.at15.reika.compiler.util.CompilationUnit;
import me.at15.reika.compiler.util.SourceFile;
import org.junit.jupiter.api.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @TODO: rename, and plan to support test w/ more language features
 * @TODO: don't print so much error, maybe printSummary?
 */
public class ReikaCompilerTest {
    ReikaCompiler compiler;

    @BeforeEach
    void resetCompiler() {
        compiler = new ReikaCompiler(CompilerSetting.settingForTest(true));
    }

    @Nested
    class Parser {
        Integer phaseId;
        Phase phase;

        @BeforeEach
        void setPhase() {
            phaseId = compiler.getPhaseId("antlr");
            phase = compiler.getPhaseByName("antlr");
            phase.setReporter(new ConsoleReporter(new StringWriter())); // store error report in string
        }

        @Test
        @Tag("fast")
        void compileToParseTree() throws ReikaException {
            CompilationUnit unit = new CompilationUnit(SourceFile.fromResource("primitive/positive_number_only.rka"));
            compiler.compileToPhase(unit, phaseId);
            assertNotNull(unit.parseTree);
        }

        @Test
        @Tag("fast")
        void compileToParseTreeErrors() throws ReikaException, IOException {
            CompilationUnit unit = new CompilationUnit(SourceFile.fromResource("invalid/token.rka"));
            // NOTE: we can log to stdout immediately when encounter error regard less of reporter
            phase.setLogToStdout(true);
            compiler.compileToPhase(unit, phaseId);
            String report = phase.getReporter().toString();
            // TODO: why there is an extra blank line in report
            assertEquals(readResourceText("invalid/token.rka.parser.err"), report);
            // it's an empty parse tree, but not null
            assertNotNull(unit.parseTree);
        }
    }

    @Nested
    class Ast {
        Integer phaseId;

        @BeforeEach
        void setPhase() {
            phaseId = compiler.getPhaseId("ast");
            compiler.getPhaseByName("antlr").setReporter(new ConsoleReporter(new StringWriter()));
        }


        @Test
        @Tag("fast")
        void compileToAst() throws ReikaException {
            CompilationUnit unit = new CompilationUnit(SourceFile.fromResource("primitive/positive_number_only.rka"));
            compiler.compileToPhase(unit, phaseId);
            assertNotNull(unit.parseTree);
            assertNotNull(unit.tree);
            assertTrue(unit.treeInPhases.containsKey(phaseId));
        }

        @Test
        @Tag("fast")
        void negativeNumber() throws ReikaException {
            CompilationUnit unit = new CompilationUnit(SourceFile.fromResource("primitive/number_only.rka"));
            compiler.compileToPhase(unit, phaseId);
            Block tree = (Block) unit.tree;
            Object[] expected = {1, -1, 2.2, -2.2};
            for (int i = 0; i < expected.length; i++) {
                Constant cons = (Constant) tree.trees.get(i);
                assertEquals(expected[i], cons.value);
            }
        }

        @Test
        @Tag("fast")
        void compileToAstErrors() throws ReikaException, IOException {
            CompilationUnit unit = new CompilationUnit(SourceFile.fromResource("invalid/token.rka"));
            compiler.compileToPhase(unit, phaseId);
            String parserErr = compiler.getPhaseByName("antlr").getReporter().toString();
            assertEquals(readResourceText("invalid/token.rka.parser.err"), parserErr);
            // it's an empty parse tree, but not null
            assertNotNull(unit.parseTree);
            assertNotNull(unit.tree);
        }
    }


    @Test
    @Tag("fast")
    void resolveDependencies() {
        List<Integer> antlrPhases = compiler.resolveDependencies(compiler.getPhaseId("antlr"));
        assertEquals(1, antlrPhases.size());
        assertEquals(compiler.getPhaseId("antlr"), antlrPhases.get(0));
        List<Integer> astPhases = compiler.resolveDependencies(compiler.getPhaseId("ast"));
        assertEquals(2, astPhases.size());
        assertEquals(compiler.getPhaseId("antlr"), astPhases.get(0));
        assertEquals(compiler.getPhaseId("ast"), astPhases.get(1));
    }

    private String readResourceText(String path) throws IOException {
        ClassLoader classLoader = ReikaCompilerTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream(path);
        return CharStreams.toString(new InputStreamReader(is, StandardCharsets.UTF_8));
    }
}
