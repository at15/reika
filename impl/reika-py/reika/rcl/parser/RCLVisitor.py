# Generated from reika/rcl/parser/RCL.g4 by ANTLR 4.7
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .RCLParser import RCLParser
else:
    from RCLParser import RCLParser

# This class defines a complete generic visitor for a parse tree produced by RCLParser.

class RCLVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by RCLParser#rcl.
    def visitRcl(self, ctx:RCLParser.RclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RCLParser#pair.
    def visitPair(self, ctx:RCLParser.PairContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RCLParser#obj.
    def visitObj(self, ctx:RCLParser.ObjContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RCLParser#array.
    def visitArray(self, ctx:RCLParser.ArrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RCLParser#ValBool.
    def visitValBool(self, ctx:RCLParser.ValBoolContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RCLParser#ValInt.
    def visitValInt(self, ctx:RCLParser.ValIntContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RCLParser#ValDouble.
    def visitValDouble(self, ctx:RCLParser.ValDoubleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RCLParser#ValString.
    def visitValString(self, ctx:RCLParser.ValStringContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RCLParser#ValObject.
    def visitValObject(self, ctx:RCLParser.ValObjectContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by RCLParser#ValArray.
    def visitValArray(self, ctx:RCLParser.ValArrayContext):
        return self.visitChildren(ctx)



del RCLParser