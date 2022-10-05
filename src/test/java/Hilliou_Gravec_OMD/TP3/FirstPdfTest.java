package Hilliou_Gravec_OMD.TP3;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class FirstPdfTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public FirstPdfTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( FirstPdfTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testFirstPdf()
    {
        assertTrue( true );
    }
}
