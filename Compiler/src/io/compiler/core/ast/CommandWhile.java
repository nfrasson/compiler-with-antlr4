package io.compiler.core.ast;

import java.util.ArrayList;

public class CommandWhile extends Command {
    private String expression;
    private ArrayList<Command> loopCommands;

    public CommandWhile() {}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public void setLoopCommands(ArrayList<Command> loopCommands) {
		this.loopCommands = loopCommands;
	}

    @Override
    public String generateTarget() {
        if (loopCommands.isEmpty()) {
            throw new RuntimeException("Erro: O bloco do laço 'while' está vazio.");
        }

        StringBuilder str = new StringBuilder();

        str.append("while (" + expression + ") {\n");

        for (Command cmd : loopCommands) {
            str.append(cmd.generateTarget());
        }

        str.append("}\n");
        
        return str.toString();
    }

    @Override
    public String toString() {
        return "While Command [expression=" + expression + "]";
    }
}
