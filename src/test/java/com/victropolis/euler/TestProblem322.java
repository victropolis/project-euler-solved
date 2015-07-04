package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem322 {
/*

Description (from https://projecteuler.net/problem=322):

Let T(m, n) be the number of the binomial coefficients iCn that are divisible by 10 for n ≤ i &lt; m(i, m and n are
positive integers). You are given that T(109, 107-10) = 989697000.   Find T(1018, 1012-10).

*/

    @Test
    public void test() {
        Assert.assertEquals(999998760323313995L, Problem322.solve(/* change signature to provide required inputs */));
    }
}

