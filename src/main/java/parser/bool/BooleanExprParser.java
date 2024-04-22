// Generated from /home/marinebodson/Documents/Ecole/MASTER1/Software-Evol/calculator-cucumber-2024/src/main/antlr4/Calculator/BooleanExpr.g4 by ANTLR 4.13.1
package parser.bool;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BooleanExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, NOT=4, AND=5, OR=6, IMPL=7, XOR=8, EQ=9, BOOL=10, 
		WS=11;
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
			null, "'('", "')'", "','", "'NOT'", "'AND'", "'OR'", "'IMPL'", "'XOR'", 
			"'EQ'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "NOT", "AND", "OR", "IMPL", "XOR", "EQ", "BOOL", 
			"WS"
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
	public String getGrammarFileName() { return "BooleanExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BooleanExprParser(TokenStream input) {
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
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanExprVisitor ) return ((BooleanExprVisitor<? extends T>)visitor).visitProg(this);
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
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanExprVisitor ) return ((BooleanExprVisitor<? extends T>)visitor).visitExp(this);
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
				postfix(0);
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
	public static class ParensBoolInfixContext extends InfixContext {
		public InfixContext infix() {
			return getRuleContext(InfixContext.class,0);
		}
		public ParensBoolInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).enterParensBoolInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).exitParensBoolInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanExprVisitor ) return ((BooleanExprVisitor<? extends T>)visitor).visitParensBoolInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EQinfixContext extends InfixContext {
		public List<InfixContext> infix() {
			return getRuleContexts(InfixContext.class);
		}
		public InfixContext infix(int i) {
			return getRuleContext(InfixContext.class,i);
		}
		public TerminalNode EQ() { return getToken(BooleanExprParser.EQ, 0); }
		public EQinfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).enterEQinfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).exitEQinfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanExprVisitor ) return ((BooleanExprVisitor<? extends T>)visitor).visitEQinfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NOTinfixContext extends InfixContext {
		public TerminalNode NOT() { return getToken(BooleanExprParser.NOT, 0); }
		public InfixContext infix() {
			return getRuleContext(InfixContext.class,0);
		}
		public NOTinfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).enterNOTinfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).exitNOTinfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanExprVisitor ) return ((BooleanExprVisitor<? extends T>)visitor).visitNOTinfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ORinfixContext extends InfixContext {
		public List<InfixContext> infix() {
			return getRuleContexts(InfixContext.class);
		}
		public InfixContext infix(int i) {
			return getRuleContext(InfixContext.class,i);
		}
		public TerminalNode OR() { return getToken(BooleanExprParser.OR, 0); }
		public ORinfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).enterORinfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).exitORinfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanExprVisitor ) return ((BooleanExprVisitor<? extends T>)visitor).visitORinfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XORinfixContext extends InfixContext {
		public List<InfixContext> infix() {
			return getRuleContexts(InfixContext.class);
		}
		public InfixContext infix(int i) {
			return getRuleContext(InfixContext.class,i);
		}
		public TerminalNode XOR() { return getToken(BooleanExprParser.XOR, 0); }
		public XORinfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).enterXORinfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).exitXORinfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanExprVisitor ) return ((BooleanExprVisitor<? extends T>)visitor).visitXORinfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolInfixContext extends InfixContext {
		public TerminalNode BOOL() { return getToken(BooleanExprParser.BOOL, 0); }
		public BoolInfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).enterBoolInfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).exitBoolInfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanExprVisitor ) return ((BooleanExprVisitor<? extends T>)visitor).visitBoolInfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IMPLinfixContext extends InfixContext {
		public List<InfixContext> infix() {
			return getRuleContexts(InfixContext.class);
		}
		public InfixContext infix(int i) {
			return getRuleContext(InfixContext.class,i);
		}
		public TerminalNode IMPL() { return getToken(BooleanExprParser.IMPL, 0); }
		public IMPLinfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).enterIMPLinfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).exitIMPLinfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanExprVisitor ) return ((BooleanExprVisitor<? extends T>)visitor).visitIMPLinfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ANDinfixContext extends InfixContext {
		public List<InfixContext> infix() {
			return getRuleContexts(InfixContext.class);
		}
		public InfixContext infix(int i) {
			return getRuleContext(InfixContext.class,i);
		}
		public TerminalNode AND() { return getToken(BooleanExprParser.AND, 0); }
		public ANDinfixContext(InfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).enterANDinfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).exitANDinfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanExprVisitor ) return ((BooleanExprVisitor<? extends T>)visitor).visitANDinfix(this);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new NOTinfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(18);
				match(NOT);
				setState(19);
				infix(8);
				}
				break;
			case BOOL:
				{
				_localctx = new BoolInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(20);
				match(BOOL);
				}
				break;
			case T__0:
				{
				_localctx = new ParensBoolInfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(21);
				match(T__0);
				setState(22);
				infix(0);
				setState(23);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(42);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ANDinfixContext(new InfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(27);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(28);
						match(AND);
						setState(29);
						infix(8);
						}
						break;
					case 2:
						{
						_localctx = new ORinfixContext(new InfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(30);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(31);
						match(OR);
						setState(32);
						infix(7);
						}
						break;
					case 3:
						{
						_localctx = new IMPLinfixContext(new InfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(33);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(34);
						match(IMPL);
						setState(35);
						infix(6);
						}
						break;
					case 4:
						{
						_localctx = new XORinfixContext(new InfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(36);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(37);
						match(XOR);
						setState(38);
						infix(5);
						}
						break;
					case 5:
						{
						_localctx = new EQinfixContext(new InfixContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_infix);
						setState(39);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(40);
						match(EQ);
						setState(41);
						infix(4);
						}
						break;
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
	public static class IMPLprefixContext extends PrefixContext {
		public TerminalNode IMPL() { return getToken(BooleanExprParser.IMPL, 0); }
		public List<PrefixContext> prefix() {
			return getRuleContexts(PrefixContext.class);
		}
		public PrefixContext prefix(int i) {
			return getRuleContext(PrefixContext.class,i);
		}
		public IMPLprefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).enterIMPLprefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).exitIMPLprefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanExprVisitor ) return ((BooleanExprVisitor<? extends T>)visitor).visitIMPLprefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EQprefixContext extends PrefixContext {
		public TerminalNode EQ() { return getToken(BooleanExprParser.EQ, 0); }
		public List<PrefixContext> prefix() {
			return getRuleContexts(PrefixContext.class);
		}
		public PrefixContext prefix(int i) {
			return getRuleContext(PrefixContext.class,i);
		}
		public EQprefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).enterEQprefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).exitEQprefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanExprVisitor ) return ((BooleanExprVisitor<? extends T>)visitor).visitEQprefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ANDprefixContext extends PrefixContext {
		public TerminalNode AND() { return getToken(BooleanExprParser.AND, 0); }
		public List<PrefixContext> prefix() {
			return getRuleContexts(PrefixContext.class);
		}
		public PrefixContext prefix(int i) {
			return getRuleContext(PrefixContext.class,i);
		}
		public ANDprefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).enterANDprefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).exitANDprefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanExprVisitor ) return ((BooleanExprVisitor<? extends T>)visitor).visitANDprefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NOTprefixContext extends PrefixContext {
		public TerminalNode NOT() { return getToken(BooleanExprParser.NOT, 0); }
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public NOTprefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).enterNOTprefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).exitNOTprefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanExprVisitor ) return ((BooleanExprVisitor<? extends T>)visitor).visitNOTprefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ORprefixContext extends PrefixContext {
		public TerminalNode OR() { return getToken(BooleanExprParser.OR, 0); }
		public List<PrefixContext> prefix() {
			return getRuleContexts(PrefixContext.class);
		}
		public PrefixContext prefix(int i) {
			return getRuleContext(PrefixContext.class,i);
		}
		public ORprefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).enterORprefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).exitORprefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanExprVisitor ) return ((BooleanExprVisitor<? extends T>)visitor).visitORprefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensBoolPrefixContext extends PrefixContext {
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public ParensBoolPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).enterParensBoolPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).exitParensBoolPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanExprVisitor ) return ((BooleanExprVisitor<? extends T>)visitor).visitParensBoolPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolPrefixContext extends PrefixContext {
		public TerminalNode BOOL() { return getToken(BooleanExprParser.BOOL, 0); }
		public BoolPrefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).enterBoolPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).exitBoolPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanExprVisitor ) return ((BooleanExprVisitor<? extends T>)visitor).visitBoolPrefix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XORprefixContext extends PrefixContext {
		public TerminalNode XOR() { return getToken(BooleanExprParser.XOR, 0); }
		public List<PrefixContext> prefix() {
			return getRuleContexts(PrefixContext.class);
		}
		public PrefixContext prefix(int i) {
			return getRuleContext(PrefixContext.class,i);
		}
		public XORprefixContext(PrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).enterXORprefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).exitXORprefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanExprVisitor ) return ((BooleanExprVisitor<? extends T>)visitor).visitXORprefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prefix);
		int _la;
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NOTprefixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(NOT);
				setState(48);
				prefix();
				}
				break;
			case AND:
				_localctx = new ANDprefixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(AND);
				setState(50);
				match(T__0);
				setState(51);
				prefix();
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(52);
						match(T__2);
						}
					}

					setState(55);
					prefix();
					}
					}
					setState(58); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2042L) != 0) );
				setState(60);
				match(T__1);
				}
				break;
			case OR:
				_localctx = new ORprefixContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(OR);
				setState(63);
				match(T__0);
				setState(64);
				prefix();
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(65);
						match(T__2);
						}
					}

					setState(68);
					prefix();
					}
					}
					setState(71); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2042L) != 0) );
				setState(73);
				match(T__1);
				}
				break;
			case IMPL:
				_localctx = new IMPLprefixContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				match(IMPL);
				setState(76);
				match(T__0);
				setState(77);
				prefix();
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(78);
						match(T__2);
						}
					}

					setState(81);
					prefix();
					}
					}
					setState(84); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2042L) != 0) );
				setState(86);
				match(T__1);
				}
				break;
			case XOR:
				_localctx = new XORprefixContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				match(XOR);
				setState(89);
				match(T__0);
				setState(90);
				prefix();
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(91);
						match(T__2);
						}
					}

					setState(94);
					prefix();
					}
					}
					setState(97); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2042L) != 0) );
				setState(99);
				match(T__1);
				}
				break;
			case EQ:
				_localctx = new EQprefixContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(101);
				match(EQ);
				setState(102);
				match(T__0);
				setState(103);
				prefix();
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(104);
						match(T__2);
						}
					}

					setState(107);
					prefix();
					}
					}
					setState(110); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2042L) != 0) );
				setState(112);
				match(T__1);
				}
				break;
			case BOOL:
				_localctx = new BoolPrefixContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(114);
				match(BOOL);
				}
				break;
			case T__0:
				_localctx = new ParensBoolPrefixContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(115);
				match(T__0);
				setState(116);
				prefix();
				setState(117);
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
	public static class ANDpostfixContext extends PostfixContext {
		public List<PostfixContext> postfix() {
			return getRuleContexts(PostfixContext.class);
		}
		public PostfixContext postfix(int i) {
			return getRuleContext(PostfixContext.class,i);
		}
		public TerminalNode AND() { return getToken(BooleanExprParser.AND, 0); }
		public ANDpostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).enterANDpostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).exitANDpostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanExprVisitor ) return ((BooleanExprVisitor<? extends T>)visitor).visitANDpostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NOTpostfixContext extends PostfixContext {
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public TerminalNode NOT() { return getToken(BooleanExprParser.NOT, 0); }
		public NOTpostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).enterNOTpostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).exitNOTpostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanExprVisitor ) return ((BooleanExprVisitor<? extends T>)visitor).visitNOTpostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensBoolPostfixContext extends PostfixContext {
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public ParensBoolPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).enterParensBoolPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).exitParensBoolPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanExprVisitor ) return ((BooleanExprVisitor<? extends T>)visitor).visitParensBoolPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XORpostfixContext extends PostfixContext {
		public List<PostfixContext> postfix() {
			return getRuleContexts(PostfixContext.class);
		}
		public PostfixContext postfix(int i) {
			return getRuleContext(PostfixContext.class,i);
		}
		public TerminalNode XOR() { return getToken(BooleanExprParser.XOR, 0); }
		public XORpostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).enterXORpostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).exitXORpostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanExprVisitor ) return ((BooleanExprVisitor<? extends T>)visitor).visitXORpostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EQpostfixContext extends PostfixContext {
		public List<PostfixContext> postfix() {
			return getRuleContexts(PostfixContext.class);
		}
		public PostfixContext postfix(int i) {
			return getRuleContext(PostfixContext.class,i);
		}
		public TerminalNode EQ() { return getToken(BooleanExprParser.EQ, 0); }
		public EQpostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).enterEQpostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).exitEQpostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanExprVisitor ) return ((BooleanExprVisitor<? extends T>)visitor).visitEQpostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IMPLpostfixContext extends PostfixContext {
		public List<PostfixContext> postfix() {
			return getRuleContexts(PostfixContext.class);
		}
		public PostfixContext postfix(int i) {
			return getRuleContext(PostfixContext.class,i);
		}
		public TerminalNode IMPL() { return getToken(BooleanExprParser.IMPL, 0); }
		public IMPLpostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).enterIMPLpostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).exitIMPLpostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanExprVisitor ) return ((BooleanExprVisitor<? extends T>)visitor).visitIMPLpostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolPostfixContext extends PostfixContext {
		public TerminalNode BOOL() { return getToken(BooleanExprParser.BOOL, 0); }
		public BoolPostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).enterBoolPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).exitBoolPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanExprVisitor ) return ((BooleanExprVisitor<? extends T>)visitor).visitBoolPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ORpostfixContext extends PostfixContext {
		public List<PostfixContext> postfix() {
			return getRuleContexts(PostfixContext.class);
		}
		public PostfixContext postfix(int i) {
			return getRuleContext(PostfixContext.class,i);
		}
		public TerminalNode OR() { return getToken(BooleanExprParser.OR, 0); }
		public ORpostfixContext(PostfixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).enterORpostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BooleanExprListener ) ((BooleanExprListener)listener).exitORpostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BooleanExprVisitor ) return ((BooleanExprVisitor<? extends T>)visitor).visitORpostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixContext postfix() throws RecognitionException {
		return postfix(0);
	}

	private PostfixContext postfix(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixContext _localctx = new PostfixContext(_ctx, _parentState);
		PostfixContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_postfix, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				_localctx = new ANDpostfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(122);
				match(T__0);
				setState(123);
				postfix(0);
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(124);
						match(T__2);
						}
					}

					setState(127);
					postfix(0);
					}
					}
					setState(130); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1034L) != 0) );
				setState(132);
				match(T__1);
				setState(133);
				match(AND);
				}
				break;
			case 2:
				{
				_localctx = new ORpostfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				match(T__0);
				setState(136);
				postfix(0);
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(137);
						match(T__2);
						}
					}

					setState(140);
					postfix(0);
					}
					}
					setState(143); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1034L) != 0) );
				setState(145);
				match(T__1);
				setState(146);
				match(OR);
				}
				break;
			case 3:
				{
				_localctx = new IMPLpostfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				match(T__0);
				setState(149);
				postfix(0);
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(150);
						match(T__2);
						}
					}

					setState(153);
					postfix(0);
					}
					}
					setState(156); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1034L) != 0) );
				setState(158);
				match(T__1);
				setState(159);
				match(IMPL);
				}
				break;
			case 4:
				{
				_localctx = new XORpostfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(T__0);
				setState(162);
				postfix(0);
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(163);
						match(T__2);
						}
					}

					setState(166);
					postfix(0);
					}
					}
					setState(169); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1034L) != 0) );
				setState(171);
				match(T__1);
				setState(172);
				match(XOR);
				}
				break;
			case 5:
				{
				_localctx = new EQpostfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(T__0);
				setState(175);
				postfix(0);
				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(176);
						match(T__2);
						}
					}

					setState(179);
					postfix(0);
					}
					}
					setState(182); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1034L) != 0) );
				setState(184);
				match(T__1);
				setState(185);
				match(EQ);
				}
				break;
			case 6:
				{
				_localctx = new BoolPostfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				match(BOOL);
				}
				break;
			case 7:
				{
				_localctx = new ParensBoolPostfixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				match(T__0);
				setState(189);
				postfix(0);
				setState(190);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NOTpostfixContext(new PostfixContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_postfix);
					setState(194);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(195);
					match(NOT);
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
			return infix_sempred((InfixContext)_localctx, predIndex);
		case 4:
			return postfix_sempred((PostfixContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean infix_sempred(InfixContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean postfix_sempred(PostfixContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000b\u00ca\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u0010\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u001a\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002+\b\u0002\n\u0002\f\u0002.\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u00036\b\u0003\u0001\u0003\u0004\u00039\b\u0003\u000b\u0003\f\u0003"+
		":\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003C\b\u0003\u0001\u0003\u0004\u0003F\b\u0003\u000b\u0003\f\u0003"+
		"G\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003P\b\u0003\u0001\u0003\u0004\u0003S\b\u0003\u000b\u0003\f\u0003"+
		"T\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003]\b\u0003\u0001\u0003\u0004\u0003`\b\u0003\u000b\u0003\f\u0003"+
		"a\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003j\b\u0003\u0001\u0003\u0004\u0003m\b\u0003\u000b\u0003\f\u0003"+
		"n\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003x\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004~\b\u0004\u0001\u0004\u0004\u0004\u0081\b\u0004"+
		"\u000b\u0004\f\u0004\u0082\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u008b\b\u0004\u0001\u0004\u0004\u0004"+
		"\u008e\b\u0004\u000b\u0004\f\u0004\u008f\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0098\b\u0004\u0001"+
		"\u0004\u0004\u0004\u009b\b\u0004\u000b\u0004\f\u0004\u009c\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00a5\b\u0004\u0001\u0004\u0004\u0004\u00a8\b\u0004\u000b\u0004\f\u0004"+
		"\u00a9\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00b2\b\u0004\u0001\u0004\u0004\u0004\u00b5\b\u0004"+
		"\u000b\u0004\f\u0004\u00b6\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00c1\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u00c5\b\u0004\n\u0004\f\u0004\u00c8"+
		"\t\u0004\u0001\u0004\u0000\u0002\u0004\b\u0005\u0000\u0002\u0004\u0006"+
		"\b\u0000\u0000\u00ef\u0000\n\u0001\u0000\u0000\u0000\u0002\u000f\u0001"+
		"\u0000\u0000\u0000\u0004\u0019\u0001\u0000\u0000\u0000\u0006w\u0001\u0000"+
		"\u0000\u0000\b\u00c0\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001"+
		"\u0000\u000b\u0001\u0001\u0000\u0000\u0000\f\u0010\u0003\u0004\u0002\u0000"+
		"\r\u0010\u0003\u0006\u0003\u0000\u000e\u0010\u0003\b\u0004\u0000\u000f"+
		"\f\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u000e"+
		"\u0001\u0000\u0000\u0000\u0010\u0003\u0001\u0000\u0000\u0000\u0011\u0012"+
		"\u0006\u0002\uffff\uffff\u0000\u0012\u0013\u0005\u0004\u0000\u0000\u0013"+
		"\u001a\u0003\u0004\u0002\b\u0014\u001a\u0005\n\u0000\u0000\u0015\u0016"+
		"\u0005\u0001\u0000\u0000\u0016\u0017\u0003\u0004\u0002\u0000\u0017\u0018"+
		"\u0005\u0002\u0000\u0000\u0018\u001a\u0001\u0000\u0000\u0000\u0019\u0011"+
		"\u0001\u0000\u0000\u0000\u0019\u0014\u0001\u0000\u0000\u0000\u0019\u0015"+
		"\u0001\u0000\u0000\u0000\u001a,\u0001\u0000\u0000\u0000\u001b\u001c\n"+
		"\u0007\u0000\u0000\u001c\u001d\u0005\u0005\u0000\u0000\u001d+\u0003\u0004"+
		"\u0002\b\u001e\u001f\n\u0006\u0000\u0000\u001f \u0005\u0006\u0000\u0000"+
		" +\u0003\u0004\u0002\u0007!\"\n\u0005\u0000\u0000\"#\u0005\u0007\u0000"+
		"\u0000#+\u0003\u0004\u0002\u0006$%\n\u0004\u0000\u0000%&\u0005\b\u0000"+
		"\u0000&+\u0003\u0004\u0002\u0005\'(\n\u0003\u0000\u0000()\u0005\t\u0000"+
		"\u0000)+\u0003\u0004\u0002\u0004*\u001b\u0001\u0000\u0000\u0000*\u001e"+
		"\u0001\u0000\u0000\u0000*!\u0001\u0000\u0000\u0000*$\u0001\u0000\u0000"+
		"\u0000*\'\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-\u0005\u0001\u0000\u0000\u0000"+
		".,\u0001\u0000\u0000\u0000/0\u0005\u0004\u0000\u00000x\u0003\u0006\u0003"+
		"\u000012\u0005\u0005\u0000\u000023\u0005\u0001\u0000\u000038\u0003\u0006"+
		"\u0003\u000046\u0005\u0003\u0000\u000054\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u000067\u0001\u0000\u0000\u000079\u0003\u0006\u0003\u0000"+
		"85\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000"+
		"\u0000:;\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0005\u0002"+
		"\u0000\u0000=x\u0001\u0000\u0000\u0000>?\u0005\u0006\u0000\u0000?@\u0005"+
		"\u0001\u0000\u0000@E\u0003\u0006\u0003\u0000AC\u0005\u0003\u0000\u0000"+
		"BA\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DF\u0003\u0006\u0003\u0000EB\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IJ\u0005\u0002\u0000\u0000Jx\u0001\u0000\u0000\u0000"+
		"KL\u0005\u0007\u0000\u0000LM\u0005\u0001\u0000\u0000MR\u0003\u0006\u0003"+
		"\u0000NP\u0005\u0003\u0000\u0000ON\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0003\u0006\u0003\u0000RO\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0005\u0002\u0000"+
		"\u0000Wx\u0001\u0000\u0000\u0000XY\u0005\b\u0000\u0000YZ\u0005\u0001\u0000"+
		"\u0000Z_\u0003\u0006\u0003\u0000[]\u0005\u0003\u0000\u0000\\[\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0003"+
		"\u0006\u0003\u0000_\\\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"+
		"\u0000cd\u0005\u0002\u0000\u0000dx\u0001\u0000\u0000\u0000ef\u0005\t\u0000"+
		"\u0000fg\u0005\u0001\u0000\u0000gl\u0003\u0006\u0003\u0000hj\u0005\u0003"+
		"\u0000\u0000ih\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0001"+
		"\u0000\u0000\u0000km\u0003\u0006\u0003\u0000li\u0001\u0000\u0000\u0000"+
		"mn\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000pq\u0005\u0002\u0000\u0000qx\u0001\u0000"+
		"\u0000\u0000rx\u0005\n\u0000\u0000st\u0005\u0001\u0000\u0000tu\u0003\u0006"+
		"\u0003\u0000uv\u0005\u0002\u0000\u0000vx\u0001\u0000\u0000\u0000w/\u0001"+
		"\u0000\u0000\u0000w1\u0001\u0000\u0000\u0000w>\u0001\u0000\u0000\u0000"+
		"wK\u0001\u0000\u0000\u0000wX\u0001\u0000\u0000\u0000we\u0001\u0000\u0000"+
		"\u0000wr\u0001\u0000\u0000\u0000ws\u0001\u0000\u0000\u0000x\u0007\u0001"+
		"\u0000\u0000\u0000yz\u0006\u0004\uffff\uffff\u0000z{\u0005\u0001\u0000"+
		"\u0000{\u0080\u0003\b\u0004\u0000|~\u0005\u0003\u0000\u0000}|\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000"+
		"\u007f\u0081\u0003\b\u0004\u0000\u0080}\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0005\u0002\u0000\u0000\u0085\u0086\u0005\u0005\u0000\u0000\u0086"+
		"\u00c1\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u0001\u0000\u0000\u0088"+
		"\u008d\u0003\b\u0004\u0000\u0089\u008b\u0005\u0003\u0000\u0000\u008a\u0089"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0001\u0000\u0000\u0000\u008c\u008e\u0003\b\u0004\u0000\u008d\u008a\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u008d\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0005\u0002\u0000\u0000\u0092\u0093\u0005"+
		"\u0006\u0000\u0000\u0093\u00c1\u0001\u0000\u0000\u0000\u0094\u0095\u0005"+
		"\u0001\u0000\u0000\u0095\u009a\u0003\b\u0004\u0000\u0096\u0098\u0005\u0003"+
		"\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009b\u0003\b\u0004"+
		"\u0000\u009a\u0097\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0002\u0000"+
		"\u0000\u009f\u00a0\u0005\u0007\u0000\u0000\u00a0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0005\u0001\u0000\u0000\u00a2\u00a7\u0003\b\u0004\u0000"+
		"\u00a3\u00a5\u0005\u0003\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a8\u0003\b\u0004\u0000\u00a7\u00a4\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0005\u0002\u0000\u0000\u00ac\u00ad\u0005\b\u0000\u0000\u00ad\u00c1"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0001\u0000\u0000\u00af\u00b4"+
		"\u0003\b\u0004\u0000\u00b0\u00b2\u0005\u0003\u0000\u0000\u00b1\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b5\u0003\b\u0004\u0000\u00b4\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0005\u0002\u0000\u0000\u00b9\u00ba\u0005\t\u0000"+
		"\u0000\u00ba\u00c1\u0001\u0000\u0000\u0000\u00bb\u00c1\u0005\n\u0000\u0000"+
		"\u00bc\u00bd\u0005\u0001\u0000\u0000\u00bd\u00be\u0003\b\u0004\u0000\u00be"+
		"\u00bf\u0005\u0002\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0"+
		"y\u0001\u0000\u0000\u0000\u00c0\u0087\u0001\u0000\u0000\u0000\u00c0\u0094"+
		"\u0001\u0000\u0000\u0000\u00c0\u00a1\u0001\u0000\u0000\u0000\u00c0\u00ae"+
		"\u0001\u0000\u0000\u0000\u00c0\u00bb\u0001\u0000\u0000\u0000\u00c0\u00bc"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c6\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\n\b\u0000\u0000\u00c3\u00c5\u0005\u0004\u0000\u0000\u00c4\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\t\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u001b\u000f\u0019*,5"+
		":BGOT\\ainw}\u0082\u008a\u008f\u0097\u009c\u00a4\u00a9\u00b1\u00b6\u00c0"+
		"\u00c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}