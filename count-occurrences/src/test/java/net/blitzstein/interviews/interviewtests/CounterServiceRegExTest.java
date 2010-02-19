
package net.blitzstein.interviews.interviewtests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author BlitzsteinJ
 */
public class CounterServiceRegExTest {
    private CounterServiceRegEx counterServiceRegEx;
    
    public CounterServiceRegExTest() {
         this.counterServiceRegEx = new CounterServiceRegEx('7');
    }

   
    @Before
    public void setUp() {
    }

    
   @Test
    public void testSingleOccurrence() {
        int result = counterServiceRegEx.getOccurrences(17);
        assertEquals(result, 1);
    }

    @Test
    public void testDoubleOccurrence() {
        int result = counterServiceRegEx.getOccurrences(77);
        assertEquals(result, 2);
    }

    @Test
    public void testZeroOccurrence() {
        int result = counterServiceRegEx.getOccurrences(5);
        assertEquals(result, 0);

    }

}