package com.victropolis.euler;

/**
 * Created by victropolis on 6/12/15.
 */
public class Problem004 extends BaseProblem {
/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/
    public static long solve(long low, long high) {
        long largestPalindromeProduct = 0;

        for (long x = high; x >= low; x--) {
            for (long y = high; y >= low; y--) {
                long product = x*y;
                if (isPalindrome(String.valueOf(product)) && product > largestPalindromeProduct)
                {
                    largestPalindromeProduct = product;
                }
            }
        }

        return largestPalindromeProduct;
    }
}
