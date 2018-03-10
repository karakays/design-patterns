package com.karakays.patterns.states;

import com.karakays.patterns.states.PayWithCardStrategy;
import com.karakays.patterns.states.TransactionContext;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PaymentStateTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PaymentStateTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PaymentStateTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
       TransactionContext context = new TransactionContext();
       PayWithCardStrategy strategy = new PayWithCardStrategy();
       
       strategy.process(context);
       strategy.process(context);
       strategy.process(context);
       strategy.process(context);
       strategy.process(context);
       strategy.process(context);
       strategy.process(context);
        
    }
}
