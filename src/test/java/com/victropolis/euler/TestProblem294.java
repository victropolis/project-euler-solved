package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem294 {
/*

Description (from https://projecteuler.net/problem=294):

For a positive integer k, define d(k) as the sum of the digits of k in its usual decimal representation. Thus d(42) =
 4+2 = 6.   For a positive integer n, define S(n) as the number of positive integers k &lt; 10n with the following
 properties :   k is divisible by 23 and  d(k) = 23.    You are given that S(9) = 263626 and S(42) = 6377168878570056
 .   Find S(1112) and give your answer mod 109.

*/

    @Test
    public void test() {
        Assert.assertEquals(789184709L, Problem294.solve(/* change signature to provide required inputs */));
    }
}

