// Generated from FrassonGrammar.g4 by ANTLR 4.13.2
package io.compiler.core;

	import java.util.ArrayList;
	import java.util.Stack;
	import java.util.HashMap;
	import io.compiler.types.*;
	import io.compiler.core.ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FrassonGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, OP=15, OP_AT=16, OPREL=17, 
		ENQUANTO=18, FACA=19, FIMENQUANTO=20, ID=21, NUM=22, VIRG=23, PV=24, AP=25, 
		FP=26, DP=27, TEXTO=28, WS=29, COMMENT=30;
	public static final int
		RULE_programa = 0, RULE_declaravar = 1, RULE_comando = 2, RULE_cmdWhile = 3, 
		RULE_cmdIF = 4, RULE_cmdAttrib = 5, RULE_cmdLeitura = 6, RULE_cmdEscrita = 7, 
		RULE_expr = 8, RULE_termo = 9, RULE_exprl = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaravar", "comando", "cmdWhile", "cmdIF", "cmdAttrib", 
			"cmdLeitura", "cmdEscrita", "expr", "termo", "exprl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'inicio'", "'fim'", "'fimprog'", "'declare'", "'number'", 
			"'text'", "'real'", "'se'", "'entao'", "'senao'", "'fimse'", "'leia'", 
			"'escreva'", null, "':='", null, "'enquanto'", "'faca'", "'fimenquanto'", 
			null, null, "','", "';'", "'('", "')'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "OP", "OP_AT", "OPREL", "ENQUANTO", "FACA", "FIMENQUANTO", 
			"ID", "NUM", "VIRG", "PV", "AP", "FP", "DP", "TEXTO", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "FrassonGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private HashMap<String,Var> symbolTable = new HashMap<String, Var>();
	    private ArrayList<Var> currentDecl = new ArrayList<Var>();
	    private Types currentType;
	    private Types leftType=null, rightType=null;
	    private Program program = new Program();
	    private String strExpr = "";
	    private CommandIf currentCommandIf;
	    
	    private Stack<ArrayList<Command>> stack = new Stack<ArrayList<Command>>();
	    
	    public void updateType(){
	    	for(Var v: currentDecl){
	    	   v.setType(currentType);
	    	   symbolTable.put(v.getId(), v);
	    	}
	    }
	    
	    public Program getProgram(){
	    	return this.program;
	    }
	    
	    public boolean isDeclared(String id){
	    	return symbolTable.get(id) != null;
	    }
	    
	    public void checkUnusedVariables() {
		    for (String varName : symbolTable.keySet()) {
		        Var var = symbolTable.get(varName);
		        if (!var.isUsed()) {
		            System.out.println("Warning: Variable '" + varName + "' declared but not used.");
		        }
		    }
	    }

	public FrassonGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FrassonGrammarParser.ID, 0); }
		public List<DeclaravarContext> declaravar() {
			return getRuleContexts(DeclaravarContext.class);
		}
		public DeclaravarContext declaravar(int i) {
			return getRuleContext(DeclaravarContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrassonGrammarListener ) ((FrassonGrammarListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrassonGrammarListener ) ((FrassonGrammarListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__0);
			setState(23);
			match(ID);
			 program.setName(_input.LT(-1).getText());
			                               stack.push(new ArrayList<Command>()); 
			                             
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(25);
				declaravar();
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
			setState(30);
			match(T__1);
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				comando();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2384384L) != 0) );
			setState(36);
			match(T__2);
			setState(37);
			match(T__3);

			                  program.setSymbolTable(symbolTable);
			                  program.setCommandList(stack.pop());
			                  checkUnusedVariables();
			               
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
	public static class DeclaravarContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(FrassonGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FrassonGrammarParser.ID, i);
		}
		public TerminalNode DP() { return getToken(FrassonGrammarParser.DP, 0); }
		public TerminalNode PV() { return getToken(FrassonGrammarParser.PV, 0); }
		public List<TerminalNode> VIRG() { return getTokens(FrassonGrammarParser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(FrassonGrammarParser.VIRG, i);
		}
		public DeclaravarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaravar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrassonGrammarListener ) ((FrassonGrammarListener)listener).enterDeclaravar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrassonGrammarListener ) ((FrassonGrammarListener)listener).exitDeclaravar(this);
		}
	}

	public final DeclaravarContext declaravar() throws RecognitionException {
		DeclaravarContext _localctx = new DeclaravarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaravar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__4);
			 currentDecl.clear(); 
			setState(42);
			match(ID);
			 currentDecl.add(new Var(_input.LT(-1).getText()));
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRG) {
				{
				{
				setState(44);
				match(VIRG);
				setState(45);
				match(ID);
				 currentDecl.add(new Var(_input.LT(-1).getText())); 
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			match(DP);
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(53);
				match(T__5);
				currentType = Types.NUMBER;
				}
				break;
			case T__6:
				{
				setState(55);
				match(T__6);
				currentType = Types.TEXT;
				}
				break;
			case T__7:
				{
				setState(57);
				match(T__7);
				currentType = Types.REALNUMBER;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 updateType(); 
			setState(62);
			match(PV);
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
	public static class ComandoContext extends ParserRuleContext {
		public CmdAttribContext cmdAttrib() {
			return getRuleContext(CmdAttribContext.class,0);
		}
		public CmdLeituraContext cmdLeitura() {
			return getRuleContext(CmdLeituraContext.class,0);
		}
		public CmdEscritaContext cmdEscrita() {
			return getRuleContext(CmdEscritaContext.class,0);
		}
		public CmdIFContext cmdIF() {
			return getRuleContext(CmdIFContext.class,0);
		}
		public CmdWhileContext cmdWhile() {
			return getRuleContext(CmdWhileContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrassonGrammarListener ) ((FrassonGrammarListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrassonGrammarListener ) ((FrassonGrammarListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comando);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				cmdAttrib();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				cmdLeitura();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				cmdEscrita();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				cmdIF();
				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				cmdWhile();
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
	public static class CmdWhileContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(FrassonGrammarParser.ENQUANTO, 0); }
		public TerminalNode AP() { return getToken(FrassonGrammarParser.AP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(FrassonGrammarParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(FrassonGrammarParser.FP, 0); }
		public TerminalNode FACA() { return getToken(FrassonGrammarParser.FACA, 0); }
		public TerminalNode FIMENQUANTO() { return getToken(FrassonGrammarParser.FIMENQUANTO, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public CmdWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrassonGrammarListener ) ((FrassonGrammarListener)listener).enterCmdWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrassonGrammarListener ) ((FrassonGrammarListener)listener).exitCmdWhile(this);
		}
	}

	public final CmdWhileContext cmdWhile() throws RecognitionException {
		CmdWhileContext _localctx = new CmdWhileContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmdWhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ENQUANTO);
			 
					      	  CommandWhile cmdWhile = new CommandWhile();
					          stack.push(new ArrayList<Command>());
					          strExpr = "";
					      
			setState(73);
			match(AP);
			setState(74);
			expr();
			setState(75);
			match(OPREL);
			 strExpr += _input.LT(-1).getText(); 
			setState(77);
			expr();
			setState(78);
			match(FP);

					          cmdWhile.setExpression(strExpr);
					      
			setState(80);
			match(FACA);
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				comando();
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2384384L) != 0) );

					          cmdWhile.setLoopCommands(stack.pop());
					          stack.peek().add(cmdWhile);
					      
			setState(87);
			match(FIMENQUANTO);
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
	public static class CmdIFContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(FrassonGrammarParser.AP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(FrassonGrammarParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(FrassonGrammarParser.FP, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public CmdIFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrassonGrammarListener ) ((FrassonGrammarListener)listener).enterCmdIF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrassonGrammarListener ) ((FrassonGrammarListener)listener).exitCmdIF(this);
		}
	}

	public final CmdIFContext cmdIF() throws RecognitionException {
		CmdIFContext _localctx = new CmdIFContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cmdIF);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__8);
			 stack.push(new ArrayList<Command>()); strExpr = ""; currentCommandIf = new CommandIf(); 
			setState(91);
			match(AP);
			setState(92);
			expr();
			setState(93);
			match(OPREL);
			 strExpr += _input.LT(-1).getText(); 
			setState(95);
			expr();
			setState(96);
			match(FP);
			 currentCommandIf.setExpression(strExpr); 
			setState(98);
			match(T__9);
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(99);
				comando();
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2384384L) != 0) );
			 currentCommandIf.setTrueList(stack.pop()); 
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(105);
				match(T__10);
				 stack.push(new ArrayList<Command>()); 
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(107);
					comando();
					}
					}
					setState(110); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2384384L) != 0) );
				 currentCommandIf.setFalseList(stack.pop()); 
				}
			}

			setState(116);
			match(T__11);
			 stack.peek().add(currentCommandIf); 
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
	public static class CmdAttribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FrassonGrammarParser.ID, 0); }
		public TerminalNode OP_AT() { return getToken(FrassonGrammarParser.OP_AT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PV() { return getToken(FrassonGrammarParser.PV, 0); }
		public CmdAttribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAttrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrassonGrammarListener ) ((FrassonGrammarListener)listener).enterCmdAttrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrassonGrammarListener ) ((FrassonGrammarListener)listener).exitCmdAttrib(this);
		}
	}

	public final CmdAttribContext cmdAttrib() throws RecognitionException {
		CmdAttribContext _localctx = new CmdAttribContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmdAttrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ID);
			 
								strExpr = "";
					          if (!isDeclared(_input.LT(-1).getText())) {
					              throw new RuntimeException("Undeclared Variable: " + _input.LT(-1).getText());
					          }
					          symbolTable.get(_input.LT(-1).getText()).setInitialized(true);
					          symbolTable.get(_input.LT(-1).getText()).setUsed(true);
					          leftType = symbolTable.get(_input.LT(-1).getText()).getType();
					          String varName = _input.LT(-1).getText();
					      
			setState(121);
			match(OP_AT);
			setState(122);
			expr();
			setState(123);
			match(PV);

					        if (leftType.getValue() < rightType.getValue()) {
					            throw new RuntimeException("Type Mismatching on Assignment");
					        }
					        CommandAssign cmdAssign = new CommandAssign(varName, strExpr, leftType, rightType);
					        stack.peek().add(cmdAssign); 
					    
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
	public static class CmdLeituraContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(FrassonGrammarParser.AP, 0); }
		public TerminalNode ID() { return getToken(FrassonGrammarParser.ID, 0); }
		public TerminalNode FP() { return getToken(FrassonGrammarParser.FP, 0); }
		public TerminalNode PV() { return getToken(FrassonGrammarParser.PV, 0); }
		public CmdLeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrassonGrammarListener ) ((FrassonGrammarListener)listener).enterCmdLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrassonGrammarListener ) ((FrassonGrammarListener)listener).exitCmdLeitura(this);
		}
	}

	public final CmdLeituraContext cmdLeitura() throws RecognitionException {
		CmdLeituraContext _localctx = new CmdLeituraContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdLeitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__12);
			setState(127);
			match(AP);
			setState(128);
			match(ID);
			 
					          if (!isDeclared(_input.LT(-1).getText())) {
					              throw new RuntimeException("Undeclared Variable: "+_input.LT(-1).getText());
					          }
					          symbolTable.get(_input.LT(-1).getText()).setInitialized(true);
					          Command cmdRead = new CommandRead(symbolTable.get(_input.LT(-1).getText()));
					          stack.peek().add(cmdRead);
					      
			setState(130);
			match(FP);
			setState(131);
			match(PV);
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
	public static class CmdEscritaContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(FrassonGrammarParser.AP, 0); }
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode FP() { return getToken(FrassonGrammarParser.FP, 0); }
		public TerminalNode PV() { return getToken(FrassonGrammarParser.PV, 0); }
		public CmdEscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrassonGrammarListener ) ((FrassonGrammarListener)listener).enterCmdEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrassonGrammarListener ) ((FrassonGrammarListener)listener).exitCmdEscrita(this);
		}
	}

	public final CmdEscritaContext cmdEscrita() throws RecognitionException {
		CmdEscritaContext _localctx = new CmdEscritaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdEscrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__13);
			setState(134);
			match(AP);
			setState(135);
			termo();
			 Command cmdWrite = new CommandWrite(_input.LT(-1).getText()); stack.peek().add(cmdWrite); 
			setState(137);
			match(FP);
			setState(138);
			match(PV);
			 rightType = null; 
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
	public static class ExprContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public ExprlContext exprl() {
			return getRuleContext(ExprlContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrassonGrammarListener ) ((FrassonGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrassonGrammarListener ) ((FrassonGrammarListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			termo();
			 strExpr += _input.LT(-1).getText(); 
			setState(143);
			exprl();
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
	public static class TermoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FrassonGrammarParser.ID, 0); }
		public TerminalNode NUM() { return getToken(FrassonGrammarParser.NUM, 0); }
		public TerminalNode TEXTO() { return getToken(FrassonGrammarParser.TEXTO, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrassonGrammarListener ) ((FrassonGrammarListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrassonGrammarListener ) ((FrassonGrammarListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_termo);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(ID);
				 
				                    if (!isDeclared(_input.LT(-1).getText())) {
				                       throw new RuntimeException("Undeclared Variable: "+_input.LT(-1).getText());
				                    }
				                    if (!symbolTable.get(_input.LT(-1).getText()).isInitialized()){
				                       throw new RuntimeException("Variable "+_input.LT(-1).getText()+" has no value assigned");
				                    }
				                    if (rightType == null) {
				                       rightType = symbolTable.get(_input.LT(-1).getText()).getType();
				                    }   
				                    else {
				                       if (symbolTable.get(_input.LT(-1).getText()).getType().getValue() > rightType.getValue()) {
				                          rightType = symbolTable.get(_input.LT(-1).getText()).getType();
				                       }
				                    }
				                  
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(NUM);
				 if (rightType == null) { rightType = Types.NUMBER; } else if (rightType.getValue() < Types.NUMBER.getValue()) { rightType = Types.NUMBER; } 
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(TEXTO);
				 if (rightType == null) { rightType = Types.TEXT; } else if (rightType.getValue() < Types.TEXT.getValue()) { rightType = Types.TEXT; } 
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
	public static class ExprlContext extends ParserRuleContext {
		public List<TerminalNode> OP() { return getTokens(FrassonGrammarParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(FrassonGrammarParser.OP, i);
		}
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public ExprlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FrassonGrammarListener ) ((FrassonGrammarListener)listener).enterExprl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FrassonGrammarListener ) ((FrassonGrammarListener)listener).exitExprl(this);
		}
	}

	public final ExprlContext exprl() throws RecognitionException {
		ExprlContext _localctx = new ExprlContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exprl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(153);
				match(OP);
				 strExpr += _input.LT(-1).getText(); 
				setState(155);
				termo();
				 strExpr += _input.LT(-1).getText(); 
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		"\u0004\u0001\u001e\u00a4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0004\u0000\u001b\b\u0000\u000b\u0000\f\u0000"+
		"\u001c\u0001\u0000\u0001\u0000\u0004\u0000!\b\u0000\u000b\u0000\f\u0000"+
		"\"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"0\b\u0001\n\u0001\f\u00013\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001<\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002F\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003S\b\u0003\u000b\u0003"+
		"\f\u0003T\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004e\b\u0004\u000b\u0004"+
		"\f\u0004f\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004"+
		"m\b\u0004\u000b\u0004\f\u0004n\u0001\u0004\u0001\u0004\u0003\u0004s\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u0098\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u009f\b\n\n\n\f\n\u00a2\t\n\u0001\n\u0000\u0000\u000b"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0000\u00a8"+
		"\u0000\u0016\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000\u0004"+
		"E\u0001\u0000\u0000\u0000\u0006G\u0001\u0000\u0000\u0000\bY\u0001\u0000"+
		"\u0000\u0000\nw\u0001\u0000\u0000\u0000\f~\u0001\u0000\u0000\u0000\u000e"+
		"\u0085\u0001\u0000\u0000\u0000\u0010\u008d\u0001\u0000\u0000\u0000\u0012"+
		"\u0097\u0001\u0000\u0000\u0000\u0014\u00a0\u0001\u0000\u0000\u0000\u0016"+
		"\u0017\u0005\u0001\u0000\u0000\u0017\u0018\u0005\u0015\u0000\u0000\u0018"+
		"\u001a\u0006\u0000\uffff\uffff\u0000\u0019\u001b\u0003\u0002\u0001\u0000"+
		"\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000"+
		"\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0005\u0002\u0000\u0000\u001f"+
		"!\u0003\u0004\u0002\u0000 \u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000"+
		"\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0001"+
		"\u0000\u0000\u0000$%\u0005\u0003\u0000\u0000%&\u0005\u0004\u0000\u0000"+
		"&\'\u0006\u0000\uffff\uffff\u0000\'\u0001\u0001\u0000\u0000\u0000()\u0005"+
		"\u0005\u0000\u0000)*\u0006\u0001\uffff\uffff\u0000*+\u0005\u0015\u0000"+
		"\u0000+1\u0006\u0001\uffff\uffff\u0000,-\u0005\u0017\u0000\u0000-.\u0005"+
		"\u0015\u0000\u0000.0\u0006\u0001\uffff\uffff\u0000/,\u0001\u0000\u0000"+
		"\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000"+
		"\u0000\u000024\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u00004;\u0005"+
		"\u001b\u0000\u000056\u0005\u0006\u0000\u00006<\u0006\u0001\uffff\uffff"+
		"\u000078\u0005\u0007\u0000\u00008<\u0006\u0001\uffff\uffff\u00009:\u0005"+
		"\b\u0000\u0000:<\u0006\u0001\uffff\uffff\u0000;5\u0001\u0000\u0000\u0000"+
		";7\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000"+
		"\u0000=>\u0006\u0001\uffff\uffff\u0000>?\u0005\u0018\u0000\u0000?\u0003"+
		"\u0001\u0000\u0000\u0000@F\u0003\n\u0005\u0000AF\u0003\f\u0006\u0000B"+
		"F\u0003\u000e\u0007\u0000CF\u0003\b\u0004\u0000DF\u0003\u0006\u0003\u0000"+
		"E@\u0001\u0000\u0000\u0000EA\u0001\u0000\u0000\u0000EB\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000F\u0005\u0001"+
		"\u0000\u0000\u0000GH\u0005\u0012\u0000\u0000HI\u0006\u0003\uffff\uffff"+
		"\u0000IJ\u0005\u0019\u0000\u0000JK\u0003\u0010\b\u0000KL\u0005\u0011\u0000"+
		"\u0000LM\u0006\u0003\uffff\uffff\u0000MN\u0003\u0010\b\u0000NO\u0005\u001a"+
		"\u0000\u0000OP\u0006\u0003\uffff\uffff\u0000PR\u0005\u0013\u0000\u0000"+
		"QS\u0003\u0004\u0002\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000VW\u0006\u0003\uffff\uffff\u0000WX\u0005\u0014\u0000\u0000"+
		"X\u0007\u0001\u0000\u0000\u0000YZ\u0005\t\u0000\u0000Z[\u0006\u0004\uffff"+
		"\uffff\u0000[\\\u0005\u0019\u0000\u0000\\]\u0003\u0010\b\u0000]^\u0005"+
		"\u0011\u0000\u0000^_\u0006\u0004\uffff\uffff\u0000_`\u0003\u0010\b\u0000"+
		"`a\u0005\u001a\u0000\u0000ab\u0006\u0004\uffff\uffff\u0000bd\u0005\n\u0000"+
		"\u0000ce\u0003\u0004\u0002\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hr\u0006\u0004\uffff\uffff\u0000ij\u0005\u000b\u0000"+
		"\u0000jl\u0006\u0004\uffff\uffff\u0000km\u0003\u0004\u0002\u0000lk\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0006\u0004\uffff"+
		"\uffff\u0000qs\u0001\u0000\u0000\u0000ri\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0005\f\u0000\u0000uv\u0006"+
		"\u0004\uffff\uffff\u0000v\t\u0001\u0000\u0000\u0000wx\u0005\u0015\u0000"+
		"\u0000xy\u0006\u0005\uffff\uffff\u0000yz\u0005\u0010\u0000\u0000z{\u0003"+
		"\u0010\b\u0000{|\u0005\u0018\u0000\u0000|}\u0006\u0005\uffff\uffff\u0000"+
		"}\u000b\u0001\u0000\u0000\u0000~\u007f\u0005\r\u0000\u0000\u007f\u0080"+
		"\u0005\u0019\u0000\u0000\u0080\u0081\u0005\u0015\u0000\u0000\u0081\u0082"+
		"\u0006\u0006\uffff\uffff\u0000\u0082\u0083\u0005\u001a\u0000\u0000\u0083"+
		"\u0084\u0005\u0018\u0000\u0000\u0084\r\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0005\u000e\u0000\u0000\u0086\u0087\u0005\u0019\u0000\u0000\u0087\u0088"+
		"\u0003\u0012\t\u0000\u0088\u0089\u0006\u0007\uffff\uffff\u0000\u0089\u008a"+
		"\u0005\u001a\u0000\u0000\u008a\u008b\u0005\u0018\u0000\u0000\u008b\u008c"+
		"\u0006\u0007\uffff\uffff\u0000\u008c\u000f\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0003\u0012\t\u0000\u008e\u008f\u0006\b\uffff\uffff\u0000\u008f"+
		"\u0090\u0003\u0014\n\u0000\u0090\u0011\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0005\u0015\u0000\u0000\u0092\u0098\u0006\t\uffff\uffff\u0000\u0093\u0094"+
		"\u0005\u0016\u0000\u0000\u0094\u0098\u0006\t\uffff\uffff\u0000\u0095\u0096"+
		"\u0005\u001c\u0000\u0000\u0096\u0098\u0006\t\uffff\uffff\u0000\u0097\u0091"+
		"\u0001\u0000\u0000\u0000\u0097\u0093\u0001\u0000\u0000\u0000\u0097\u0095"+
		"\u0001\u0000\u0000\u0000\u0098\u0013\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0005\u000f\u0000\u0000\u009a\u009b\u0006\n\uffff\uffff\u0000\u009b\u009c"+
		"\u0003\u0012\t\u0000\u009c\u009d\u0006\n\uffff\uffff\u0000\u009d\u009f"+
		"\u0001\u0000\u0000\u0000\u009e\u0099\u0001\u0000\u0000\u0000\u009f\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a1\u0015\u0001\u0000\u0000\u0000\u00a2\u00a0"+
		"\u0001\u0000\u0000\u0000\u000b\u001c\"1;ETfnr\u0097\u00a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}