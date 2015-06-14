package com.victropolis.euler;

/**
 * Created by victropolis on 6/12/15.
 */
public class Problem003 extends BaseProblem {
/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143
*/
    public static long solve(long of) {
        for (long x=2; x <= of; x++) {
            if (of % x == 0 && isPrime(of/x))
            {
                return of/x;
            }
        }

        return 0;
    }
}
