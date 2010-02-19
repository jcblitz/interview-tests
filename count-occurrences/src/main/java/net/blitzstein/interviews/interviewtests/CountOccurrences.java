package net.blitzstein.interviews.interviewtests;

/**
 *
 * @author Jared Blitzstein <blitzsteinj@gsicommerce.com>
 */
public class CountOccurrences {

    public static void main(String args[]) {
        CounterServiceCharAt counterService = new CounterServiceCharAt('7');
        int total = 0;
        for (int i = 0; i <= 100; i++) {
            total += counterService.getOccurrences(i);
        }

        System.out.println("There are " + total + " 7's");
    }
}
