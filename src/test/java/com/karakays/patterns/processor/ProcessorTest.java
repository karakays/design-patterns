package com.karakays.patterns.processor;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ProcessorTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ProcessorTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ProcessorTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
       Processor processor = new EventProcessor();
       processor.process();
       processor = new PerformanceLoggerProcessor(new EventProcessor());
       processor.process();
    }
}
