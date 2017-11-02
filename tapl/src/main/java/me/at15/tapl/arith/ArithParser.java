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
		T__9=10, T__10=11, T__11=12, WS=13, BLOCK_COMMENT=14, SINGLE_COMMENT=15;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_term = 2;
	public static final String[] ruleNames = {
		"prog", "stat", "term"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'true'", "'false'", "'if'", "'then'", "'else'", "'0'", "'succ'", 
		"'pred'", "'iszero'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "WS", "BLOCK_COMMENT", "SINGLE_COMMENT"
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
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
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
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				stat();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) );
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

	public static class StatContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithVisitor ) return ((ArithVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			term();
			setState(12);
			match(T__0);
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
	public static class BracketsContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public BracketsContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).enterBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithListener ) ((ArithListener)listener).exitBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithVisitor ) return ((ArithVisitor<? extends T>)visitor).visitBrackets(this);
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
		enterRule(_localctx, 4, RULE_term);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new ConsTrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new ConsFalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				match(T__2);
				}
				break;
			case T__3:
				_localctx = new ConditionalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(16);
				match(T__3);
				setState(17);
				term();
				setState(18);
				match(T__4);
				setState(19);
				term();
				setState(20);
				match(T__5);
				setState(21);
				term();
				}
				break;
			case T__6:
				_localctx = new ConsZeroContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(23);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new SuccContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(24);
				match(T__7);
				setState(25);
				term();
				}
				break;
			case T__8:
				_localctx = new PredContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(26);
				match(T__8);
				setState(27);
				term();
				}
				break;
			case T__9:
				_localctx = new ZeroTestContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(28);
				match(T__9);
				setState(29);
				term();
				}
				break;
			case T__10:
				_localctx = new BracketsContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(30);
				match(T__10);
				setState(31);
				term();
				setState(32);
				match(T__11);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21\'\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2\13\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4%\n\4"+
		"\3\4\2\2\5\2\4\6\2\2\2+\2\t\3\2\2\2\4\r\3\2\2\2\6$\3\2\2\2\b\n\5\4\3\2"+
		"\t\b\3\2\2\2\n\13\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\3\3\2\2\2\r\16\5"+
		"\6\4\2\16\17\7\3\2\2\17\5\3\2\2\2\20%\7\4\2\2\21%\7\5\2\2\22\23\7\6\2"+
		"\2\23\24\5\6\4\2\24\25\7\7\2\2\25\26\5\6\4\2\26\27\7\b\2\2\27\30\5\6\4"+
		"\2\30%\3\2\2\2\31%\7\t\2\2\32\33\7\n\2\2\33%\5\6\4\2\34\35\7\13\2\2\35"+
		"%\5\6\4\2\36\37\7\f\2\2\37%\5\6\4\2 !\7\r\2\2!\"\5\6\4\2\"#\7\16\2\2#"+
		"%\3\2\2\2$\20\3\2\2\2$\21\3\2\2\2$\22\3\2\2\2$\31\3\2\2\2$\32\3\2\2\2"+
		"$\34\3\2\2\2$\36\3\2\2\2$ \3\2\2\2%\7\3\2\2\2\4\13$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}