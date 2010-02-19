package net.blitzstein.interviews.interviewtests;

/**
 *
 * @author Jared Blitzstein <blitzsteinj@gsicommerce.com>
 */
public class CounterServiceCharAt {
    private char subject;

    public CounterServiceCharAt(char subject) {
        this.subject = subject;
    }


    int getOccurrences(int i) {
        String currentInstance = String.valueOf(i);
        int occurances = 0;

        char[] chars = currentInstance.toCharArray();
        for (char c : chars) {
            if (c == subject) {
                occurances++;
            }
        }

        return occurances;

    }
}
