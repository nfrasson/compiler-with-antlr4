package io.compiler.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import io.compiler.core.FrassonGrammarLexer;
import io.compiler.core.FrassonGrammarParser;
import io.compiler.core.ast.Program;

public class Main {
	public static void main(String[] args) {
		try {
			FrassonGrammarLexer lexer;
			FrassonGrammarParser parser;
			
			lexer = new FrassonGrammarLexer(CharStreams.fromFileName("input.in"));
			
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			
			parser = new FrassonGrammarParser(tokenStream);
			
			
			System.out.println("Frasson Compiler");
			parser.programa();
			System.out.println("Compilation Finished");


			Program program = parser.getProgram();
			
			System.out.println(program.generateTarget());
			try {
				File f = new File(program.getName()+".java");
				FileWriter fr = new FileWriter(f);
				PrintWriter pr = new PrintWriter(fr);
				pr.println(program.generateTarget());
				pr.close();
			}
			catch (IOException ex) {
				ex.printStackTrace();
			}
			
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
