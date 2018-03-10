package com.karakays.patterns.restrictions;

import com.karakays.patterns.restrictions.RestrictionContext.Type;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class RestrictionHandlerTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public RestrictionHandlerTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( RestrictionHandlerTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void shouldWithdrawPass()
    {
        NoRestriction restriction = new NoRestriction();
        restriction.linkWith(new LimitRestriction(10)).linkWith(new PhoneNumberRestriction())
        .linkWith(new CountryRestriction());
       
       RestrictionContext context = new RestrictionContext(Type.WITHDRAW, 5, "DE", "+90232");
       
       assertTrue(restriction.handle(context));
    }
    
    public void shoulPaymentPass()
    {
        NoRestriction restriction = new NoRestriction();
        restriction.linkWith(new LimitRestriction(10)).linkWith(new PhoneNumberRestriction())
        .linkWith(new CountryRestriction());
       
       RestrictionContext context = new RestrictionContext(Type.PAYMENT, 35, "DE", "+90232");
       
       assertTrue(restriction.handle(context));
    }
    
    public void countryLimitShouldFail()
    {
       NoRestriction restriction = new NoRestriction();
       restriction.linkWith(new LimitRestriction(10)).linkWith(new PhoneNumberRestriction())
       .linkWith(new CountryRestriction());
       
       RestrictionContext context = new RestrictionContext(Type.SEND, 12, "TR", "+90232");
       
       assertFalse(restriction.handle(context));
    }
}
