package me.at15.reika.common;

public class ReikaRuntimeException extends RuntimeException {
    public ReikaRuntimeException(String s) {
        super(s);
    }

    public ReikaRuntimeException(String s, Throwable t) {
        super(s, t);
    }

    public ReikaRuntimeException(Throwable t) {
        super(t);
    }
}
