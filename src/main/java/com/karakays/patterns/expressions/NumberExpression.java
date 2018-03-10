package com.karakays.patterns.expressions;

public class NumberExpression implements MathExpression {
    private final int number;
    
    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int evaluate(MathContext context) {
        return number;
    }

    @Override
    public MathExpression replace(String var, MathExpression expr) {
        // TODO Auto-generated method stub
        return null;
    }
    
    
}
