package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem123 {
/*

Description (from https://projecteuler.net/problem=123):

Let pn be the nth prime: 2, 3, 5, 7, 11, ..., and let r be the remainder when (pn−1)n + (pn+1)n is divided by pn2.
For example, when n = 3, p3 = 5, and 43 + 63 = 280 ≡ 5 mod 25. The least value of n for which the remainder first
exceeds 109 is 7037. Find the least value of n for which the remainder first exceeds 1010.

*/

    @Test
    public void test() {
        Assert.assertEquals(21035L, Problem123.solve(/* change signature to provide required inputs */));
    }
}

