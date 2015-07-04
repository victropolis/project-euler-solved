package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem200 {
/*

Description (from https://projecteuler.net/problem=200):

We shall define a sqube to be a number of the form, p2q3, where p and q are distinct primes. For example, 200 = 5223
or 120072949 = 232613. The first five squbes are 72, 108, 200, 392, and 500. Interestingly, 200 is also the first
number for which you cannot change any single digit to make a prime; we shall call such numbers, prime-proof. The
next prime-proof sqube which contains the contiguous sub-string "200" is 1992008. Find the 200th prime-proof sqube
containing the contiguous sub-string "200".

*/

    @Test
    public void test() {
        Assert.assertEquals(229161792008L, Problem200.solve(/* change signature to provide required inputs */));
    }
}

