package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem272 {
/*

Description (from https://projecteuler.net/problem=272):

For a positive number n, define C(n) as the number of the integers x, for which 1&lt;x&lt;n and x3≡1 mod n.   When
n=91, there are 8 possible values for x, namely : 9, 16, 22, 29, 53, 74, 79, 81. Thus, C(91)=8.  Find the sum of the
positive numbers n≤1011 for which C(n)=242.

*/

    @Test
    public void test() {
        Assert.assertEquals(8495585919506151122L, Problem272.solve(/* change signature to provide required inputs */));
    }
}

