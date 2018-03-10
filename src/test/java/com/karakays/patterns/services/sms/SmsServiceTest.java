package com.karakays.patterns.services.sms;

import com.karakays.patterns.services.sms.SmsService;
import com.karakays.patterns.services.sms.SmsServiceImpl;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SmsServiceTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SmsServiceTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SmsServiceTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        SmsService service = new SmsServiceImpl();
        service.sendText("905353535", "Hello there!");
    }
}
