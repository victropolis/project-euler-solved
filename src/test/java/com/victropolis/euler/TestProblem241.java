package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem241 {
/*

Description (from https://projecteuler.net/problem=241):

For a positive integer n, let σ(n) be the sum of all divisors of n, so e.g. σ(6) = 1 + 2 + 3 + 6 = 12.  A perfect
number, as you probably know, is a number with σ(n) = 2n.    Let us define the perfection quotient of a positive
integer as p(n) =&nbsp;   σ(n)  n  .    Find the sum of all positive integers n ≤ 1018 for which p(n) has the form k
+ 1⁄2, where k is an integer.

*/

    @Test
    public void test() {
        Assert.assertEquals(482316491800641154L, Problem241.solve(/* change signature to provide required inputs */));
    }
}

