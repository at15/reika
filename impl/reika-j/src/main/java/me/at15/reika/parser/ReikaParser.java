// Generated from Reika.g4 by ANTLR 4.7
package me.at15.reika.parser;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, BOOL=6, INT=7, DOUBLE=8, STRING=9, 
		BINARY_OP_LOW=10, BINARY_OP_HIGH=11, ID=12, WS=13, BLOCK_COMMENT=14, SINGLE_COMMENT=15;
	public static final int
		RULE_prog = 0, RULE_value = 1, RULE_term = 2;
	public static final String[] ruleNames = {
		"prog", "value", "term"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'-'", "'!'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "BOOL", "INT", "DOUBLE", "STRING", 
		"BINARY_OP_LOW", "BINARY_OP_HIGH", "ID", "WS", "BLOCK_COMMENT", "SINGLE_COMMENT"
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
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				term(0);
				setState(7);
				match(T__0);
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << BOOL) | (1L << INT) | (1L << DOUBLE))) != 0) );
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValBoolContext extends ValueContext {
		public TerminalNode BOOL() { return getToken(ReikaParser.BOOL, 0); }
		public ValBoolContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitValBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValIntContext extends ValueContext {
		public TerminalNode INT() { return getToken(ReikaParser.INT, 0); }
		public ValIntContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitValInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValDoubleContext extends ValueContext {
		public TerminalNode DOUBLE() { return getToken(ReikaParser.DOUBLE, 0); }
		public ValDoubleContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitValDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_value);
		try {
			setState(16);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				_localctx = new ValBoolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				match(BOOL);
				}
				break;
			case INT:
				_localctx = new ValIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(14);
				match(INT);
				}
				break;
			case DOUBLE:
				_localctx = new ValDoubleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(15);
				match(DOUBLE);
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
	public static class TmBinaryHighContext extends TermContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode BINARY_OP_HIGH() { return getToken(ReikaParser.BINARY_OP_HIGH, 0); }
		public TmBinaryHighContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitTmBinaryHigh(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TmUnaryNegativeContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TmUnaryNegativeContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitTmUnaryNegative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TmBinaryLowContext extends TermContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode BINARY_OP_LOW() { return getToken(ReikaParser.BINARY_OP_LOW, 0); }
		public TmBinaryLowContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitTmBinaryLow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TmValueContext extends TermContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TmValueContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitTmValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TmUnaryNotContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TmUnaryNotContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitTmUnaryNot(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case DOUBLE:
				{
				_localctx = new TmValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(19);
				value();
				}
				break;
			case T__1:
				{
				_localctx = new TmUnaryNegativeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(20);
				match(T__1);
				setState(21);
				term(5);
				}
				break;
			case T__2:
				{
				_localctx = new TmUnaryNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(22);
				match(T__2);
				setState(23);
				term(4);
				}
				break;
			case T__3:
				{
				_localctx = new TmBracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				match(T__3);
				setState(25);
				term(0);
				setState(26);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(38);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(36);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new TmBinaryHighContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(30);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(31);
						match(BINARY_OP_HIGH);
						setState(32);
						term(4);
						}
						break;
					case 2:
						{
						_localctx = new TmBinaryLowContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(33);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(34);
						match(BINARY_OP_LOW);
						setState(35);
						term(3);
						}
						break;
					}
					} 
				}
				setState(40);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21,\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\6\2\f\n\2\r\2\16\2\r\3\3\3\3\3\3\5\3\23\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\37\n\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\4\'\n\4\f\4\16\4*\13\4\3\4\2\3\6\5\2\4\6\2\2\2\60\2\13\3\2\2\2\4"+
		"\22\3\2\2\2\6\36\3\2\2\2\b\t\5\6\4\2\t\n\7\3\2\2\n\f\3\2\2\2\13\b\3\2"+
		"\2\2\f\r\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\3\3\2\2\2\17\23\7\b\2\2"+
		"\20\23\7\t\2\2\21\23\7\n\2\2\22\17\3\2\2\2\22\20\3\2\2\2\22\21\3\2\2\2"+
		"\23\5\3\2\2\2\24\25\b\4\1\2\25\37\5\4\3\2\26\27\7\4\2\2\27\37\5\6\4\7"+
		"\30\31\7\5\2\2\31\37\5\6\4\6\32\33\7\6\2\2\33\34\5\6\4\2\34\35\7\7\2\2"+
		"\35\37\3\2\2\2\36\24\3\2\2\2\36\26\3\2\2\2\36\30\3\2\2\2\36\32\3\2\2\2"+
		"\37(\3\2\2\2 !\f\5\2\2!\"\7\r\2\2\"\'\5\6\4\6#$\f\4\2\2$%\7\f\2\2%\'\5"+
		"\6\4\5& \3\2\2\2&#\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)\7\3\2\2\2*"+
		"(\3\2\2\2\7\r\22\36&(";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}