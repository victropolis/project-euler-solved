package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem152 {
/*

Description (from https://projecteuler.net/problem=152):

There are several ways to write the number 1/2 as a sum of inverse squares using distinct integers. For instance, the
 numbers {2,3,4,5,7,12,15,20,28,35} can be used:  In fact, only using integers between 2 and 45 inclusive, there are
 exactly three ways to do it, the remaining two being: {2,3,4,6,7,9,10,20,28,35,36,45} and {2,3,4,6,7,9,12,15,28,30,
 35,36,45}. How many ways are there to write the number 1/2 as a sum of inverse squares using distinct integers
 between 2 and 80 inclusive?

*/

    @Test
    public void test() {
        Assert.assertEquals(301L, Problem152.solve(/* change signature to provide required inputs */));
    }
}

