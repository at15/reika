package me.at15.reika.compiler;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;

public class Reikac {
    private JCommander commander;
    private Compiler compiler;

    @Parameter(names = {"-h", "--help"}, help = true)
    private boolean help = false;

    @Parameter(names = "--show-phases", description = "show compiler phases and exit")
    private boolean showPhases = false;

    private void run() {
        if (help) {
            commander.usage();
            return;
        }
        compiler = new Compiler();
        if (showPhases) {
            compiler.printPhases();
        } else {
            System.out.println("reikac can do nothing for now");
        }
    }

    public static void main(String[] args) {
        Reikac reikac = new Reikac();
        JCommander commander = JCommander.newBuilder().addObject(reikac).build();
        try {
            commander.parse(args);
        } catch (ParameterException ex) {
            System.out.println("Unknown parameter given");
            System.out.println(ex.getMessage());
            System.exit(1);
        }
        commander.setProgramName("reikac");
        reikac.commander = commander;
        reikac.run();
    }
}
