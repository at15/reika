// Generated from Sb.g4 by ANTLR 4.7
package me.at15.tapl.simplebool;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SbLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ID=14, WS=15, BLOCK_COMMENT=16, 
		SINGLE_COMMENT=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "ID", "WS", "BLOCK_COMMENT", "SINGLE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'true'", "'false'", "'if'", "'then'", "'else'", "'lambda'", 
		"':'", "'.'", "'('", "')'", "'Bool'", "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "ID", "WS", "BLOCK_COMMENT", "SINGLE_COMMENT"
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


	public SbLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sb.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23}\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\6\17"+
		"X\n\17\r\17\16\17Y\3\20\6\20]\n\20\r\20\16\20^\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\7\21g\n\21\f\21\16\21j\13\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\7\22u\n\22\f\22\16\22x\13\22\3\22\3\22\3\22\3\22\4hv\2\23\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23\3\2\4\4\2C\\c|\5\2\13\f\17\17\"\"\2\u0080\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5"+
		"\'\3\2\2\2\7,\3\2\2\2\t\62\3\2\2\2\13\65\3\2\2\2\r:\3\2\2\2\17?\3\2\2"+
		"\2\21F\3\2\2\2\23H\3\2\2\2\25J\3\2\2\2\27L\3\2\2\2\31N\3\2\2\2\33S\3\2"+
		"\2\2\35W\3\2\2\2\37\\\3\2\2\2!b\3\2\2\2#p\3\2\2\2%&\7=\2\2&\4\3\2\2\2"+
		"\'(\7v\2\2()\7t\2\2)*\7w\2\2*+\7g\2\2+\6\3\2\2\2,-\7h\2\2-.\7c\2\2./\7"+
		"n\2\2/\60\7u\2\2\60\61\7g\2\2\61\b\3\2\2\2\62\63\7k\2\2\63\64\7h\2\2\64"+
		"\n\3\2\2\2\65\66\7v\2\2\66\67\7j\2\2\678\7g\2\289\7p\2\29\f\3\2\2\2:;"+
		"\7g\2\2;<\7n\2\2<=\7u\2\2=>\7g\2\2>\16\3\2\2\2?@\7n\2\2@A\7c\2\2AB\7o"+
		"\2\2BC\7d\2\2CD\7f\2\2DE\7c\2\2E\20\3\2\2\2FG\7<\2\2G\22\3\2\2\2HI\7\60"+
		"\2\2I\24\3\2\2\2JK\7*\2\2K\26\3\2\2\2LM\7+\2\2M\30\3\2\2\2NO\7D\2\2OP"+
		"\7q\2\2PQ\7q\2\2QR\7n\2\2R\32\3\2\2\2ST\7/\2\2TU\7@\2\2U\34\3\2\2\2VX"+
		"\t\2\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\36\3\2\2\2[]\t\3\2\2"+
		"\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\b\20\2\2a \3\2"+
		"\2\2bc\7\61\2\2cd\7,\2\2dh\3\2\2\2eg\13\2\2\2fe\3\2\2\2gj\3\2\2\2hi\3"+
		"\2\2\2hf\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7,\2\2lm\7\61\2\2mn\3\2\2\2no\b"+
		"\21\2\2o\"\3\2\2\2pq\7\61\2\2qr\7\61\2\2rv\3\2\2\2su\13\2\2\2ts\3\2\2"+
		"\2ux\3\2\2\2vw\3\2\2\2vt\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7\f\2\2z{\3\2\2"+
		"\2{|\b\22\2\2|$\3\2\2\2\7\2Y^hv\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}