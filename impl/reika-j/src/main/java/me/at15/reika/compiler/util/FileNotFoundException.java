package me.at15.reika.compiler.util;

import me.at15.reika.common.ReikaException;

public class FileNotFoundException extends ReikaException {
    public FileNotFoundException(String file) {
        super(file + " not found");
    }

    public FileNotFoundException(String file, Throwable ex) {
        super(file + " not found", ex);
    }
}
