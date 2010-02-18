package net.blitzstein.interviews.interviewtests;

/**
 *
 * @author Jared Blitzstein <blitzsteinj@gsicommerce.com>
 */
public class CountOccurances {

    public static void main(String args[]) {
        CounterService counterService = new CounterService('7');
        int total = 0;
        for (int i = 0; i <= 100; i++) {
            total += counterService.getOccurances(i);
        }

        System.out.println("There are " + total + " 7's");
    }
}
