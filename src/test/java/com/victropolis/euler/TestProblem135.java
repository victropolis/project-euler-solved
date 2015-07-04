package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem135 {
/*

Description (from https://projecteuler.net/problem=135):

Given the positive integers, x, y, and z, are consecutive terms of an arithmetic progression, the least value of the
positive integer, n, for which the equation, x2 − y2 − z2 = n, has exactly two solutions is n = 27: 342 − 272 − 202 =
 122 − 92 − 62 = 27 It turns out that n = 1155 is the least value which has exactly ten solutions. How many values of
  n less than one million have exactly ten distinct solutions?

*/

    @Test
    public void test() {
        Assert.assertEquals(4989L, Problem135.solve(/* change signature to provide required inputs */));
    }
}

