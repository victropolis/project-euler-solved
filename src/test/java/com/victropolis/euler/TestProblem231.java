package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem231 {
/*

Description (from https://projecteuler.net/problem=231):

The binomial coefficient 10C3 = 120. 120 = 23 × 3 × 5 = 2 × 2 × 2 × 3 × 5, and 2 + 2 + 2 + 3 + 5 = 14. So the sum of
the terms in the prime factorisation of 10C3 is 14.  Find the sum of the terms in the prime factorisation of
20000000C15000000.

*/

    @Test
    public void test() {
        Assert.assertEquals(7526965179680L, Problem231.solve(/* change signature to provide required inputs */));
    }
}

