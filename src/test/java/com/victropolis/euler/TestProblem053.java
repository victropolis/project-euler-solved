package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem053 {
/*

Description (from https://projecteuler.net/problem=53):

There are exactly ten ways of selecting three from five, 12345: 123, 124, 125, 134, 135, 145, 234, 235, 245, and 345
In combinatorics, we use the notation, 5C3 = 10. In general,     nCr =    n!  r!(n−r)!  ,where r ≤ n, n! = n×(n−1)
×...×3×2×1, and 0! = 1.     It is not until n = 23, that a value exceeds one-million: 23C10 = 1144066. How many, not
necessarily distinct, values of &nbsp;nCr, for 1 ≤ n ≤ 100, are greater than one-million?

*/

    @Test
    public void test() {
        Assert.assertEquals(4075L, Problem053.solve(/* change signature to provide required inputs */));
    }
}

