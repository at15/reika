package me.at15.reika.common;

public class ReikaException extends Exception {
    public ReikaException(String s) {
        super(s);
    }

    public ReikaException(String s, Throwable t) {
        super(s, t);
    }

    public ReikaException(Throwable t) {
        super(t);
    }
}
