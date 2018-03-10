package com.karakays.patterns.expressions;

public class VariableExpression implements MathExpression {
    private final String var;
    
    public VariableExpression(String var) {
        this.var = var;
    }    

    @Override
    public int evaluate(MathContext context) {
        return context.lookup(var);
    }

    @Override
    public MathExpression replace(String var, MathExpression expr) {
        if(var.equals(var)) {
            return expr;
        } else {
            return new VariableExpression(var);
        }
    }
}
