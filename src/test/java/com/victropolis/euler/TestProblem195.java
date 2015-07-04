package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem195 {
/*

Description (from https://projecteuler.net/problem=195):

Let's call an integer sided triangle with exactly one angle of 60 degrees a 60-degree triangle. Let r be the radius
of the inscribed circle of such a 60-degree triangle. There are 1234 60-degree triangles for which r ≤ 100. Let T(n)
be the number of 60-degree triangles for which r ≤ n, so T(100) = 1234,&nbsp; T(1000) = 22767, and&nbsp; T(10000) =
359912. Find T(1053779).

*/

    @Test
    public void test() {
        Assert.assertEquals(75085391L, Problem195.solve(/* change signature to provide required inputs */));
    }
}

