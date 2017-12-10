package me.at15.reika.compiler;

import me.at15.reika.common.ReikaException;
import me.at15.reika.compiler.setting.CompilerSetting;
import me.at15.reika.compiler.util.CompilationUnit;
import me.at15.reika.compiler.util.SourceFile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

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
        Integer phase;

        @BeforeEach
        void setPhase() {
            phase = compiler.getPhaseId("antlr");
        }

        @Test
        @Tag("fast")
        void compileToParseTree() throws ReikaException {
            CompilationUnit unit = new CompilationUnit(SourceFile.fromResource("primitive/positive_number_only.rka"));
            compiler.compileToPhase(unit, phase);
            assertNotNull(unit.parseTree);
        }

        @Test
        @Tag("fast")
        void compileToParseTreeErrors() throws ReikaException {
            CompilationUnit unit = new CompilationUnit(SourceFile.fromResource("invalid/token.rka"));
            compiler.compileToPhase(unit, phase);
            // it's an empty parse tree, but not null
            assertNotNull(unit.parseTree);
        }
    }

    @Nested
    class Ast {
        Integer phase;

        @BeforeEach
        void setPhase() {
            phase = compiler.getPhaseId("ast");
        }


        @Test
        @Tag("fast")
        void compileToAst() throws ReikaException {
            CompilationUnit unit = new CompilationUnit(SourceFile.fromResource("primitive/positive_number_only.rka"));
            compiler.compileToPhase(unit, phase);
            assertNotNull(unit.parseTree);
            assertNotNull(unit.tree);
            assertTrue(unit.treeInPhases.containsKey(phase));
        }

        @Test
        @Tag("fast")
        void compileToAstErrors() throws ReikaException {
            CompilationUnit unit = new CompilationUnit(SourceFile.fromResource("invalid/token.rka"));
            compiler.compileToPhase(unit, phase);
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
}
