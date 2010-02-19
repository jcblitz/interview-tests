package net.blitzstein.interviews.interviewtests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jared Blitzstein <blitzsteinj@gsicommerce.com>
 */
public class CounterServiceTest {

    private CounterServiceCharAt countOccurances;

    @Before
    public void setUp() {
        this.countOccurances = new CounterServiceCharAt('7');
    }

    @Test
    public void testSingleOccurrence() {
        int result = countOccurances.getOccurrences(17);
        assertEquals(result, 1);
    }

    @Test
    public void testDoubleOccurrence() {
        int result = countOccurances.getOccurrences(77);
        assertEquals(result, 2);
    }

    @Test
    public void testZeroOccurrence() {
        int result = countOccurances.getOccurrences(5);
        assertEquals(result, 0);

    }
}
