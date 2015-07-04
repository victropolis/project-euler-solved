package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem282 {
/*

Description (from https://projecteuler.net/problem=282):

For non-negative integers m, n, the Ackermann function A(m, n) is defined as follows:      For example A(1, 0) = 2, A
(2, 2) = 7 and A(3, 4) = 125.   Find A(n, n) and give your answer mod 148.

*/

    @Test
    public void test() {
        Assert.assertEquals(1098988351L, Problem282.solve(/* change signature to provide required inputs */));
    }
}

