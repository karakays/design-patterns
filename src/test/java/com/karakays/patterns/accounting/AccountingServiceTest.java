package com.karakays.patterns.accounting;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AccountingServiceTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AccountingServiceTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AccountingServiceTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Account source = new Account(12L, 54);
        Account dest = new Account(21L, 40);
        
        AccountingService service = new AccountingService();
        
        service.execute(new AccountingPostCommand(12, source, dest));
        assertTrue(source.getBalance() == 42);
        assertTrue(dest.getBalance() == 52);
        
        service.execute(new AccountingPostCommand(5, source, dest));
        assertTrue(source.getBalance() == 37);
        assertTrue(dest.getBalance() == 57);
        
        service.execute(new AccountingPostCommand(6, source, dest));
        assertTrue(source.getBalance() == 31);
        assertTrue(dest.getBalance() == 63);

        service.undo();
        assertTrue(source.getBalance() == 37);
        assertTrue(dest.getBalance() == 57);
        
        service.redo();
        assertTrue(source.getBalance() == 31);
        assertTrue(dest.getBalance() == 63);
    }
}
