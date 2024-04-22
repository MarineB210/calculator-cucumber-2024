package parser.time;// Generated from /Users/sam/Documents/MA1/Software Evo/calculator-cucumber-2024/src/main/antlr4/Calculator/CalculatorExprTime.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalculatorExprTimeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, AM=5, PM=6, CETADD=7, CETSUB=8, ADD=9, 
		SUB=10, NUMBER=11, WS=12;
	public static final int
		RULE_prog = 0, RULE_exp = 1, RULE_infix = 2, RULE_prefix = 3, RULE_postfix = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "exp", "infix", "prefix", "postfix"
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

	@Override
	public String getGrammarFileName() { return "CalculatorExprTime.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorExprTimeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			exp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public InfixContext infix() {
			return getRuleContext(InfixContext.class,0);
		}
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exp);
		try {
			setState(15);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				infix(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				prefix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(14);
				postfix();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InfixContext extends ParserRuleContext {
		public InfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix; }
	 
		public InfixContext() { }
		public void copyFrom(InfixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensInfixContext extends InfixContext {
		public InfixContext infix() {
			return getRuleContext(InfixContext.class,0);
		}
		public ParensInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterParensInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitParensInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitParensInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DateInfixContext extends InfixContext {
		public Token op;
		public List<TerminalNode> NUMBER() { return getTokens(CalculatorExprTimeParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CalculatorExprTimeParser.NUMBER, i);
		}
		public TerminalNode AM() { return getToken(CalculatorExprTimeParser.AM, 0); }
		public TerminalNode PM() { return getToken(CalculatorExprTimeParser.PM, 0); }
		public TerminalNode CETADD() { return getToken(CalculatorExprTimeParser.CETADD, 0); }
		public TerminalNode CETSUB() { return getToken(CalculatorExprTimeParser.CETSUB, 0); }
		public DateInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterDateInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitDateInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitDateInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TimeInfixContext extends InfixContext {
		public Token op;
		public List<TerminalNode> NUMBER() { return getTokens(CalculatorExprTimeParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CalculatorExprTimeParser.NUMBER, i);
		}
		public TerminalNode AM() { return getToken(CalculatorExprTimeParser.AM, 0); }
		public TerminalNode PM() { return getToken(CalculatorExprTimeParser.PM, 0); }
		public TerminalNode CETADD() { return getToken(CalculatorExprTimeParser.CETADD, 0); }
		public TerminalNode CETSUB() { return getToken(CalculatorExprTimeParser.CETSUB, 0); }
		public TimeInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterTimeInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitTimeInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitTimeInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubInfixContext extends InfixContext {
		public Token op;
		public List<InfixContext> infix() {
			return getRuleContexts(InfixContext.class);
		}
		public InfixContext infix(int i) {
			return getRuleContext(InfixContext.class,i);
		}
		public TerminalNode ADD() { return getToken(CalculatorExprTimeParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CalculatorExprTimeParser.SUB, 0); }
		public AddSubInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterAddSubInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitAddSubInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitAddSubInfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixContext infix() throws RecognitionException {
		return infix(0);
	}

	private InfixContext infix(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InfixContext _localctx = new InfixContext(_ctx, _parentState);
		InfixContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_infix, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new TimeInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(18);
				match(NUMBER);
				setState(19);
				match(T__0);
				setState(20);
				match(NUMBER);
				setState(21);
				match(T__0);
				setState(22);
				match(NUMBER);
				setState(24);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(23);
					((TimeInfixContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AM || _la==PM) ) {
						((TimeInfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(32);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(26);
					((TimeInfixContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==CETADD || _la==CETSUB) ) {
						((TimeInfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(28); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(27);
							match(NUMBER);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(30); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new DateInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				match(NUMBER);
				setState(35);
				match(T__0);
				setState(36);
				match(NUMBER);
				setState(37);
				match(T__0);
				setState(38);
				match(NUMBER);
				setState(39);
				match(T__0);
				setState(40);
				match(NUMBER);
				setState(41);
				match(T__0);
				setState(42);
				match(NUMBER);
				setState(43);
				match(T__0);
				setState(44);
				match(NUMBER);
				setState(46);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(45);
					((DateInfixContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AM || _la==PM) ) {
						((DateInfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(48);
					((DateInfixContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==CETADD || _la==CETSUB) ) {
						((DateInfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(50); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(49);
							match(NUMBER);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(52); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new ParensInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(T__1);
				setState(57);
				infix(0);
				setState(58);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddSubInfixContext(new InfixContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_infix);
					setState(62);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(63);
					((AddSubInfixContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
						((AddSubInfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(64);
					infix(5);
					}
					} 
				}
				setState(69);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrefixContext extends ParserRuleContext {
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
	 
		public PrefixContext() { }
		public void copyFrom(PrefixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensPrefixContext extends PrefixContext {
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public ParensPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterParensPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitParensPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitParensPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DatePrefixContext extends PrefixContext {
		public Token op;
		public List<TerminalNode> NUMBER() { return getTokens(CalculatorExprTimeParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CalculatorExprTimeParser.NUMBER, i);
		}
		public TerminalNode AM() { return getToken(CalculatorExprTimeParser.AM, 0); }
		public TerminalNode PM() { return getToken(CalculatorExprTimeParser.PM, 0); }
		public TerminalNode CETADD() { return getToken(CalculatorExprTimeParser.CETADD, 0); }
		public TerminalNode CETSUB() { return getToken(CalculatorExprTimeParser.CETSUB, 0); }
		public DatePrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterDatePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitDatePrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitDatePrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubPrefixContext extends PrefixContext {
		public Token op;
		public TerminalNode ADD() { return getToken(CalculatorExprTimeParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CalculatorExprTimeParser.SUB, 0); }
		public List<PrefixContext> prefix() {
			return getRuleContexts(PrefixContext.class);
		}
		public PrefixContext prefix(int i) {
			return getRuleContext(PrefixContext.class,i);
		}
		public AddSubPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterAddSubPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitAddSubPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitAddSubPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TimePrefixContext extends PrefixContext {
		public Token op;
		public List<TerminalNode> NUMBER() { return getTokens(CalculatorExprTimeParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CalculatorExprTimeParser.NUMBER, i);
		}
		public TerminalNode AM() { return getToken(CalculatorExprTimeParser.AM, 0); }
		public TerminalNode PM() { return getToken(CalculatorExprTimeParser.PM, 0); }
		public TerminalNode CETADD() { return getToken(CalculatorExprTimeParser.CETADD, 0); }
		public TerminalNode CETSUB() { return getToken(CalculatorExprTimeParser.CETSUB, 0); }
		public TimePrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterTimePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitTimePrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitTimePrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prefix);
		int _la;
		try {
			int _alt;
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new AddSubPrefixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				((AddSubPrefixContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((AddSubPrefixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(71);
				match(T__1);
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(72);
					prefix();
					}
					break;
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__3) {
						{
						setState(75);
						match(T__3);
						}
					}

					setState(78);
					prefix();
					}
					}
					setState(81); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3604L) != 0) );
				setState(83);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new TimePrefixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(NUMBER);
				setState(86);
				match(T__0);
				setState(87);
				match(NUMBER);
				setState(88);
				match(T__0);
				setState(89);
				match(NUMBER);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AM || _la==PM) {
					{
					setState(90);
					((TimePrefixContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AM || _la==PM) ) {
						((TimePrefixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CETADD || _la==CETSUB) {
					{
					setState(93);
					((TimePrefixContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==CETADD || _la==CETSUB) ) {
						((TimePrefixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(95); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(94);
							match(NUMBER);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(97); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
				}

				}
				break;
			case 3:
				_localctx = new DatePrefixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				match(NUMBER);
				setState(102);
				match(T__0);
				setState(103);
				match(NUMBER);
				setState(104);
				match(T__0);
				setState(105);
				match(NUMBER);
				setState(106);
				match(T__0);
				setState(107);
				match(NUMBER);
				setState(108);
				match(T__0);
				setState(109);
				match(NUMBER);
				setState(110);
				match(T__0);
				setState(111);
				match(NUMBER);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AM || _la==PM) {
					{
					setState(112);
					((DatePrefixContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AM || _la==PM) ) {
						((DatePrefixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CETADD || _la==CETSUB) {
					{
					setState(115);
					((DatePrefixContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==CETADD || _la==CETSUB) ) {
						((DatePrefixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(117); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(116);
							match(NUMBER);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(119); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
				}

				}
				break;
			case 4:
				_localctx = new ParensPrefixContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				match(T__1);
				setState(124);
				prefix();
				setState(125);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixContext extends ParserRuleContext {
		public PostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix; }
	 
		public PostfixContext() { }
		public void copyFrom(PostfixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensPostfixContext extends PostfixContext {
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public ParensPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterParensPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitParensPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitParensPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubPostfixContext extends PostfixContext {
		public Token op;
		public TerminalNode ADD() { return getToken(CalculatorExprTimeParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CalculatorExprTimeParser.SUB, 0); }
		public List<PostfixContext> postfix() {
			return getRuleContexts(PostfixContext.class);
		}
		public PostfixContext postfix(int i) {
			return getRuleContext(PostfixContext.class,i);
		}
		public AddSubPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterAddSubPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitAddSubPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitAddSubPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TimePostfixContext extends PostfixContext {
		public Token op;
		public List<TerminalNode> NUMBER() { return getTokens(CalculatorExprTimeParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CalculatorExprTimeParser.NUMBER, i);
		}
		public TerminalNode AM() { return getToken(CalculatorExprTimeParser.AM, 0); }
		public TerminalNode PM() { return getToken(CalculatorExprTimeParser.PM, 0); }
		public TerminalNode CETADD() { return getToken(CalculatorExprTimeParser.CETADD, 0); }
		public TerminalNode CETSUB() { return getToken(CalculatorExprTimeParser.CETSUB, 0); }
		public TimePostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterTimePostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitTimePostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitTimePostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DatePostfixContext extends PostfixContext {
		public Token op;
		public List<TerminalNode> NUMBER() { return getTokens(CalculatorExprTimeParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CalculatorExprTimeParser.NUMBER, i);
		}
		public TerminalNode AM() { return getToken(CalculatorExprTimeParser.AM, 0); }
		public TerminalNode PM() { return getToken(CalculatorExprTimeParser.PM, 0); }
		public TerminalNode CETADD() { return getToken(CalculatorExprTimeParser.CETADD, 0); }
		public TerminalNode CETSUB() { return getToken(CalculatorExprTimeParser.CETSUB, 0); }
		public DatePostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).enterDatePostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprTimeListener ) ((CalculatorExprTimeListener)listener).exitDatePostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprTimeVisitor ) return ((CalculatorExprTimeVisitor<? extends T>)visitor).visitDatePostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_postfix);
		int _la;
		try {
			int _alt;
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new AddSubPostfixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(T__1);
				setState(131);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(130);
					postfix();
					}
					break;
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__3) {
						{
						setState(133);
						match(T__3);
						}
					}

					setState(136);
					postfix();
					}
					}
					setState(139); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2068L) != 0) );
				setState(141);
				match(T__2);
				setState(142);
				((AddSubPostfixContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((AddSubPostfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				_localctx = new TimePostfixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(NUMBER);
				setState(145);
				match(T__0);
				setState(146);
				match(NUMBER);
				setState(147);
				match(T__0);
				setState(148);
				match(NUMBER);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AM || _la==PM) {
					{
					setState(149);
					((TimePostfixContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AM || _la==PM) ) {
						((TimePostfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CETADD || _la==CETSUB) {
					{
					setState(152);
					((TimePostfixContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==CETADD || _la==CETSUB) ) {
						((TimePostfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(154); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(153);
							match(NUMBER);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(156); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
				}

				}
				break;
			case 3:
				_localctx = new DatePostfixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(NUMBER);
				setState(161);
				match(T__0);
				setState(162);
				match(NUMBER);
				setState(163);
				match(T__0);
				setState(164);
				match(NUMBER);
				setState(165);
				match(T__0);
				setState(166);
				match(NUMBER);
				setState(167);
				match(T__0);
				setState(168);
				match(NUMBER);
				setState(169);
				match(T__0);
				setState(170);
				match(NUMBER);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AM || _la==PM) {
					{
					setState(171);
					((DatePostfixContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AM || _la==PM) ) {
						((DatePostfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CETADD || _la==CETSUB) {
					{
					setState(174);
					((DatePostfixContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==CETADD || _la==CETSUB) ) {
						((DatePostfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(176); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(175);
							match(NUMBER);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(178); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
				}

				}
				break;
			case 4:
				_localctx = new ParensPostfixContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(T__1);
				setState(183);
				postfix();
				setState(184);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return infix_sempred((InfixContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean infix_sempred(InfixContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\f\u00bd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0010"+
		"\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u0019\b\u0002\u0001\u0002\u0001\u0002\u0004"+
		"\u0002\u001d\b\u0002\u000b\u0002\f\u0002\u001e\u0003\u0002!\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002/\b\u0002\u0001\u0002\u0001\u0002\u0004\u00023\b\u0002\u000b\u0002"+
		"\f\u00024\u0003\u00027\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002=\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002B\b\u0002\n\u0002\f\u0002E\t\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003J\b\u0003\u0001\u0003\u0003\u0003M\b\u0003\u0001\u0003"+
		"\u0004\u0003P\b\u0003\u000b\u0003\f\u0003Q\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\\\b\u0003\u0001\u0003\u0001\u0003\u0004\u0003`\b\u0003\u000b\u0003"+
		"\f\u0003a\u0003\u0003d\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003r\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0004\u0003v\b\u0003\u000b\u0003\f\u0003w\u0003\u0003z\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0080\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0084\b\u0004\u0001\u0004\u0003\u0004"+
		"\u0087\b\u0004\u0001\u0004\u0004\u0004\u008a\b\u0004\u000b\u0004\f\u0004"+
		"\u008b\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0097\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0004\u0004\u009b\b\u0004\u000b\u0004\f\u0004\u009c"+
		"\u0003\u0004\u009f\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u00ad\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0004\u0004\u00b1\b\u0004\u000b\u0004\f\u0004\u00b2\u0003\u0004\u00b5"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00bb"+
		"\b\u0004\u0001\u0004\u0000\u0001\u0004\u0005\u0000\u0002\u0004\u0006\b"+
		"\u0000\u0003\u0001\u0000\u0005\u0006\u0001\u0000\u0007\b\u0001\u0000\t"+
		"\n\u00da\u0000\n\u0001\u0000\u0000\u0000\u0002\u000f\u0001\u0000\u0000"+
		"\u0000\u0004<\u0001\u0000\u0000\u0000\u0006\u007f\u0001\u0000\u0000\u0000"+
		"\b\u00ba\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000\u000b"+
		"\u0001\u0001\u0000\u0000\u0000\f\u0010\u0003\u0004\u0002\u0000\r\u0010"+
		"\u0003\u0006\u0003\u0000\u000e\u0010\u0003\b\u0004\u0000\u000f\f\u0001"+
		"\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u000e\u0001\u0000"+
		"\u0000\u0000\u0010\u0003\u0001\u0000\u0000\u0000\u0011\u0012\u0006\u0002"+
		"\uffff\uffff\u0000\u0012\u0013\u0005\u000b\u0000\u0000\u0013\u0014\u0005"+
		"\u0001\u0000\u0000\u0014\u0015\u0005\u000b\u0000\u0000\u0015\u0016\u0005"+
		"\u0001\u0000\u0000\u0016\u0018\u0005\u000b\u0000\u0000\u0017\u0019\u0007"+
		"\u0000\u0000\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0018\u0019\u0001"+
		"\u0000\u0000\u0000\u0019 \u0001\u0000\u0000\u0000\u001a\u001c\u0007\u0001"+
		"\u0000\u0000\u001b\u001d\u0005\u000b\u0000\u0000\u001c\u001b\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f!\u0001\u0000\u0000"+
		"\u0000 \u001a\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!=\u0001"+
		"\u0000\u0000\u0000\"#\u0005\u000b\u0000\u0000#$\u0005\u0001\u0000\u0000"+
		"$%\u0005\u000b\u0000\u0000%&\u0005\u0001\u0000\u0000&\'\u0005\u000b\u0000"+
		"\u0000\'(\u0005\u0001\u0000\u0000()\u0005\u000b\u0000\u0000)*\u0005\u0001"+
		"\u0000\u0000*+\u0005\u000b\u0000\u0000+,\u0005\u0001\u0000\u0000,.\u0005"+
		"\u000b\u0000\u0000-/\u0007\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000"+
		"./\u0001\u0000\u0000\u0000/6\u0001\u0000\u0000\u000002\u0007\u0001\u0000"+
		"\u000013\u0005\u000b\u0000\u000021\u0001\u0000\u0000\u000034\u0001\u0000"+
		"\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001"+
		"\u0000\u0000\u000060\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"7=\u0001\u0000\u0000\u000089\u0005\u0002\u0000\u00009:\u0003\u0004\u0002"+
		"\u0000:;\u0005\u0003\u0000\u0000;=\u0001\u0000\u0000\u0000<\u0011\u0001"+
		"\u0000\u0000\u0000<\"\u0001\u0000\u0000\u0000<8\u0001\u0000\u0000\u0000"+
		"=C\u0001\u0000\u0000\u0000>?\n\u0004\u0000\u0000?@\u0007\u0002\u0000\u0000"+
		"@B\u0003\u0004\u0002\u0005A>\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D\u0005\u0001"+
		"\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0007\u0002\u0000\u0000"+
		"GI\u0005\u0002\u0000\u0000HJ\u0003\u0006\u0003\u0000IH\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000JO\u0001\u0000\u0000\u0000KM\u0005\u0004"+
		"\u0000\u0000LK\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000NP\u0003\u0006\u0003\u0000OL\u0001\u0000\u0000\u0000"+
		"PQ\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000ST\u0005\u0003\u0000\u0000T\u0080\u0001"+
		"\u0000\u0000\u0000UV\u0005\u000b\u0000\u0000VW\u0005\u0001\u0000\u0000"+
		"WX\u0005\u000b\u0000\u0000XY\u0005\u0001\u0000\u0000Y[\u0005\u000b\u0000"+
		"\u0000Z\\\u0007\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\c\u0001\u0000\u0000\u0000]_\u0007\u0001\u0000\u0000^`\u0005"+
		"\u000b\u0000\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000"+
		"\u0000c]\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\u0080\u0001"+
		"\u0000\u0000\u0000ef\u0005\u000b\u0000\u0000fg\u0005\u0001\u0000\u0000"+
		"gh\u0005\u000b\u0000\u0000hi\u0005\u0001\u0000\u0000ij\u0005\u000b\u0000"+
		"\u0000jk\u0005\u0001\u0000\u0000kl\u0005\u000b\u0000\u0000lm\u0005\u0001"+
		"\u0000\u0000mn\u0005\u000b\u0000\u0000no\u0005\u0001\u0000\u0000oq\u0005"+
		"\u000b\u0000\u0000pr\u0007\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000ry\u0001\u0000\u0000\u0000su\u0007\u0001\u0000"+
		"\u0000tv\u0005\u000b\u0000\u0000ut\u0001\u0000\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001"+
		"\u0000\u0000\u0000ys\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"z\u0080\u0001\u0000\u0000\u0000{|\u0005\u0002\u0000\u0000|}\u0003\u0006"+
		"\u0003\u0000}~\u0005\u0003\u0000\u0000~\u0080\u0001\u0000\u0000\u0000"+
		"\u007fF\u0001\u0000\u0000\u0000\u007fU\u0001\u0000\u0000\u0000\u007fe"+
		"\u0001\u0000\u0000\u0000\u007f{\u0001\u0000\u0000\u0000\u0080\u0007\u0001"+
		"\u0000\u0000\u0000\u0081\u0083\u0005\u0002\u0000\u0000\u0082\u0084\u0003"+
		"\b\u0004\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000"+
		"\u0000\u0000\u0084\u0089\u0001\u0000\u0000\u0000\u0085\u0087\u0005\u0004"+
		"\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0003\b\u0004"+
		"\u0000\u0089\u0086\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000"+
		"\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0003\u0000"+
		"\u0000\u008e\u008f\u0007\u0002\u0000\u0000\u008f\u00bb\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0005\u000b\u0000\u0000\u0091\u0092\u0005\u0001\u0000"+
		"\u0000\u0092\u0093\u0005\u000b\u0000\u0000\u0093\u0094\u0005\u0001\u0000"+
		"\u0000\u0094\u0096\u0005\u000b\u0000\u0000\u0095\u0097\u0007\u0000\u0000"+
		"\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000"+
		"\u0000\u0097\u009e\u0001\u0000\u0000\u0000\u0098\u009a\u0007\u0001\u0000"+
		"\u0000\u0099\u009b\u0005\u000b\u0000\u0000\u009a\u0099\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000"+
		"\u0000\u009e\u0098\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000"+
		"\u0000\u009f\u00bb\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u000b\u0000"+
		"\u0000\u00a1\u00a2\u0005\u0001\u0000\u0000\u00a2\u00a3\u0005\u000b\u0000"+
		"\u0000\u00a3\u00a4\u0005\u0001\u0000\u0000\u00a4\u00a5\u0005\u000b\u0000"+
		"\u0000\u00a5\u00a6\u0005\u0001\u0000\u0000\u00a6\u00a7\u0005\u000b\u0000"+
		"\u0000\u00a7\u00a8\u0005\u0001\u0000\u0000\u00a8\u00a9\u0005\u000b\u0000"+
		"\u0000\u00a9\u00aa\u0005\u0001\u0000\u0000\u00aa\u00ac\u0005\u000b\u0000"+
		"\u0000\u00ab\u00ad\u0007\u0000\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00b4\u0001\u0000\u0000"+
		"\u0000\u00ae\u00b0\u0007\u0001\u0000\u0000\u00af\u00b1\u0005\u000b\u0000"+
		"\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00bb\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0005\u0002\u0000\u0000\u00b7\u00b8\u0003\b\u0004\u0000"+
		"\u00b8\u00b9\u0005\u0003\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000"+
		"\u00ba\u0081\u0001\u0000\u0000\u0000\u00ba\u0090\u0001\u0000\u0000\u0000"+
		"\u00ba\u00a0\u0001\u0000\u0000\u0000\u00ba\u00b6\u0001\u0000\u0000\u0000"+
		"\u00bb\t\u0001\u0000\u0000\u0000\u001d\u000f\u0018\u001e .46<CILQ[acq"+
		"wy\u007f\u0083\u0086\u008b\u0096\u009c\u009e\u00ac\u00b2\u00b4\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}