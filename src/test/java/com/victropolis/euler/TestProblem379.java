package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem379 {
/*

Description (from https://projecteuler.net/problem=379):

Let f(n) be the number of couples (x,y) with x and y positive integers, x ≤ y and the least common multiple of x and
y equal to n.   Let g be the summatory function of f, i.e.: g(n) = ∑ f(i) for 1 ≤ i ≤ n.     You are given that g
(106) = 37429395.   Find g(1012).

*/

    @Test
    public void test() {
        Assert.assertEquals(132314136838185L, Problem379.solve(/* change signature to provide required inputs */));
    }
}

