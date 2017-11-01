// Generated from Arith.g4 by ANTLR 4.7
package me.at15.tapl.arith;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArithParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		WS=10;
	public static final int
		RULE_prog = 0, RULE_term = 1;
	public static final String[] ruleNames = {
		"prog", "term"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'true'", "'false'", "'if'", "'then'", "'else'", "'0'", "'succ'", 
		"'pred'", "'iszero'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "WS"
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
	public String getGrammarFileName() { return "Arith.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArithParser(TokenStream input) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithVisitor ) return ((ArithVisitor<? extends T>)visitor).visitProg(this);
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
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				term();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) );
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
	public static class ZeroTestContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ZeroTestContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).enterZeroTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).exitZeroTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithVisitor ) return ((ArithVisitor<? extends T>)visitor).visitZeroTest(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SuccContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public SuccContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).enterSucc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).exitSucc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithVisitor ) return ((ArithVisitor<? extends T>)visitor).visitSucc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public PredContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).enterPred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).exitPred(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithVisitor ) return ((ArithVisitor<? extends T>)visitor).visitPred(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalContext extends TermContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ConditionalContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithVisitor ) return ((ArithVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConsTrueContext extends TermContext {
		public ConsTrueContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).enterConsTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).exitConsTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithVisitor ) return ((ArithVisitor<? extends T>)visitor).visitConsTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConsFalseContext extends TermContext {
		public ConsFalseContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).enterConsFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).exitConsFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithVisitor ) return ((ArithVisitor<? extends T>)visitor).visitConsFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConsZeroContext extends TermContext {
		public ConsZeroContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).enterConsZero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).exitConsZero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithVisitor ) return ((ArithVisitor<? extends T>)visitor).visitConsZero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_term);
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new ConsTrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(9);
				match(T__0);
				}
				break;
			case T__1:
				_localctx = new ConsFalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(10);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new ConditionalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(11);
				match(T__2);
				setState(12);
				term();
				setState(13);
				match(T__3);
				setState(14);
				term();
				setState(15);
				match(T__4);
				setState(16);
				term();
				}
				break;
			case T__5:
				_localctx = new ConsZeroContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(18);
				match(T__5);
				}
				break;
			case T__6:
				_localctx = new SuccContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(19);
				match(T__6);
				setState(20);
				term();
				}
				break;
			case T__7:
				_localctx = new PredContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(21);
				match(T__7);
				setState(22);
				term();
				}
				break;
			case T__8:
				_localctx = new ZeroTestContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(23);
				match(T__8);
				setState(24);
				term();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f\36\4\2\t\2\4\3"+
		"\t\3\3\2\6\2\b\n\2\r\2\16\2\t\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3\34\n\3\3\3\2\2\4\2\4\2\2\2\"\2\7\3\2\2\2"+
		"\4\33\3\2\2\2\6\b\5\4\3\2\7\6\3\2\2\2\b\t\3\2\2\2\t\7\3\2\2\2\t\n\3\2"+
		"\2\2\n\3\3\2\2\2\13\34\7\3\2\2\f\34\7\4\2\2\r\16\7\5\2\2\16\17\5\4\3\2"+
		"\17\20\7\6\2\2\20\21\5\4\3\2\21\22\7\7\2\2\22\23\5\4\3\2\23\34\3\2\2\2"+
		"\24\34\7\b\2\2\25\26\7\t\2\2\26\34\5\4\3\2\27\30\7\n\2\2\30\34\5\4\3\2"+
		"\31\32\7\13\2\2\32\34\5\4\3\2\33\13\3\2\2\2\33\f\3\2\2\2\33\r\3\2\2\2"+
		"\33\24\3\2\2\2\33\25\3\2\2\2\33\27\3\2\2\2\33\31\3\2\2\2\34\5\3\2\2\2"+
		"\4\t\33";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}