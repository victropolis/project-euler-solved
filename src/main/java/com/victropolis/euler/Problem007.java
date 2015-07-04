package com.victropolis.euler;

/**
 * Created by victropolis on 6/12/15.
 */
public class Problem007 extends BaseProblem {
    /*
    The sum of the squares of the first ten natural numbers is,

    12 + 22 + ... + 102 = 385
    The square of the sum of the first ten natural numbers is,

    (1 + 2 + ... + 10)2 = 552 = 3025
    Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
     3025 − 385 = 2640.

    Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the
     sum.
    */
    public static long nthPrime(long n) {
        long nthPrime = 0;

        long primeCounter = 0;

        if (primeCounter < n) {
            do {
                if (isPrime(++nthPrime)) {
                    primeCounter++;
                }
            } while (primeCounter < n);
        }

        return nthPrime;
    }
}