package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem521 {
/*

Description (from https://projecteuler.net/problem=521):

Let smpf(n) be the smallest prime factor of n. smpf(91)=7 because 91=7×13 and smpf(45)=3 because 45=3×3×5. Let S(n)
be the sum of smpf(i) for 2 ≤ i ≤ n. E.g. S(100)=1257.   Find S(1012) mod 109.

*/

    @Test
    public void test() {
        Assert.assertEquals(44389811L, Problem521.solve(/* change signature to provide required inputs */));
    }
}

