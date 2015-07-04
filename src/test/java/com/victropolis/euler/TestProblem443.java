package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem443 {
/*

Description (from https://projecteuler.net/problem=443):

Let g(n) be a sequence defined as follows: g(4) = 13, g(n) = g(n-1) + gcd(n, g(n-1)) for n &gt; 4. The first few
values are:     n 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 ...   g(n) 13 14 16 17 18 27 28 29 30 31 32 33 34 51
54 55 60 ...     You are given that g(1&nbsp;000) = 2524 and g(1&nbsp;000&nbsp;000) = 2624152. Find g(1015).

*/

    @Test
    public void test() {
        Assert.assertEquals(2744233049300770L, Problem443.solve(/* change signature to provide required inputs */));
    }
}

