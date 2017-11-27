package me.at15.reika.type;

import me.at15.reika.common.ReikaRuntimeException;

public class Unspecified extends Ty {
    @Override
    public boolean equals(Ty ty) {
        // TODO: maybe unspecified is same as unspecified?
        throw new ReikaRuntimeException("can't compare unspecified type with others");
    }
}
