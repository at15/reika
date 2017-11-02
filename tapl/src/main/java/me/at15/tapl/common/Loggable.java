package me.at15.tapl.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// https://opencredo.com/traits-java-8-default-methods/
public interface Loggable {
    default Logger logger() {
        return LogManager.getLogger(this.getClass());
    }
}
