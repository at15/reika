package me.at15.reika.compiler;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;
import me.at15.reika.common.Loggable;
import me.at15.reika.compiler.setting.CompilerSetting;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.config.Configurator;


import java.util.ArrayList;
import java.util.List;

public class Reikac implements Loggable {
    private Command cmd;
    private JCommander commander;

    public Reikac(Command cmd, JCommander commander) {
        this.cmd = cmd;
        this.commander = commander;
    }

    private static class Command extends CompilerSetting {
        @Parameter(description = "files")
        public List<String> parameters = new ArrayList<>();

        @Parameter(names = {"-h", "--help"}, help = true)
        private boolean help = false;

        @Parameter(names = "--version", description = "Print compiler version and exit")
        private boolean showVersion = false;

        @Parameter(names = "--show-phases", description = "Show compiler phases and exit")
        private boolean showPhases = false;
    }


    private void run() {
        if (cmd.help) {
            commander.usage();
            return;
        }
        if (cmd.showVersion) {
            // TODO: find a way to sync the version number in gradle and source
            System.out.println("reikac 0.0.1");
            return;
        }
        // https://logging.apache.org/log4j/2.x/faq.html#reconfig_level_from_code
        if (cmd.verbose) {
            // TODO: what's the difference with setAllLevels(LogManager.getRootLogger().getName(), level)
            Configurator.setRootLevel(Level.DEBUG);
        }
        logger().debug("creating compiler instance");
        ReikaCompiler compiler = new ReikaCompiler(cmd);
        if (cmd.showPhases) {
            compiler.printPhases();
            return;
        }
        cmd.parameters.stream().forEach(System.out::println);
        logger().warn("reikac does nothing for now");
    }

    public static void main(String[] args) {
        Command cmd = new Command();
        JCommander commander = JCommander.newBuilder().addObject(cmd).build();
        commander.setProgramName("reikac");
        try {
            commander.parse(args);
        } catch (ParameterException ex) {
            System.out.println("Unknown parameter given");
            System.out.println(ex.getMessage());
            System.exit(1);
        }
        Reikac reikac = new Reikac(cmd, commander);
        reikac.run();
    }
}
