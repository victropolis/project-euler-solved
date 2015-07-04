package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem504 {
/*

Description (from https://projecteuler.net/problem=504):

Let ABCD be a quadrilateral whose vertices are lattice points lying on the coordinate axes as follows: A(a, 0), B(0,
b), C(−c, 0), D(0, −d), where 1 ≤ a, b, c, d ≤ m and a, b, c, d, m are integers. It can be shown that for m = 4 there
 are exactly 256 valid ways to construct ABCD. Of these 256 quadrilaterals, 42 of them strictly contain a square
 number of lattice points. How many quadrilaterals ABCD strictly contain a square number of lattice points for m = 100?

*/

    @Test
    public void test() {
        Assert.assertEquals(694687L, Problem504.solve(/* change signature to provide required inputs */));
    }
}

