package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalculatorExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MUL=4, DIV=5, ADD=6, SUB=7, NUMBER=8, WS=9;
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
			null, "'('", "')'", "','", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "MUL", "DIV", "ADD", "SUB", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "CalculatorExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorExprParser(TokenStream input) {
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
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprVisitor ) return ((CalculatorExprVisitor<? extends T>)visitor).visitProg(this);
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
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprVisitor ) return ((CalculatorExprVisitor<? extends T>)visitor).visitExp(this);
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
	public static class IntInfixContext extends InfixContext {
		public TerminalNode NUMBER() { return getToken(CalculatorExprParser.NUMBER, 0); }
		public IntInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).enterIntInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).exitIntInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprVisitor ) return ((CalculatorExprVisitor<? extends T>)visitor).visitIntInfix(this);
			else return visitor.visitChildren(this);
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
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).enterParensInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).exitParensInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprVisitor ) return ((CalculatorExprVisitor<? extends T>)visitor).visitParensInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulInfixContext extends InfixContext {
		public List<InfixContext> infix() {
			return getRuleContexts(InfixContext.class);
		}
		public InfixContext infix(int i) {
			return getRuleContext(InfixContext.class,i);
		}
		public TerminalNode MUL() { return getToken(CalculatorExprParser.MUL, 0); }
		public MulInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).enterMulInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).exitMulInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprVisitor ) return ((CalculatorExprVisitor<? extends T>)visitor).visitMulInfix(this);
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
		public TerminalNode ADD() { return getToken(CalculatorExprParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CalculatorExprParser.SUB, 0); }
		public AddSubInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).enterAddSubInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).exitAddSubInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprVisitor ) return ((CalculatorExprVisitor<? extends T>)visitor).visitAddSubInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivInfixContext extends InfixContext {
		public List<InfixContext> infix() {
			return getRuleContexts(InfixContext.class);
		}
		public InfixContext infix(int i) {
			return getRuleContext(InfixContext.class,i);
		}
		public TerminalNode DIV() { return getToken(CalculatorExprParser.DIV, 0); }
		public DivInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).enterDivInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).exitDivInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprVisitor ) return ((CalculatorExprVisitor<? extends T>)visitor).visitDivInfix(this);
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
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				_localctx = new IntInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(18);
				match(NUMBER);
				}
				break;
			case T__0:
				{
				_localctx = new ParensInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(19);
				match(T__0);
				setState(20);
				infix(0);
				setState(21);
				match(T__1);
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
						_localctx = new MulInfixContext(new InfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(25);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(27);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MUL) {
							{
							setState(26);
							match(MUL);
							}
						}

						setState(29);
						infix(6);
						}
						break;
					case 2:
						{
						_localctx = new DivInfixContext(new InfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(30);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(31);
						match(DIV);
						}
						setState(32);
						infix(5);
						}
						break;
					case 3:
						{
						_localctx = new AddSubInfixContext(new InfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(33);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(34);
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
						setState(35);
						infix(4);
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
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).enterParensPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).exitParensPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprVisitor ) return ((CalculatorExprVisitor<? extends T>)visitor).visitParensPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubPrefixContext extends PrefixContext {
		public Token op;
		public List<PrefixContext> prefix() {
			return getRuleContexts(PrefixContext.class);
		}
		public PrefixContext prefix(int i) {
			return getRuleContext(PrefixContext.class,i);
		}
		public TerminalNode ADD() { return getToken(CalculatorExprParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CalculatorExprParser.SUB, 0); }
		public AddSubPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).enterAddSubPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).exitAddSubPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprVisitor ) return ((CalculatorExprVisitor<? extends T>)visitor).visitAddSubPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivPrefixContext extends PrefixContext {
		public Token op;
		public List<PrefixContext> prefix() {
			return getRuleContexts(PrefixContext.class);
		}
		public PrefixContext prefix(int i) {
			return getRuleContext(PrefixContext.class,i);
		}
		public TerminalNode MUL() { return getToken(CalculatorExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CalculatorExprParser.DIV, 0); }
		public MulDivPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).enterMulDivPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).exitMulDivPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprVisitor ) return ((CalculatorExprVisitor<? extends T>)visitor).visitMulDivPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntPrefixContext extends PrefixContext {
		public TerminalNode NUMBER() { return getToken(CalculatorExprParser.NUMBER, 0); }
		public IntPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).enterIntPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).exitIntPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprVisitor ) return ((CalculatorExprVisitor<? extends T>)visitor).visitIntPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prefix);
		int _la;
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
			case DIV:
				_localctx = new MulDivPrefixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				((MulDivPrefixContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
					((MulDivPrefixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(42);
				match(T__0);
				setState(43);
				prefix();
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(44);
						match(T__2);
						}
					}

					setState(47);
					prefix();
					}
					}
					setState(50); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 506L) != 0) );
				setState(52);
				match(T__1);
				}
				break;
			case ADD:
			case SUB:
				_localctx = new AddSubPrefixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
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
				setState(55);
				match(T__0);
				setState(56);
				prefix();
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(57);
						match(T__2);
						}
					}

					setState(60);
					prefix();
					}
					}
					setState(63); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 506L) != 0) );
				setState(65);
				match(T__1);
				}
				break;
			case NUMBER:
				_localctx = new IntPrefixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(NUMBER);
				}
				break;
			case T__0:
				_localctx = new ParensPrefixContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				match(T__0);
				setState(69);
				prefix();
				setState(70);
				match(T__1);
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
	public static class IntPostfixContext extends PostfixContext {
		public TerminalNode NUMBER() { return getToken(CalculatorExprParser.NUMBER, 0); }
		public IntPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).enterIntPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).exitIntPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprVisitor ) return ((CalculatorExprVisitor<? extends T>)visitor).visitIntPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivPostfixContext extends PostfixContext {
		public Token op;
		public List<PostfixContext> postfix() {
			return getRuleContexts(PostfixContext.class);
		}
		public PostfixContext postfix(int i) {
			return getRuleContext(PostfixContext.class,i);
		}
		public TerminalNode MUL() { return getToken(CalculatorExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CalculatorExprParser.DIV, 0); }
		public MulDivPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).enterMulDivPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).exitMulDivPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprVisitor ) return ((CalculatorExprVisitor<? extends T>)visitor).visitMulDivPostfix(this);
			else return visitor.visitChildren(this);
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
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).enterParensPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).exitParensPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprVisitor ) return ((CalculatorExprVisitor<? extends T>)visitor).visitParensPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubPostfixContext extends PostfixContext {
		public Token op;
		public List<PostfixContext> postfix() {
			return getRuleContexts(PostfixContext.class);
		}
		public PostfixContext postfix(int i) {
			return getRuleContext(PostfixContext.class,i);
		}
		public TerminalNode ADD() { return getToken(CalculatorExprParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CalculatorExprParser.SUB, 0); }
		public AddSubPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).enterAddSubPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorExprListener ) ((CalculatorExprListener)listener).exitAddSubPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorExprVisitor ) return ((CalculatorExprVisitor<? extends T>)visitor).visitAddSubPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_postfix);
		int _la;
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new MulDivPostfixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(T__0);
				setState(75);
				postfix();
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(76);
						match(T__2);
						}
					}

					setState(79);
					postfix();
					}
					}
					setState(82); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 266L) != 0) );
				setState(84);
				match(T__1);
				setState(85);
				((MulDivPostfixContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
					((MulDivPostfixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				_localctx = new AddSubPostfixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(T__0);
				setState(88);
				postfix();
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(89);
						match(T__2);
						}
					}

					setState(92);
					postfix();
					}
					}
					setState(95); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 266L) != 0) );
				setState(97);
				match(T__1);
				setState(98);
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
			case 3:
				_localctx = new IntPostfixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(NUMBER);
				}
				break;
			case 4:
				_localctx = new ParensPostfixContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				match(T__0);
				setState(102);
				postfix();
				setState(103);
				match(T__1);
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
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\tl\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0010"+
		"\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u0018\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u001c"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002%\b\u0002\n\u0002\f\u0002(\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003.\b\u0003\u0001"+
		"\u0003\u0004\u00031\b\u0003\u000b\u0003\f\u00032\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003;\b\u0003"+
		"\u0001\u0003\u0004\u0003>\b\u0003\u000b\u0003\f\u0003?\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003I\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004N\b\u0004"+
		"\u0001\u0004\u0004\u0004Q\b\u0004\u000b\u0004\f\u0004R\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004[\b"+
		"\u0004\u0001\u0004\u0004\u0004^\b\u0004\u000b\u0004\f\u0004_\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004j\b\u0004\u0001\u0004\u0000\u0001\u0004\u0005"+
		"\u0000\u0002\u0004\u0006\b\u0000\u0002\u0001\u0000\u0006\u0007\u0001\u0000"+
		"\u0004\u0005{\u0000\n\u0001\u0000\u0000\u0000\u0002\u000f\u0001\u0000"+
		"\u0000\u0000\u0004\u0017\u0001\u0000\u0000\u0000\u0006H\u0001\u0000\u0000"+
		"\u0000\bi\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000\u000b"+
		"\u0001\u0001\u0000\u0000\u0000\f\u0010\u0003\u0004\u0002\u0000\r\u0010"+
		"\u0003\u0006\u0003\u0000\u000e\u0010\u0003\b\u0004\u0000\u000f\f\u0001"+
		"\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u000e\u0001\u0000"+
		"\u0000\u0000\u0010\u0003\u0001\u0000\u0000\u0000\u0011\u0012\u0006\u0002"+
		"\uffff\uffff\u0000\u0012\u0018\u0005\b\u0000\u0000\u0013\u0014\u0005\u0001"+
		"\u0000\u0000\u0014\u0015\u0003\u0004\u0002\u0000\u0015\u0016\u0005\u0002"+
		"\u0000\u0000\u0016\u0018\u0001\u0000\u0000\u0000\u0017\u0011\u0001\u0000"+
		"\u0000\u0000\u0017\u0013\u0001\u0000\u0000\u0000\u0018&\u0001\u0000\u0000"+
		"\u0000\u0019\u001b\n\u0005\u0000\u0000\u001a\u001c\u0005\u0004\u0000\u0000"+
		"\u001b\u001a\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0001\u0000\u0000\u0000\u001d%\u0003\u0004\u0002\u0006\u001e"+
		"\u001f\n\u0004\u0000\u0000\u001f \u0005\u0005\u0000\u0000 %\u0003\u0004"+
		"\u0002\u0005!\"\n\u0003\u0000\u0000\"#\u0007\u0000\u0000\u0000#%\u0003"+
		"\u0004\u0002\u0004$\u0019\u0001\u0000\u0000\u0000$\u001e\u0001\u0000\u0000"+
		"\u0000$!\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000"+
		"\u0000\u0000&\'\u0001\u0000\u0000\u0000\'\u0005\u0001\u0000\u0000\u0000"+
		"(&\u0001\u0000\u0000\u0000)*\u0007\u0001\u0000\u0000*+\u0005\u0001\u0000"+
		"\u0000+0\u0003\u0006\u0003\u0000,.\u0005\u0003\u0000\u0000-,\u0001\u0000"+
		"\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/1\u0003"+
		"\u0006\u0003\u00000-\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0001\u0000\u0000"+
		"\u000045\u0005\u0002\u0000\u00005I\u0001\u0000\u0000\u000067\u0007\u0000"+
		"\u0000\u000078\u0005\u0001\u0000\u00008=\u0003\u0006\u0003\u00009;\u0005"+
		"\u0003\u0000\u0000:9\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000"+
		";<\u0001\u0000\u0000\u0000<>\u0003\u0006\u0003\u0000=:\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0005\u0002\u0000\u0000BI\u0001"+
		"\u0000\u0000\u0000CI\u0005\b\u0000\u0000DE\u0005\u0001\u0000\u0000EF\u0003"+
		"\u0006\u0003\u0000FG\u0005\u0002\u0000\u0000GI\u0001\u0000\u0000\u0000"+
		"H)\u0001\u0000\u0000\u0000H6\u0001\u0000\u0000\u0000HC\u0001\u0000\u0000"+
		"\u0000HD\u0001\u0000\u0000\u0000I\u0007\u0001\u0000\u0000\u0000JK\u0005"+
		"\u0001\u0000\u0000KP\u0003\b\u0004\u0000LN\u0005\u0003\u0000\u0000ML\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"OQ\u0003\b\u0004\u0000PM\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TU\u0005\u0002\u0000\u0000UV\u0007\u0001\u0000\u0000Vj\u0001\u0000"+
		"\u0000\u0000WX\u0005\u0001\u0000\u0000X]\u0003\b\u0004\u0000Y[\u0005\u0003"+
		"\u0000\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\^\u0003\b\u0004\u0000]Z\u0001\u0000\u0000\u0000^_"+
		"\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000ab\u0005\u0002\u0000\u0000bc\u0007\u0000"+
		"\u0000\u0000cj\u0001\u0000\u0000\u0000dj\u0005\b\u0000\u0000ef\u0005\u0001"+
		"\u0000\u0000fg\u0003\b\u0004\u0000gh\u0005\u0002\u0000\u0000hj\u0001\u0000"+
		"\u0000\u0000iJ\u0001\u0000\u0000\u0000iW\u0001\u0000\u0000\u0000id\u0001"+
		"\u0000\u0000\u0000ie\u0001\u0000\u0000\u0000j\t\u0001\u0000\u0000\u0000"+
		"\u000f\u000f\u0017\u001b$&-2:?HMRZ_i";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}