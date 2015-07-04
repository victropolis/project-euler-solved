package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem320 {
/*

Description (from https://projecteuler.net/problem=320):

Let N(i) be the smallest integer n such that n! is divisible by (i!)1234567890   Let S(u)=∑N(i) for 10 ≤ i ≤ u.   S
(1000)=614538266565663.   Find S(1 000 000) mod 1018.

*/

    @Test
    public void test() {
        Assert.assertEquals(278157919195482643L, Problem320.solve(/* change signature to provide required inputs */));
    }
}

