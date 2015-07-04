package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem187 {
/*

Description (from https://projecteuler.net/problem=187):

A composite is a number containing at least two prime factors. For example, 15 = 3 × 5; 9 = 3 × 3; 12 = 2 × 2 × 3.
There are ten composites below thirty containing precisely two, not necessarily distinct, prime factors: 4, 6, 9, 10,
 14, 15, 21, 22, 25, 26. How many composite integers, n &lt; 108, have precisely two, not necessarily distinct, prime
  factors?

*/

    @Test
    public void test() {
        Assert.assertEquals(17427258L, Problem187.solve(/* change signature to provide required inputs */));
    }
}

