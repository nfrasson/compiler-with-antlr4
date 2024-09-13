// Generated from FrassonGrammar.g4 by ANTLR 4.13.2
package io.compiler.core;

	import java.util.ArrayList;
	import java.util.Stack;
	import java.util.HashMap;
	import io.compiler.types.*;
	import io.compiler.core.ast.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FrassonGrammarParser}.
 */
public interface FrassonGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FrassonGrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(FrassonGrammarParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrassonGrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(FrassonGrammarParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrassonGrammarParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaravar(FrassonGrammarParser.DeclaravarContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrassonGrammarParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaravar(FrassonGrammarParser.DeclaravarContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrassonGrammarParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(FrassonGrammarParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrassonGrammarParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(FrassonGrammarParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrassonGrammarParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void enterCmdWhile(FrassonGrammarParser.CmdWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrassonGrammarParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void exitCmdWhile(FrassonGrammarParser.CmdWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrassonGrammarParser#cmdIF}.
	 * @param ctx the parse tree
	 */
	void enterCmdIF(FrassonGrammarParser.CmdIFContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrassonGrammarParser#cmdIF}.
	 * @param ctx the parse tree
	 */
	void exitCmdIF(FrassonGrammarParser.CmdIFContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrassonGrammarParser#cmdAttrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdAttrib(FrassonGrammarParser.CmdAttribContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrassonGrammarParser#cmdAttrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdAttrib(FrassonGrammarParser.CmdAttribContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrassonGrammarParser#cmdLeitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeitura(FrassonGrammarParser.CmdLeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrassonGrammarParser#cmdLeitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeitura(FrassonGrammarParser.CmdLeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrassonGrammarParser#cmdEscrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscrita(FrassonGrammarParser.CmdEscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrassonGrammarParser#cmdEscrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscrita(FrassonGrammarParser.CmdEscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrassonGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(FrassonGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrassonGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(FrassonGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrassonGrammarParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(FrassonGrammarParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrassonGrammarParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(FrassonGrammarParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link FrassonGrammarParser#exprl}.
	 * @param ctx the parse tree
	 */
	void enterExprl(FrassonGrammarParser.ExprlContext ctx);
	/**
	 * Exit a parse tree produced by {@link FrassonGrammarParser#exprl}.
	 * @param ctx the parse tree
	 */
	void exitExprl(FrassonGrammarParser.ExprlContext ctx);
}