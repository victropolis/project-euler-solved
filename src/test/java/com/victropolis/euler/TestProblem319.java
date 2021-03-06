package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem319 {
/*

Description (from https://projecteuler.net/problem=319):

Let x1, x2,..., xn be a sequence of length n such that:   x1 = 2 for all 1 &lt; i ≤ n : xi-1 &lt; xi for all i and j
with 1 ≤ i, j ≤ n : (xi) j &lt; (xj + 1)i    There are only five such sequences of length 2, namely: {2,4}, {2,5},
{2,6}, {2,7} and {2,8}. There are 293 such sequences of length 5; three examples are given below: {2,5,11,25,55}, {2,
6,14,36,88}, {2,8,22,64,181}.   Let t(n) denote the number of such sequences of length n. You are given that t(10) =
86195 and t(20) = 5227991891.   Find t(1010) and give your answer modulo 109.

*/

    @Test
    public void test() {
        Assert.assertEquals(268457129L, Problem319.solve(/* change signature to provide required inputs */));
    }
}

