package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem136 {
/*

Description (from https://projecteuler.net/problem=136):

The positive integers, x, y, and z, are consecutive terms of an arithmetic progression. Given that n is a positive
integer, the equation, x2 − y2 − z2 = n, has exactly one solution when n = 20: 132 − 102 − 72 = 20 In fact there are
twenty-five values of n below one hundred for which the equation has a unique solution. How many values of n less
than fifty million have exactly one solution?

*/

    @Test
    public void test() {
        Assert.assertEquals(2544559L, Problem136.solve(/* change signature to provide required inputs */));
    }
}

