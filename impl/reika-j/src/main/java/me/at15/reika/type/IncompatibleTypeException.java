package me.at15.reika.type;

import me.at15.reika.common.ReikaException;

public class IncompatibleTypeException extends ReikaException {
    public IncompatibleTypeException(String s) {
        super(s);
    }
}
