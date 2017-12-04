package me.at15.reika.compiler.util;

public class CompilationUnit {
    public SourceFile source;
    public int phaseId;
    // TODO: keep trees and last tree, so phase can refer to each other?
}
