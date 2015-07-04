package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem087 {
/*

Description (from https://projecteuler.net/problem=87):

The smallest number expressible as the sum of a prime square, prime cube, and prime fourth power is 28. In fact,
there are exactly four numbers below fifty that can be expressed in such a way: 28 = 22 + 23 + 24 33 = 32 + 23 + 24
49 = 52 + 23 + 24 47 = 22 + 33 + 24 How many numbers below fifty million can be expressed as the sum of a prime
square, prime cube, and prime fourth power?

*/

    @Test
    public void test() {
        Assert.assertEquals(1097343L, Problem087.solve(/* change signature to provide required inputs */));
    }
}

