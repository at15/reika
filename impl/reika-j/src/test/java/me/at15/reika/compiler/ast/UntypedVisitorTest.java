package me.at15.reika.compiler.ast;

import me.at15.reika.common.ReikaException;
import me.at15.reika.compiler.ReikaCompiler;
import me.at15.reika.compiler.TestBase;
import me.at15.reika.compiler.phases.Phase;
import me.at15.reika.compiler.reporter.ConsoleReporter;
import me.at15.reika.compiler.setting.CompilerSetting;
import me.at15.reika.compiler.util.CompilationUnit;
import me.at15.reika.compiler.util.SourceFile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.*;

@Tag("fast")
public class UntypedVisitorTest implements TestBase {
    ReikaCompiler compiler;
    Integer phaseId;
    Phase phase;

    @BeforeEach
    void resetCompiler() {
        compiler = new ReikaCompiler(CompilerSetting.settingForTest(true));
        phaseId = compiler.getPhaseId("ast");
        phase = compiler.getPhaseByName("ast");
        phase.setReporter(new ConsoleReporter());
    }

    @Test
    void invalidNumber() throws ReikaException, IOException {
        CompilationUnit unit = new CompilationUnit(SourceFile.fromResource("invalid/number.rka"));
        phase.setReporter(new ConsoleReporter(new StringWriter()));
        compiler.compileToPhase(unit, phaseId);
        String astErr = phase.getReporter().toString();
        assertEquals(readResourceText("invalid/number.rka.ast.err"), astErr);
    }
}
