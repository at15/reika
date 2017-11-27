package me.at15.reika.type;

import me.at15.reika.ast.ASTUtil;
import me.at15.reika.ast.Node;
import me.at15.reika.common.ReikaException;

public class TypeUtil {
    public static Node readResource(String path) throws ReikaException {
        Node root = ASTUtil.readResource(path);
        Checker checker = new Checker();
        return checker.visit(root);
    }
}
