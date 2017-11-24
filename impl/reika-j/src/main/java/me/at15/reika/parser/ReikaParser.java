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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, BOOL=9, 
		INT=10, DOUBLE=11, STRING=12, BIN_OP=13, ID=14, WS=15, BLOCK_COMMENT=16, 
		SINGLE_COMMENT=17;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_literal = 2, RULE_list = 3, RULE_record = 4, 
		RULE_term = 5;
	public static final String[] ruleNames = {
		"prog", "stat", "literal", "list", "record", "term"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'['", "']'", "'{'", "':'", "'}'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "BOOL", "INT", "DOUBLE", 
		"STRING", "BIN_OP", "ID", "WS", "BLOCK_COMMENT", "SINGLE_COMMENT"
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
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				stat();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << BOOL) | (1L << INT) | (1L << DOUBLE) | (1L << STRING))) != 0) );
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			term();
			setState(18);
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LtBoolContext extends LiteralContext {
		public TerminalNode BOOL() { return getToken(ReikaParser.BOOL, 0); }
		public LtBoolContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitLtBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtDoubleContext extends LiteralContext {
		public TerminalNode DOUBLE() { return getToken(ReikaParser.DOUBLE, 0); }
		public LtDoubleContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitLtDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtIntContext extends LiteralContext {
		public TerminalNode INT() { return getToken(ReikaParser.INT, 0); }
		public LtIntContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitLtInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtStringContext extends LiteralContext {
		public TerminalNode STRING() { return getToken(ReikaParser.STRING, 0); }
		public LtStringContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitLtString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_literal);
		try {
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				_localctx = new LtBoolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				match(BOOL);
				}
				break;
			case INT:
				_localctx = new LtIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				match(INT);
				}
				break;
			case DOUBLE:
				_localctx = new LtDoubleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				match(DOUBLE);
				}
				break;
			case STRING:
				_localctx = new LtStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(23);
				match(STRING);
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

	public static class ListContext extends ParserRuleContext {
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	 
		public ListContext() { }
		public void copyFrom(ListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListListContext extends ListContext {
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public ListListContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitListList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListLtContext extends ListContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public ListLtContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitListLt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListRecordContext extends ListContext {
		public List<RecordContext> record() {
			return getRuleContexts(RecordContext.class);
		}
		public RecordContext record(int i) {
			return getRuleContext(RecordContext.class,i);
		}
		public ListRecordContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitListRecord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_list);
		int _la;
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new ListLtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(T__1);
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(27);
					literal();
					}
					}
					setState(30); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << DOUBLE) | (1L << STRING))) != 0) );
				setState(32);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new ListListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(T__1);
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(35);
					list();
					}
					}
					setState(38); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				setState(40);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new ListRecordContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(T__1);
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(43);
					record();
					}
					}
					setState(46); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(48);
				match(T__2);
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

	public static class RecordContext extends ParserRuleContext {
		public RecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record; }
	 
		public RecordContext() { }
		public void copyFrom(RecordContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RecordLtContext extends RecordContext {
		public List<TerminalNode> ID() { return getTokens(ReikaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReikaParser.ID, i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public RecordLtContext(RecordContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitRecordLt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordContext record() throws RecognitionException {
		RecordContext _localctx = new RecordContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_record);
		int _la;
		try {
			_localctx = new RecordLtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__3);
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				match(ID);
				setState(54);
				match(T__4);
				setState(55);
				literal();
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(60);
			match(T__5);
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
	public static class TmLiteralContext extends TermContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TmLiteralContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitTmLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TmListContext extends TermContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TmListContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitTmList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TmRecordContext extends TermContext {
		public RecordContext record() {
			return getRuleContext(RecordContext.class,0);
		}
		public TmRecordContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReikaVisitor ) return ((ReikaVisitor<? extends T>)visitor).visitTmRecord(this);
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
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_term);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case INT:
			case DOUBLE:
			case STRING:
				_localctx = new TmLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				literal();
				}
				break;
			case T__1:
				_localctx = new TmListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				list();
				}
				break;
			case T__3:
				_localctx = new TmRecordContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				record();
				}
				break;
			case T__6:
				_localctx = new TmBracketsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				match(T__6);
				setState(66);
				term();
				setState(67);
				match(T__7);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23J\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\5\4\33\n\4\3\5\3\5\6\5\37\n\5\r\5\16\5 \3\5\3\5\3"+
		"\5\3\5\6\5\'\n\5\r\5\16\5(\3\5\3\5\3\5\3\5\6\5/\n\5\r\5\16\5\60\3\5\3"+
		"\5\5\5\65\n\5\3\6\3\6\3\6\3\6\6\6;\n\6\r\6\16\6<\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7H\n\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2P\2\17\3\2\2\2\4\23"+
		"\3\2\2\2\6\32\3\2\2\2\b\64\3\2\2\2\n\66\3\2\2\2\fG\3\2\2\2\16\20\5\4\3"+
		"\2\17\16\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\3\3\2\2"+
		"\2\23\24\5\f\7\2\24\25\7\3\2\2\25\5\3\2\2\2\26\33\7\13\2\2\27\33\7\f\2"+
		"\2\30\33\7\r\2\2\31\33\7\16\2\2\32\26\3\2\2\2\32\27\3\2\2\2\32\30\3\2"+
		"\2\2\32\31\3\2\2\2\33\7\3\2\2\2\34\36\7\4\2\2\35\37\5\6\4\2\36\35\3\2"+
		"\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\"\3\2\2\2\"#\7\5\2\2#\65\3\2\2"+
		"\2$&\7\4\2\2%\'\5\b\5\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)*\3\2"+
		"\2\2*+\7\5\2\2+\65\3\2\2\2,.\7\4\2\2-/\5\n\6\2.-\3\2\2\2/\60\3\2\2\2\60"+
		".\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7\5\2\2\63\65\3\2\2\2\64\34"+
		"\3\2\2\2\64$\3\2\2\2\64,\3\2\2\2\65\t\3\2\2\2\66:\7\6\2\2\678\7\20\2\2"+
		"89\7\7\2\29;\5\6\4\2:\67\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2"+
		"\2>?\7\b\2\2?\13\3\2\2\2@H\5\6\4\2AH\5\b\5\2BH\5\n\6\2CD\7\t\2\2DE\5\f"+
		"\7\2EF\7\n\2\2FH\3\2\2\2G@\3\2\2\2GA\3\2\2\2GB\3\2\2\2GC\3\2\2\2H\r\3"+
		"\2\2\2\n\21\32 (\60\64<G";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}