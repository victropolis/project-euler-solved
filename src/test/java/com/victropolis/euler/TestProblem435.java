package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem435 {
/*

Description (from https://projecteuler.net/problem=435):

The Fibonacci numbers {fn, n ≥ 0} are defined recursively as fn = fn-1 + fn-2 with base cases f0 = 0 and f1 = 1.
Define the polynomials {Fn, n ≥ 0} as Fn(x) = ∑fixi for 0 ≤ i ≤ n. For example, F7(x) = x + x2 + 2x3 + 3x4 + 5x5 +
8x6 + 13x7, and F7(11) = 268357683. Let n = 1015. Find the sum [∑0≤x≤100 Fn(x)] mod 1307674368000 (= 15!).

*/

    @Test
    public void test() {
        Assert.assertEquals(252541322550L, Problem435.solve(/* change signature to provide required inputs */));
    }
}

