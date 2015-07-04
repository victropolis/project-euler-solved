package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem127 {
/*

Description (from https://projecteuler.net/problem=127):

The radical of n, rad(n), is the product of distinct prime factors of n. For example, 504 = 23 × 32 × 7, so rad(504)
= 2 × 3 × 7 = 42. We shall define the triplet of positive integers (a, b, c) to be an abc-hit if:  GCD(a, b) = GCD(a,
 c) = GCD(b, c) = 1 a &lt; b a + b = c rad(abc) &lt; c  For example, (5, 27, 32) is an abc-hit, because:  GCD(5, 27)
 = GCD(5, 32) = GCD(27, 32) = 1 5 &lt; 27 5 + 27 = 32 rad(4320) = 30 &lt; 32  It turns out that abc-hits are quite
 rare and there are only thirty-one abc-hits for c &lt; 1000, with ∑c = 12523. Find ∑c for c &lt; 120000.

*/

    @Test
    public void test() {
        Assert.assertEquals(18407904L, Problem127.solve(/* change signature to provide required inputs */));
    }
}

