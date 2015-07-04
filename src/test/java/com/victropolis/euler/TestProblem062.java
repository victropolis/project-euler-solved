package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem062 {
/*

Description (from https://projecteuler.net/problem=62):

The cube, 41063625 (3453), can be permuted to produce two other cubes: 56623104 (3843) and 66430125 (4053). In fact,
41063625 is the smallest cube which has exactly three permutations of its digits which are also cube. Find the
smallest cube for which exactly five permutations of its digits are cube.

*/

    @Test
    public void test() {
        Assert.assertEquals(127035954683L, Problem062.solve(/* change signature to provide required inputs */));
    }
}

