package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem108 {
/*

Description (from https://projecteuler.net/problem=108):

In the following equation x, y, and n are positive integers.       1  x   +    1  y   =    1  n      For n = 4 there
are exactly three distinct solutions:       1  5   +    1  20   =    1  4      1  6   +    1  12   =    1  4      1
8   +    1  8   =    1  4      What is the least value of n for which the number of distinct solutions exceeds
one-thousand? NOTE: This problem is an easier version of Problem 110; it is strongly advised that you solve this one
first.

*/

    @Test
    public void test() {
        Assert.assertEquals(180180L, Problem108.solve(/* change signature to provide required inputs */));
    }
}

