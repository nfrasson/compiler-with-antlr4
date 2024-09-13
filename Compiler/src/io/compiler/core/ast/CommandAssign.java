package io.compiler.core.ast;

import io.compiler.types.*;

public class CommandAssign extends Command {
    private String varName;
    private String expression;
    private Types varType;
    private Types exprType;

    public CommandAssign(String varName, String expression, Types varType, Types exprType) {
        this.varName = varName;
        this.expression = expression;
        this.varType = varType;
        this.exprType = exprType;
    }

    @Override
    public String generateTarget() {
    	if (varType == Types.NUMBER && exprType == Types.REALNUMBER) {
            throw new RuntimeException("Cannot assign a float value to an integer variable.");
        }
    	
        return varName + " = " + expression + ";" + "\n";
    }

    @Override
    public String toString() {
        return "CommandAssign [var=" + varName + ", expr=" + expression + "]";
    }
}