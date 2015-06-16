package com.victropolis.euler;

/**
 * Created by victropolis on 6/12/15.
 */
public class BaseProblem {
    protected static boolean isPrime(long number) {
        boolean isPrime = true;

        if (number == 1) {
            isPrime = false;
        }
        else {
            for (int x = 2; x*x <= number; x++) {
                if (number % x == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        return isPrime;
    }

    protected static boolean isPalindrome(String string) {
        for (int x = 0, y = string.length()-1; x < y; x++, y--) {
            if (string.charAt(x) != string.charAt(y)) {
                return false;
            }
        }

        return true;
    }

    protected static long squareOfSums(long high) {
        long sum = sum(high);
        return sum*sum;
    }

//    protected static long sum(long high) {
//        return high == 1 ? high : high + sum(--high);
//    }
    protected static long sum(long high) {
        long answer=0;

        for (long x = high;x > 0;x--) {
            answer+=x;
        }

        return answer;
    }

//    protected static long sumOfSquares(long high) {
//        return high == 1 ? high : (high*high) + sumOfSquares(--high);
//    }
    protected static long sumOfSquares(long high) {
        long answer=0;

        for (long x = high;x > 0;x--) {
            answer+=x*x;
        }

        return answer;
    }
}
