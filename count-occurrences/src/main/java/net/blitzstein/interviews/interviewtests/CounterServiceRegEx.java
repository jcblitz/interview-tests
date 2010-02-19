package net.blitzstein.interviews.interviewtests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author BlitzsteinJ
 */
public class CounterServiceRegEx {

    private char subject;

    public CounterServiceRegEx(char subject) {
        this.subject = subject;
    }

    int getOccurrences(int i) {
        Pattern pattern = Pattern.compile(String.valueOf(subject));
        Matcher matcher =  pattern.matcher(String.valueOf(i));

        int total = 0;
        while (matcher.find()) {
               total++;
            }
        return total;
    }
}
