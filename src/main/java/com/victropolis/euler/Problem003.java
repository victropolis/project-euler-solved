package com.victropolis.euler;

/**
 * Created by victropolis on 6/12/15.
 */
public class Problem003 extends BaseProblem {
    /*
    The prime factors of 13195 are 5, 7, 13 and 29.

    What is the largest prime factor of the number 600851475143
    */
    public static long solve(long number) {
        long largestPrimeFactor = 0;

        for (long x = 2; x * x <= number; x++) {
            if (isPrime(x) && number % x == 0) {
                largestPrimeFactor = x;
            }
        }

//        The following is significantly slower than the above
//        for (long x=2; x <= number; x++) {
//            if (number % x == 0 && isPrime(number/x))
//            {
//                largestPrimeFactor = number/x;
//                break;
//            }
//        }
        return largestPrimeFactor;
    }
}
