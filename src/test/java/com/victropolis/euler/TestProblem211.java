package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem211 {
/*

Description (from https://projecteuler.net/problem=211):

For a positive integer n, let σ2(n) be the sum of the squares of its divisors. For example,  σ 2(10) = 1 + 4 + 25 +
100 = 130.  Find the sum of all n, 0 &lt; n &lt; 64,000,000 such that σ2(n) is a perfect square.

*/

    @Test
    public void test() {
        Assert.assertEquals(1922364685L, Problem211.solve(/* change signature to provide required inputs */));
    }
}

