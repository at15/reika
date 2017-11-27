package me.at15.reika.type;

import me.at15.reika.common.ReikaException;

public class UnboundTypeException extends ReikaException {
    // TODO: store the node that has unbound type
    public UnboundTypeException(String var) {
        super(var + " has unbound type");
    }
}
