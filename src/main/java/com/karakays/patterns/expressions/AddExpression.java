package com.karakays.patterns.expressions;

public class AddExpression implements MathExpression {
    private final MathExpression leftOperand;
    private final MathExpression rightOperand;
    
    public AddExpression(MathExpression left, MathExpression right) {
        this.leftOperand = left;
        this.rightOperand = right;
    }

    @Override
    public int evaluate(MathContext context) {
        return leftOperand.evaluate(context) + rightOperand.evaluate(context);
    }

    @Override
    public MathExpression replace(String var, MathExpression expr) {
        // TODO Auto-generated method stub
        return null;
    }

}
