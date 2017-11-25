package me.at15.reika.ast;

import me.at15.reika.common.ReikaException;
import me.at15.reika.parser.ParserUtil;

import org.antlr.v4.runtime.tree.ParseTree;


public class ASTUtil {
    public static Node readResource(String path) throws ReikaException {
        ParseTree tree = ParserUtil.readResourceAsTree(path);
        UntypedVisitor visitor = new UntypedVisitor();
        return visitor.visit(tree);
    }
}
