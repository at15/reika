# Generated from reika/rcl/parser/RCL.g4 by ANTLR 4.7
# encoding: utf-8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys

def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20")
        buf.write("@\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n")
        buf.write("\2\r\2\16\2\17\3\3\3\3\3\3\3\3\3\3\3\3\5\3\30\n\3\3\4")
        buf.write("\3\4\3\4\3\4\7\4\36\n\4\f\4\16\4!\13\4\3\4\3\4\3\4\3\4")
        buf.write("\5\4\'\n\4\3\5\3\5\3\5\3\5\7\5-\n\5\f\5\16\5\60\13\5\3")
        buf.write("\5\3\5\3\5\3\5\5\5\66\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6")
        buf.write(">\n\6\3\6\2\2\7\2\4\6\b\n\2\2\2E\2\r\3\2\2\2\4\27\3\2")
        buf.write("\2\2\6&\3\2\2\2\b\65\3\2\2\2\n=\3\2\2\2\f\16\5\4\3\2\r")
        buf.write("\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20")
        buf.write("\3\3\2\2\2\21\22\7\r\2\2\22\23\7\3\2\2\23\30\5\n\6\2\24")
        buf.write("\25\7\f\2\2\25\26\7\3\2\2\26\30\5\n\6\2\27\21\3\2\2\2")
        buf.write("\27\24\3\2\2\2\30\5\3\2\2\2\31\32\7\4\2\2\32\37\5\4\3")
        buf.write("\2\33\34\7\5\2\2\34\36\5\4\3\2\35\33\3\2\2\2\36!\3\2\2")
        buf.write("\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"")
        buf.write("#\7\6\2\2#\'\3\2\2\2$%\7\4\2\2%\'\7\6\2\2&\31\3\2\2\2")
        buf.write("&$\3\2\2\2\'\7\3\2\2\2()\7\7\2\2).\5\n\6\2*+\7\5\2\2+")
        buf.write("-\5\n\6\2,*\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61")
        buf.write("\3\2\2\2\60.\3\2\2\2\61\62\7\b\2\2\62\66\3\2\2\2\63\64")
        buf.write("\7\7\2\2\64\66\7\b\2\2\65(\3\2\2\2\65\63\3\2\2\2\66\t")
        buf.write("\3\2\2\2\67>\7\t\2\28>\7\n\2\29>\7\13\2\2:>\7\f\2\2;>")
        buf.write("\5\6\4\2<>\5\b\5\2=\67\3\2\2\2=8\3\2\2\2=9\3\2\2\2=:\3")
        buf.write("\2\2\2=;\3\2\2\2=<\3\2\2\2>\13\3\2\2\2\t\17\27\37&.\65")
        buf.write("=")
        return buf.getvalue()


class RCLParser ( Parser ):

    grammarFileName = "RCL.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'='", "'{'", "','", "'}'", "'['", "']'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "BOOL", "INT", 
                      "DOUBLE", "STRING", "ID", "WS", "BLOCK_COMMENT", "SINGLE_COMMENT" ]

    RULE_rcl = 0
    RULE_pair = 1
    RULE_obj = 2
    RULE_array = 3
    RULE_value = 4

    ruleNames =  [ "rcl", "pair", "obj", "array", "value" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    BOOL=7
    INT=8
    DOUBLE=9
    STRING=10
    ID=11
    WS=12
    BLOCK_COMMENT=13
    SINGLE_COMMENT=14

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None



    class RclContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def pair(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(RCLParser.PairContext)
            else:
                return self.getTypedRuleContext(RCLParser.PairContext,i)


        def getRuleIndex(self):
            return RCLParser.RULE_rcl

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRcl" ):
                return visitor.visitRcl(self)
            else:
                return visitor.visitChildren(self)




    def rcl(self):

        localctx = RCLParser.RclContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_rcl)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 11 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 10
                self.pair()
                self.state = 13 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==RCLParser.STRING or _la==RCLParser.ID):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class PairContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.k = None # Token

        def value(self):
            return self.getTypedRuleContext(RCLParser.ValueContext,0)


        def ID(self):
            return self.getToken(RCLParser.ID, 0)

        def STRING(self):
            return self.getToken(RCLParser.STRING, 0)

        def getRuleIndex(self):
            return RCLParser.RULE_pair

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPair" ):
                return visitor.visitPair(self)
            else:
                return visitor.visitChildren(self)




    def pair(self):

        localctx = RCLParser.PairContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_pair)
        try:
            self.state = 21
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [RCLParser.ID]:
                self.enterOuterAlt(localctx, 1)
                self.state = 15
                localctx.k = self.match(RCLParser.ID)
                self.state = 16
                self.match(RCLParser.T__0)
                self.state = 17
                self.value()
                pass
            elif token in [RCLParser.STRING]:
                self.enterOuterAlt(localctx, 2)
                self.state = 18
                localctx.k = self.match(RCLParser.STRING)
                self.state = 19
                self.match(RCLParser.T__0)
                self.state = 20
                self.value()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ObjContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def pair(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(RCLParser.PairContext)
            else:
                return self.getTypedRuleContext(RCLParser.PairContext,i)


        def getRuleIndex(self):
            return RCLParser.RULE_obj

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitObj" ):
                return visitor.visitObj(self)
            else:
                return visitor.visitChildren(self)




    def obj(self):

        localctx = RCLParser.ObjContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_obj)
        self._la = 0 # Token type
        try:
            self.state = 36
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 23
                self.match(RCLParser.T__1)
                self.state = 24
                self.pair()
                self.state = 29
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==RCLParser.T__2:
                    self.state = 25
                    self.match(RCLParser.T__2)
                    self.state = 26
                    self.pair()
                    self.state = 31
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 32
                self.match(RCLParser.T__3)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 34
                self.match(RCLParser.T__1)
                self.state = 35
                self.match(RCLParser.T__3)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ArrayContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def value(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(RCLParser.ValueContext)
            else:
                return self.getTypedRuleContext(RCLParser.ValueContext,i)


        def getRuleIndex(self):
            return RCLParser.RULE_array

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArray" ):
                return visitor.visitArray(self)
            else:
                return visitor.visitChildren(self)




    def array(self):

        localctx = RCLParser.ArrayContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_array)
        self._la = 0 # Token type
        try:
            self.state = 51
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 38
                self.match(RCLParser.T__4)
                self.state = 39
                self.value()
                self.state = 44
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==RCLParser.T__2:
                    self.state = 40
                    self.match(RCLParser.T__2)
                    self.state = 41
                    self.value()
                    self.state = 46
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 47
                self.match(RCLParser.T__5)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 49
                self.match(RCLParser.T__4)
                self.state = 50
                self.match(RCLParser.T__5)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ValueContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return RCLParser.RULE_value

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class ValBoolContext(ValueContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a RCLParser.ValueContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def BOOL(self):
            return self.getToken(RCLParser.BOOL, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitValBool" ):
                return visitor.visitValBool(self)
            else:
                return visitor.visitChildren(self)


    class ValObjectContext(ValueContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a RCLParser.ValueContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def obj(self):
            return self.getTypedRuleContext(RCLParser.ObjContext,0)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitValObject" ):
                return visitor.visitValObject(self)
            else:
                return visitor.visitChildren(self)


    class ValIntContext(ValueContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a RCLParser.ValueContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def INT(self):
            return self.getToken(RCLParser.INT, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitValInt" ):
                return visitor.visitValInt(self)
            else:
                return visitor.visitChildren(self)


    class ValStringContext(ValueContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a RCLParser.ValueContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def STRING(self):
            return self.getToken(RCLParser.STRING, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitValString" ):
                return visitor.visitValString(self)
            else:
                return visitor.visitChildren(self)


    class ValDoubleContext(ValueContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a RCLParser.ValueContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def DOUBLE(self):
            return self.getToken(RCLParser.DOUBLE, 0)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitValDouble" ):
                return visitor.visitValDouble(self)
            else:
                return visitor.visitChildren(self)


    class ValArrayContext(ValueContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a RCLParser.ValueContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def array(self):
            return self.getTypedRuleContext(RCLParser.ArrayContext,0)


        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitValArray" ):
                return visitor.visitValArray(self)
            else:
                return visitor.visitChildren(self)



    def value(self):

        localctx = RCLParser.ValueContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_value)
        try:
            self.state = 59
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [RCLParser.BOOL]:
                localctx = RCLParser.ValBoolContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 53
                self.match(RCLParser.BOOL)
                pass
            elif token in [RCLParser.INT]:
                localctx = RCLParser.ValIntContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 54
                self.match(RCLParser.INT)
                pass
            elif token in [RCLParser.DOUBLE]:
                localctx = RCLParser.ValDoubleContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 55
                self.match(RCLParser.DOUBLE)
                pass
            elif token in [RCLParser.STRING]:
                localctx = RCLParser.ValStringContext(self, localctx)
                self.enterOuterAlt(localctx, 4)
                self.state = 56
                self.match(RCLParser.STRING)
                pass
            elif token in [RCLParser.T__1]:
                localctx = RCLParser.ValObjectContext(self, localctx)
                self.enterOuterAlt(localctx, 5)
                self.state = 57
                self.obj()
                pass
            elif token in [RCLParser.T__4]:
                localctx = RCLParser.ValArrayContext(self, localctx)
                self.enterOuterAlt(localctx, 6)
                self.state = 58
                self.array()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





