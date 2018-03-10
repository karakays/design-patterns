package com.karakays.patterns.expressions;

public interface MathExpression {
    
    int evaluate(MathContext context);

    MathExpression replace(String var, MathExpression expr);
}
