package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem372 {
/*

Description (from https://projecteuler.net/problem=372):

Let R(M, N) be the number of lattice points (x, y) which satisfy M&lt;x≤N, M&lt;y≤N and  is odd. We can verify that R
(0, 100) = 3019 and R(100, 10000) = 29750422. Find R(2·106, 109).   Note:  represents the floor function.

*/

    @Test
    public void test() {
        Assert.assertEquals(301450082318807027L, Problem372.solve(/* change signature to provide required inputs */));
    }
}

