package com.karakays.patterns.expressions;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class MathExpressionsTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MathExpressionsTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( MathExpressionsTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        MathContext context = new MathContext();
        context.assign("x", 3);
        context.assign("y", 5);
        
        VariableExpression x = new VariableExpression("x");
        VariableExpression y = new VariableExpression("y");
        
        MathExpression addVarxpr = new AddExpression(x, y);

        MathExpression expr = new AddExpression(addVarxpr, new NumberExpression(1));
        
        // (x + y) + 1
        System.out.println(expr.evaluate(context));
    }
}
