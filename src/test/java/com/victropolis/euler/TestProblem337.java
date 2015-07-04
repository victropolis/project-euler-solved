package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem337 {
/*

Description (from https://projecteuler.net/problem=337):

Let {a1, a2,..., an} be an integer sequence of length n such that:  a1 = 6 for all 1 ≤ i &lt; n : φ(ai) &lt; φ(ai+1)
&lt; ai &lt; ai+1 1  Let S(N) be the number of such sequences with an ≤ N. For example, S(10) = 4: {6}, {6, 8}, {6,
8, 9} and {6, 10}. We can verify that S(100) = 482073668 and S(10 000) mod 108 = 73808307. Find S(20 000 000) mod 108
. 1 φ denotes Euler's totient function.

*/

    @Test
    public void test() {
        Assert.assertEquals(85068035L, Problem337.solve(/* change signature to provide required inputs */));
    }
}

