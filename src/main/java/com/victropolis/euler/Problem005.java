package com.victropolis.euler;

/**
 * Created by victropolis on 6/12/15.
 */
public class Problem005 extends BaseProblem {
    /*
    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
    */
    public static long smallestMultiple(long high) {
        long answer = high;

        for (int multiplier = 2; true; multiplier++) {
            if (isDivisibleBy(answer, high)) {
                break;
            } else {
                answer = high * multiplier;
            }
        }

        return answer;
    }

    private static boolean isDivisibleBy(long dividend, long divisor) {
        return divisor == 1 || (dividend % divisor == 0 && isDivisibleBy(dividend, --divisor));
    }
}
