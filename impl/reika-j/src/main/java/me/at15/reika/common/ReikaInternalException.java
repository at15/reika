package me.at15.reika.common;

/**
 * exception that only happens because library developer (i.e. @at15) write inconsistent code
 */
public class ReikaInternalException extends ReikaRuntimeException {
    public ReikaInternalException(String s) {
        super(s);
    }

    public ReikaInternalException(String s, Throwable t) {
        super(s, t);
    }

    public ReikaInternalException(Throwable t) {
        super(t);
    }
}
