package parser.time;// Generated from /Users/sam/Documents/MA1/Software Evo/calculator-cucumber-2024/src/main/antlr4/Calculator/CalculatorExprTime.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CalculatorExprTimeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, AM=5, PM=6, CETADD=7, CETSUB=8, ADD=9, 
		SUB=10, NUMBER=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "AM", "PM", "CETADD", "CETSUB", "ADD", 
			"SUB", "NUMBER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'('", "')'", "','", "'AM'", "'PM'", "'CET+'", "'CET-'", 
			"'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "AM", "PM", "CETADD", "CETSUB", "ADD", 
			"SUB", "NUMBER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public CalculatorExprTimeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CalculatorExprTime.g4"; }

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
		"\u0004\u0000\fA\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0004\n7\b\n\u000b"+
		"\n\f\n8\u0001\u000b\u0004\u000b<\b\u000b\u000b\u000b\f\u000b=\u0001\u000b"+
		"\u0001\u000b\u0000\u0000\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0001\u0000\u0002\u0001\u000009\u0003\u0000\t\n\r\r  B\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000"+
		"\u0000\u0000\u0003\u001b\u0001\u0000\u0000\u0000\u0005\u001d\u0001\u0000"+
		"\u0000\u0000\u0007\u001f\u0001\u0000\u0000\u0000\t!\u0001\u0000\u0000"+
		"\u0000\u000b$\u0001\u0000\u0000\u0000\r\'\u0001\u0000\u0000\u0000\u000f"+
		",\u0001\u0000\u0000\u0000\u00111\u0001\u0000\u0000\u0000\u00133\u0001"+
		"\u0000\u0000\u0000\u00156\u0001\u0000\u0000\u0000\u0017;\u0001\u0000\u0000"+
		"\u0000\u0019\u001a\u0005:\u0000\u0000\u001a\u0002\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0005(\u0000\u0000\u001c\u0004\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0005)\u0000\u0000\u001e\u0006\u0001\u0000\u0000\u0000\u001f \u0005"+
		",\u0000\u0000 \b\u0001\u0000\u0000\u0000!\"\u0005A\u0000\u0000\"#\u0005"+
		"M\u0000\u0000#\n\u0001\u0000\u0000\u0000$%\u0005P\u0000\u0000%&\u0005"+
		"M\u0000\u0000&\f\u0001\u0000\u0000\u0000\'(\u0005C\u0000\u0000()\u0005"+
		"E\u0000\u0000)*\u0005T\u0000\u0000*+\u0005+\u0000\u0000+\u000e\u0001\u0000"+
		"\u0000\u0000,-\u0005C\u0000\u0000-.\u0005E\u0000\u0000./\u0005T\u0000"+
		"\u0000/0\u0005-\u0000\u00000\u0010\u0001\u0000\u0000\u000012\u0005+\u0000"+
		"\u00002\u0012\u0001\u0000\u0000\u000034\u0005-\u0000\u00004\u0014\u0001"+
		"\u0000\u0000\u000057\u0007\u0000\u0000\u000065\u0001\u0000\u0000\u0000"+
		"78\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000"+
		"\u00009\u0016\u0001\u0000\u0000\u0000:<\u0007\u0001\u0000\u0000;:\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		"=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0006\u000b\u0000"+
		"\u0000@\u0018\u0001\u0000\u0000\u0000\u0003\u00008=\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}