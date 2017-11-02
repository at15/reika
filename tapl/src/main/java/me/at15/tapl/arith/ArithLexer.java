// Generated from Arith.g4 by ANTLR 4.7
package me.at15.tapl.arith;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArithLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, WS=13, BLOCK_COMMENT=14, SINGLE_COMMENT=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "WS", "BLOCK_COMMENT", "SINGLE_COMMENT"
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


	public ArithLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Arith.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21t\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16T\n\16\r\16\16\16"+
		"U\3\16\3\16\3\17\3\17\3\17\3\17\7\17^\n\17\f\17\16\17a\13\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20l\n\20\f\20\16\20o\13\20\3\20"+
		"\3\20\3\20\3\20\4_m\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21\3\2\3\5\2\13\f\17\17\"\"\2v\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7(\3\2\2"+
		"\2\t.\3\2\2\2\13\61\3\2\2\2\r\66\3\2\2\2\17;\3\2\2\2\21=\3\2\2\2\23B\3"+
		"\2\2\2\25G\3\2\2\2\27N\3\2\2\2\31P\3\2\2\2\33S\3\2\2\2\35Y\3\2\2\2\37"+
		"g\3\2\2\2!\"\7=\2\2\"\4\3\2\2\2#$\7v\2\2$%\7t\2\2%&\7w\2\2&\'\7g\2\2\'"+
		"\6\3\2\2\2()\7h\2\2)*\7c\2\2*+\7n\2\2+,\7u\2\2,-\7g\2\2-\b\3\2\2\2./\7"+
		"k\2\2/\60\7h\2\2\60\n\3\2\2\2\61\62\7v\2\2\62\63\7j\2\2\63\64\7g\2\2\64"+
		"\65\7p\2\2\65\f\3\2\2\2\66\67\7g\2\2\678\7n\2\289\7u\2\29:\7g\2\2:\16"+
		"\3\2\2\2;<\7\62\2\2<\20\3\2\2\2=>\7u\2\2>?\7w\2\2?@\7e\2\2@A\7e\2\2A\22"+
		"\3\2\2\2BC\7r\2\2CD\7t\2\2DE\7g\2\2EF\7f\2\2F\24\3\2\2\2GH\7k\2\2HI\7"+
		"u\2\2IJ\7|\2\2JK\7g\2\2KL\7t\2\2LM\7q\2\2M\26\3\2\2\2NO\7*\2\2O\30\3\2"+
		"\2\2PQ\7+\2\2Q\32\3\2\2\2RT\t\2\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3"+
		"\2\2\2VW\3\2\2\2WX\b\16\2\2X\34\3\2\2\2YZ\7\61\2\2Z[\7,\2\2[_\3\2\2\2"+
		"\\^\13\2\2\2]\\\3\2\2\2^a\3\2\2\2_`\3\2\2\2_]\3\2\2\2`b\3\2\2\2a_\3\2"+
		"\2\2bc\7,\2\2cd\7\61\2\2de\3\2\2\2ef\b\17\2\2f\36\3\2\2\2gh\7\61\2\2h"+
		"i\7\61\2\2im\3\2\2\2jl\13\2\2\2kj\3\2\2\2lo\3\2\2\2mn\3\2\2\2mk\3\2\2"+
		"\2np\3\2\2\2om\3\2\2\2pq\7\f\2\2qr\3\2\2\2rs\b\20\2\2s \3\2\2\2\6\2U_"+
		"m\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}