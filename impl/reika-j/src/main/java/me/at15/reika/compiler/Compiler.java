package me.at15.reika.compiler;

import me.at15.reika.compiler.phases.ANTLR;
import me.at15.reika.compiler.phases.AST;
import me.at15.reika.compiler.phases.Phase;
import me.at15.reika.compiler.util.CompilationUnit;

import java.util.LinkedHashMap;
import java.util.List;

public class Compiler {
    private int runId = 0;
    private int phaseId = 0;
    private int globalPhaseId = 1;
    private LinkedHashMap<Integer, Phase> phases;

    public Compiler() {
        phases = new LinkedHashMap<>(5);
        addPhase(new ANTLR(globalPhaseId));
        addPhase(new AST(globalPhaseId));
    }

    public void compileToPhase(CompilationUnit unit, int phaseId) {
        if (unit.phaseId == phaseId) {
            return;
        }

    }

    public void compilePhases(CompilationUnit unit, List<Integer> phases) {

    }

    public void printPhases() {
        System.out.println("id\tname\t\tdescription");
        phases.forEach((id, phase) -> {
            System.out.printf("%d  %-12s %s\n", id, phase.name, phase.description);
        });
    }

    private void addPhase(Phase phase) {
        phases.put(globalPhaseId, phase);
        globalPhaseId++;
    }
}
