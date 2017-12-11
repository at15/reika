package me.at15.reika.compiler.reporter;

import java.util.List;

public interface Reporter {
    void info(Position pos, String msg);

    void warn(Position pos, String msg);

    void error(Position pos, String msg);

    void errors(List<? extends Err> errors);

    void flush();

    void finish();
}
