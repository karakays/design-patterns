package com.karakays.patterns.accounting;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AccountingCommandTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AccountingCommandTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AccountingCommandTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Account source = new Account(12L, 54);
        Account dest = new Account(21L, 40);
        
        AccountingCommand command = new AccountingPostCommand(12, source, dest);
        
        command.execute();
        
        assertTrue(source.getBalance() == 42);
        assertTrue(dest.getBalance() == 52);
        
        command.unexecute();
        
        assertTrue(source.getBalance() == 54);
        assertTrue(dest.getBalance() == 40);
    }
}
