package me.at15.reika.common;

/**
 * unchecked exception, used in visitor because the interface doesn't throw any exception
 */
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
