package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem049 {
/*

Description (from https://projecteuler.net/problem=49):

The arithmetic sequence, 1487, 4817, 8147, in which each of the terms increases by 3330, is unusual in two ways: (i)
each of the three terms are prime, and, (ii) each of the 4-digit numbers are permutations of one another. There are
no arithmetic sequences made up of three 1-, 2-, or 3-digit primes, exhibiting this property, but there is one other
4-digit increasing sequence. What 12-digit number do you form by concatenating the three terms in this sequence?

*/

    @Test
    public void test() {
        Assert.assertEquals(296962999629L, Problem049.solve(/* change signature to provide required inputs */));
    }
}

