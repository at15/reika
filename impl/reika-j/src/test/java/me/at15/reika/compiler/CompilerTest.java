package me.at15.reika.compiler;

import me.at15.reika.common.ReikaException;
import me.at15.reika.compiler.util.CompilationUnit;
import me.at15.reika.compiler.util.SourceFile;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @TODO update compiler before each run instead of copy and paste
 */
public class CompilerTest {

    @Test
    @Tag("fast")
    void compileToParseTree() throws ReikaException {
        Compiler compiler = new Compiler();
        CompilationUnit unit = new CompilationUnit(SourceFile.fromResource("primitive/positive_number_only.rka"));
        compiler.compileToPhase(unit, compiler.getPhaseId("antlr"));
        assertNotNull(unit.parseTree);
    }

    @Test
    @Tag("fast")
    void compileToParseTreeErrors() throws ReikaException {
        Compiler compiler = new Compiler();
        CompilationUnit unit = new CompilationUnit(SourceFile.fromResource("invalid/token.rka"));
        compiler.compileToPhase(unit, compiler.getPhaseId("antlr"));
        // it's an empty parse tree, but not null
        assertNotNull(unit.parseTree);
    }

    @Test
    @Tag("fast")
    void compileToAst() throws ReikaException {
        Compiler compiler = new Compiler();
        CompilationUnit unit = new CompilationUnit(SourceFile.fromResource("primitive/positive_number_only.rka"));
        compiler.compileToPhase(unit, compiler.getPhaseId("ast"));
        assertNotNull(unit.parseTree);
        assertNotNull(unit.tree);
        assertTrue(unit.treeInPhases.containsKey(compiler.getPhaseId("ast")));
    }

    @Test
    @Tag("fast")
    void compileToAstErrors() throws ReikaException {
        Compiler compiler = new Compiler();
        CompilationUnit unit = new CompilationUnit(SourceFile.fromResource("invalid/token.rka"));
        compiler.compileToPhase(unit, compiler.getPhaseId("ast"));
        // it's an empty parse tree, but not null
        assertNotNull(unit.parseTree);
        assertNotNull(unit.tree);
    }

    @Test
    @Tag("fast")
    void resolveDependencies() throws ReikaException {
        Compiler compiler = new Compiler();
        List<Integer> antlrPhases = compiler.resolveDependencies(compiler.getPhaseId("antlr"));
        assertEquals(1, antlrPhases.size());
        assertEquals(compiler.getPhaseId("antlr"), antlrPhases.get(0));
        List<Integer> astPhases = compiler.resolveDependencies(compiler.getPhaseId("ast"));
        assertEquals(2, astPhases.size());
        assertEquals(compiler.getPhaseId("antlr"), astPhases.get(0));
        assertEquals(compiler.getPhaseId("ast"), astPhases.get(1));
    }
}
