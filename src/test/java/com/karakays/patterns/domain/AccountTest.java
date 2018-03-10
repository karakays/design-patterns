package com.karakays.patterns.domain;

import com.karakays.patterns.accounts.Account;
import com.karakays.patterns.accounts.CompositeAccount;
import com.karakays.patterns.accounts.SingleAccount;
import com.karakays.patterns.services.sms.SmsService;
import com.karakays.patterns.services.sms.SmsServiceImpl;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AccountTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AccountTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AccountTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Account single = new SingleAccount(3d);
        
        Account composite = new CompositeAccount();
        composite.add(new SingleAccount(5d));
        composite.add(new SingleAccount(13d));
        Account child = new CompositeAccount();
        child.add(new SingleAccount(1d));
        child.add(new SingleAccount(3d));
        composite.add(child);
        
        System.out.println(single.balance());
        System.out.println(composite.balance());
        
    }
}
