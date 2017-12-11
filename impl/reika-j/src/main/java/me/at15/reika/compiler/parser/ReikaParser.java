// Generated from src/main/java/me/at15/reika/compiler/parser/Reika.g4 by ANTLR 4.7
package me.at15.reika.compiler.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ReikaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, BOOL=16, INT=17, 
		DOUBLE=18, ID=19, WS=20, BLOCK_COMMENT=21, SINGLE_COMMENT=22;
	public static final int
		RULE_prog = 0, RULE_constant = 1, RULE_type = 2, RULE_term = 3;
	public static final String[] ruleNames = {
		"prog", "constant", "type", "term"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'-'", "'Int'", "'Double'", "'Bool'", "'!'", "'*'", "'/'", 
		"'%'", "'+'", "'let'", "':'", "'='", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "BOOL", "INT", "DOUBLE", "ID", "WS", "BLOCK_COMMENT", 
		"SINGLE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Reika.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReikaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				term(0);
				setState(9);
				match(T__0);
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__10) | (1L << T__13) | (1L << BOOL) | (1L << INT) | (1L << DOUBLE) | (1L << ID))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConsBoolContext extends ConstantContext {
		public TerminalNode BOOL() { return getToken(ReikaParser.BOOL, 0); }
		public ConsBoolContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitConsBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConsIntContext extends ConstantContext {
		public Token sign;
		public TerminalNode INT() { return getToken(ReikaParser.INT, 0); }
		public ConsIntContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitConsInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConsDoubleContext extends ConstantContext {
		public Token sign;
		public TerminalNode DOUBLE() { return getToken(ReikaParser.DOUBLE, 0); }
		public ConsDoubleContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitConsDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constant);
		int _la;
		try {
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ConsBoolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				match(BOOL);
				}
				break;
			case 2:
				_localctx = new ConsIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(16);
					((ConsIntContext)_localctx).sign = match(T__1);
					}
				}

				setState(19);
				match(INT);
				}
				break;
			case 3:
				_localctx = new ConsDoubleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(20);
					((ConsDoubleContext)_localctx).sign = match(T__1);
					}
				}

				setState(23);
				match(DOUBLE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeBoolContext extends TypeContext {
		public TypeBoolContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitTypeBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeIntContext extends TypeContext {
		public TypeIntContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitTypeInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeDoubleContext extends TypeContext {
		public TypeDoubleContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitTypeDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(T__2);
				}
				break;
			case T__3:
				_localctx = new TypeDoubleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				match(T__3);
				}
				break;
			case T__4:
				_localctx = new TypeBoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TmLetContext extends TermContext {
		public TerminalNode ID() { return getToken(ReikaParser.ID, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TmLetContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitTmLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TmUnaryContext extends TermContext {
		public Token op;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TmUnaryContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitTmUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TmVarContext extends TermContext {
		public TerminalNode ID() { return getToken(ReikaParser.ID, 0); }
		public TmVarContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitTmVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TmConsContext extends TermContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TmConsContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitTmCons(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TmBinaryContext extends TermContext {
		public Token op;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TmBinaryContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitTmBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TmBracketsContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TmBracketsContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitTmBrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new TmConsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(32);
				constant();
				}
				break;
			case 2:
				{
				_localctx = new TmVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new TmUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				((TmUnaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__5) ) {
					((TmUnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(35);
				term(5);
				}
				break;
			case 4:
				{
				_localctx = new TmLetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				match(T__10);
				setState(37);
				match(ID);
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(38);
					match(T__11);
					setState(39);
					type();
					}
				}

				setState(42);
				match(T__12);
				setState(43);
				term(2);
				}
				break;
			case 5:
				{
				_localctx = new TmBracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				match(T__13);
				setState(45);
				term(0);
				setState(46);
				match(T__14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(56);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new TmBinaryContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(50);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(51);
						((TmBinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
							((TmBinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(52);
						term(5);
						}
						break;
					case 2:
						{
						_localctx = new TmBinaryContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(53);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(54);
						((TmBinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__1 || _la==T__9) ) {
							((TmBinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(55);
						term(4);
						}
						break;
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30@\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\5\3\24\n"+
		"\3\3\3\3\3\5\3\30\n\3\3\3\5\3\33\n\3\3\4\3\4\3\4\5\4 \n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5+\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\63\n\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5;\n\5\f\5\16\5>\13\5\3\5\2\3\b\6\2\4\6\b\2\5"+
		"\4\2\4\4\b\b\3\2\t\13\4\2\4\4\f\f\2I\2\r\3\2\2\2\4\32\3\2\2\2\6\37\3\2"+
		"\2\2\b\62\3\2\2\2\n\13\5\b\5\2\13\f\7\3\2\2\f\16\3\2\2\2\r\n\3\2\2\2\16"+
		"\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21\33\7\22\2\2\22"+
		"\24\7\4\2\2\23\22\3\2\2\2\23\24\3\2\2\2\24\25\3\2\2\2\25\33\7\23\2\2\26"+
		"\30\7\4\2\2\27\26\3\2\2\2\27\30\3\2\2\2\30\31\3\2\2\2\31\33\7\24\2\2\32"+
		"\21\3\2\2\2\32\23\3\2\2\2\32\27\3\2\2\2\33\5\3\2\2\2\34 \7\5\2\2\35 \7"+
		"\6\2\2\36 \7\7\2\2\37\34\3\2\2\2\37\35\3\2\2\2\37\36\3\2\2\2 \7\3\2\2"+
		"\2!\"\b\5\1\2\"\63\5\4\3\2#\63\7\25\2\2$%\t\2\2\2%\63\5\b\5\7&\'\7\r\2"+
		"\2\'*\7\25\2\2()\7\16\2\2)+\5\6\4\2*(\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\7"+
		"\17\2\2-\63\5\b\5\4./\7\20\2\2/\60\5\b\5\2\60\61\7\21\2\2\61\63\3\2\2"+
		"\2\62!\3\2\2\2\62#\3\2\2\2\62$\3\2\2\2\62&\3\2\2\2\62.\3\2\2\2\63<\3\2"+
		"\2\2\64\65\f\6\2\2\65\66\t\3\2\2\66;\5\b\5\7\678\f\5\2\289\t\4\2\29;\5"+
		"\b\5\6:\64\3\2\2\2:\67\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\t\3\2\2"+
		"\2><\3\2\2\2\13\17\23\27\32\37*\62:<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}