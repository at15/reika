package me.at15.reika.compiler;

import me.at15.reika.common.Loggable;
import me.at15.reika.common.ReikaException;
import me.at15.reika.common.ReikaInternalException;
import me.at15.reika.compiler.phases.ANTLR;
import me.at15.reika.compiler.phases.AST;
import me.at15.reika.compiler.phases.Phase;
import me.at15.reika.compiler.setting.CompilerSetting;
import me.at15.reika.compiler.util.CompilationUnit;

import java.util.*;

public class ReikaCompiler implements Loggable {
    private CompilerSetting setting;
    private int runId = 0;
    private int globalPhaseId = 1;
    protected LinkedHashMap<Integer, Phase> phases;
    private Map<String, Integer> phaseName2Id;

    public ReikaCompiler(CompilerSetting setting) {
        this.setting = setting;
        phases = new LinkedHashMap<>(5);
        phaseName2Id = new HashMap<>(5);
        addPhase(new ANTLR(globalPhaseId));
        addPhase(new AST(globalPhaseId));
    }

    public void compileToPhase(CompilationUnit unit, int phaseId) throws ReikaException {
        if (unit.phaseId == phaseId) {
            return;
        }
        List<Integer> phasesToRun = resolveDependencies(phaseId);
        compilePhases(unit, phasesToRun);
    }

    public void compilePhases(CompilationUnit unit, List<Integer> phases) throws ReikaException {
        for (Integer id : phases) {
            Phase phase = this.phases.get(id);
            phase.reset();
            phase.run(unit);
            if (phase.hasError()) {
                logger().warn(String.format("%s found %d errors in phase %s", unit.getPath(), phase.countErrors(), getPhaseName(id)));
                phase.printErrors();
                // TODO: might just print error? or return something to indicate error
                if (!phase.canContinue()) {
                    throw new ReikaException(String.format("%s stop at phase %s", unit.getPath(), getPhaseName(id)));
                }
                logger().debug(String.format("%s tolerate error in phase %s", unit.getPath(), getPhaseName(id)));
            }
        }
    }

    public void printPhases() {
        // TODO: do we really need phase id?
        System.out.println("id name  description");
        phases.forEach((id, phase) -> {
            System.out.printf("%d  %-5s %s\n", id, phase.name, phase.description);
        });
    }

    public Integer getPhaseId(String name) {
        if (!phaseName2Id.containsKey(name)) {
            throw new ReikaInternalException("phases map does not contains phase with name " + name);
        }
        return phaseName2Id.get(name);
    }

    public String getPhaseName(Integer id) {
        if (!phases.containsKey(id)) {
            throw new ReikaInternalException("phases map does not contains phase with id " + id);
        }
        return phases.get(id).name;
    }

    public Phase getPhaseByName(String name) {
        return phases.get(getPhaseId(name));
    }

    protected void addPhase(Phase phase) {
        phases.put(globalPhaseId, phase);
        phaseName2Id.put(phase.name, globalPhaseId);
        globalPhaseId++;
    }

    /**
     * Return dependencies including itself, from first to last in expected execution order
     * i.e. phaseId = typePhaseId, return antlr -> ast -> type
     *
     * @param phaseId
     * @return
     */
    protected List<Integer> resolveDependencies(Integer phaseId) {
        List<Integer> dependencies = new ArrayList<>();
        while (true) {
            if (!phases.containsKey(phaseId)) {
                throw new ReikaInternalException("phase id " + phaseId + " not found");
            }
            Phase phase = phases.get(phaseId);
            dependencies.add(phase.id);
            if (phase.isStart) {
                break;
            }
            if (!phaseName2Id.containsKey(phase.runsAfter())) {
                throw new ReikaInternalException("phase name " + phase.runsAfter() + " not found");
            }
            phaseId = phaseName2Id.get(phase.runsAfter());
        }
        Collections.reverse(dependencies);
        return dependencies;
    }
}
