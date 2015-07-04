package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem324 {
/*

Description (from https://projecteuler.net/problem=324):

Let f(n) represent the number of ways one can fill a 3×3×n tower with blocks of 2×1×1. You're allowed to rotate the
blocks in any way you like; however, rotations, reflections etc of the tower itself are counted as distinct. For
example (with q = 100000007) : f(2) = 229, f(4) = 117805, f(10) mod q = 96149360, f(103) mod q = 24806056, f(106) mod
 q = 30808124. Find f(1010000) mod 100000007.

*/

    @Test
    public void test() {
        Assert.assertEquals(96972774L, Problem324.solve(/* change signature to provide required inputs */));
    }
}

