package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem037 {
/*

Description (from https://projecteuler.net/problem=37):

The number 3797 has an interesting property. Being prime itself, it is possible to continuously remove digits from
left to right, and remain prime at each stage: 3797, 797, 97, and 7. Similarly we can work from right to left: 3797,
379, 37, and 3. Find the sum of the only eleven primes that are both truncatable from left to right and right to left
. NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.

*/

    @Test
    public void test() {
        Assert.assertEquals(748317L, Problem037.solve(/* change signature to provide required inputs */));
    }
}

