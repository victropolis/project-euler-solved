package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem168 {
/*

Description (from https://projecteuler.net/problem=168):

Consider the number 142857. We can right-rotate this number by moving the last digit (7) to the front of it, giving
us 714285. It can be verified that 714285=5×142857. This demonstrates an unusual property of 142857: it is a divisor
of its right-rotation. Find the last 5 digits of the sum of all integers n, 10 &lt; n &lt; 10100, that have this
property.

*/

    @Test
    public void test() {
        Assert.assertEquals(59206L, Problem168.solve(/* change signature to provide required inputs */));
    }
}

