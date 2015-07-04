package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem080 {
/*

Description (from https://projecteuler.net/problem=80):

It is well known that if the square root of a natural number is not an integer, then it is irrational. The decimal
expansion of such square roots is infinite without any repeating pattern at all. The square root of two is 1
.41421356237309504880..., and the digital sum of the first one hundred decimal digits is 475. For the first one
hundred natural numbers, find the total of the digital sums of the first one hundred decimal digits for all the
irrational square roots.

*/

    @Test
    public void test() {
        Assert.assertEquals(40886L, Problem080.solve(/* change signature to provide required inputs */));
    }
}

