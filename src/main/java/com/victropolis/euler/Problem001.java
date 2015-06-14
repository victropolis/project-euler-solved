package com.victropolis.euler;

/**
 * Created by victropolis on 6/12/15.
 */
public class Problem001 extends BaseProblem {
    /*
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

    Find the sum of all the multiples of 3 or 5 below 1000.
     */
    public static long solve(int below) {
        long answer = 0;

        for (int x = 1; x < below; x++) {
            if (x % 3 == 0 || x % 5 == 0) {
                answer += x;
            }
        }

        return answer;
    }
}
