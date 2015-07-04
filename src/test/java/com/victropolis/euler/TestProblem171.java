package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem171 {
/*

Description (from https://projecteuler.net/problem=171):

For a positive integer n, let f(n) be the sum of the squares of the digits (in base 10) of n, e.g. f(3) = 32 = 9, f
(25) = 22 + 52 = 4 + 25 = 29, f(442) = 42 + 42 + 22 = 16 + 16 + 4 = 36 Find the last nine digits of the sum of all n,
 0 &lt; n &lt; 1020, such that f(n) is a perfect square.

*/

    @Test
    public void test() {
        Assert.assertEquals(142989277L, Problem171.solve(/* change signature to provide required inputs */));
    }
}

