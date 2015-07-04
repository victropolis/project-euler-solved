package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem261 {
/*

Description (from https://projecteuler.net/problem=261):

Let us call a positive integer k a square-pivot, if there is a pair of integers m &gt; 0 and n ≥ k, such that the sum
 of the (m+1) consecutive squares up to k equals the sum of the m consecutive squares from (n+1) on:  ( k- m) 2 + ...
  + k 2 = ( n+1) 2 + ... + ( n+ m) 2.  Some small square-pivots are   4: 32 + 42 = 52 21: 202 + 212 = 292 24: 212 +
  222 + 232 + 242 = 252 + 262 + 272 110: 1082 + 1092 + 1102 = 1332 + 1342   Find the sum of all distinct
  square-pivots ≤ 1010.

*/

    @Test
    public void test() {
        Assert.assertEquals(238890850232021L, Problem261.solve(/* change signature to provide required inputs */));
    }
}

