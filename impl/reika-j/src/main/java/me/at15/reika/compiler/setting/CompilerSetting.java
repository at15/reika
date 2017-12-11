package me.at15.reika.compiler.setting;

import com.beust.jcommander.Parameter;

public class CompilerSetting {
    @Parameter(names = {"-v", "--verbose"}, description = "Print detail information during phases")
    public boolean verbose = false;

    public static CompilerSetting settingForTest(boolean verbose) {
        CompilerSetting setting = new CompilerSetting();
        setting.verbose = verbose;
        return setting;
    }
}
