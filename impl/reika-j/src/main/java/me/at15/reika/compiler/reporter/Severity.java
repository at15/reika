package me.at15.reika.compiler.reporter;

public class Severity {
    public final String name;
    public int count = 0;
    public int id = 0;

    public static final Severity INFO = new Severity("INFO");
    public static final Severity WARN = new Severity("WARN");
    public static final Severity ERRO = new Severity("ERRO");

    public Severity(String name) {
        this.name = name;
    }
}
