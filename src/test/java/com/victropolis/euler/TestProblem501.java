package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem501 {
/*

Description (from https://projecteuler.net/problem=501):

The eight divisors of 24 are 1, 2, 3, 4, 6, 8, 12 and 24. The ten numbers not exceeding 100 having exactly eight
divisors are 24, 30, 40, 42, 54, 56, 66, 70, 78 and 88. Let f(n) be the count of numbers not exceeding n with exactly
 eight divisors. You are given f(100)&nbsp;=&nbsp;10, f(1000)&nbsp;=&nbsp;180 and f(106)&nbsp;=&nbsp;224427. Find f
 (1012).

*/

    @Test
    public void test() {
        Assert.assertEquals(197912312715L, Problem501.solve(/* change signature to provide required inputs */));
    }
}

