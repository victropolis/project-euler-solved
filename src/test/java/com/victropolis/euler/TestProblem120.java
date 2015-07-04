package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem120 {
/*

Description (from https://projecteuler.net/problem=120):

Let r be the remainder when (a−1)n + (a+1)n is divided by a2. For example, if a = 7 and n = 3, then r = 42: 63 + 83 =
 728 ≡ 42 mod 49. And as n varies, so too will r, but for a = 7 it turns out that rmax = 42. For 3 ≤ a ≤ 1000, find ∑
  rmax.

*/

    @Test
    public void test() {
        Assert.assertEquals(333082500L, Problem120.solve(/* change signature to provide required inputs */));
    }
}

