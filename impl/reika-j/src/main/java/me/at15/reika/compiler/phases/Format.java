package me.at15.reika.compiler.phases;

/**
 * @TODO: might not use it at all
 * void: this phase rely on side effect
 * tree: return a new tree, or the original tree with some update
 * text: plain text
 */
public enum Format {
    VOID, PARSE_TREE, AST, TEXT
}
