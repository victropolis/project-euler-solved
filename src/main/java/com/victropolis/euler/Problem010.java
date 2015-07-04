package com.victropolis.euler;

/**
 * Created by victropolis on 6/12/15.
 */
public class Problem010 extends BaseProblem {
    /*
    The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

    Find the sum of all the primes below two million.
    */
    public static long solve(long below) {
        long sum = 0;
        for (int x = 1; x < below; x++) {
            if (isPrime(x)) {
                sum += x;
            }
        }
        return sum;
    }
}