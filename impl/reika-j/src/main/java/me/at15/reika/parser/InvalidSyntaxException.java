package me.at15.reika.parser;

import me.at15.reika.common.ReikaException;

public class InvalidSyntaxException extends ReikaException {
    private Wrapper wrapper;

    public InvalidSyntaxException(Wrapper wrapper) {
        super("invalid Reika syntax");
        this.wrapper = wrapper;
    }
}
