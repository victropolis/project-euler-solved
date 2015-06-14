package com.victropolis.euler;

/**
 * Created by victropolis on 6/12/15.
 */
public class BaseProblem {
    protected static boolean isPrime(long x) {
        boolean isPrime = false;

        if (x != 1) {
            if (x == 2 || x == 3) {
                isPrime = true;
            }
            else {
                int y = 2;

                do {
                    isPrime = (x % y != 0);
                } while (isPrime && ++y <= Math.sqrt(x));
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
