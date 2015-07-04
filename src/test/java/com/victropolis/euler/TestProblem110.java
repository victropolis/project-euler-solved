package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem110 {
/*

Description (from https://projecteuler.net/problem=110):

In the following equation x, y, and n are positive integers.       1  x   +    1  y   =    1  n      It can be
verified that when n = 1260 there are 113 distinct solutions and this is the least value of n for which the total
number of distinct solutions exceeds one hundred. What is the least value of n for which the number of distinct
solutions exceeds four million? NOTE: This problem is a much more difficult version of Problem 108 and as it is well
beyond the limitations of a brute force approach it requires a clever implementation.

*/

    @Test
    public void test() {
        Assert.assertEquals(9350130049860600L, Problem110.solve(/* change signature to provide required inputs */));
    }
}

