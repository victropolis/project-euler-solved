package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem439 {
/*

Description (from https://projecteuler.net/problem=439):

Let d(k) be the sum of all divisors of k. We define the function S(N) = ∑1≤i≤N ∑1≤j≤N d(i·j). For example, S(3) = d
(1) + d(2) + d(3) + d(2) + d(4) + d(6) + d(3) + d(6) + d(9) = 59. You are given that S(103) = 563576517282 and S(105)
 mod 109 = 215766508. Find S(1011) mod 109.

*/

    @Test
    public void test() {
        Assert.assertEquals(968697378L, Problem439.solve(/* change signature to provide required inputs */));
    }
}

