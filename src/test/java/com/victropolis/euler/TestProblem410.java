package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem410 {
/*

Description (from https://projecteuler.net/problem=410):

Let C be the circle with radius r, x2 + y2 = r2. We choose two points P(a, b) and Q(-a, c) so that the line passing
through P and Q is tangent to C. For example, the quadruplet (r, a, b, c) = (2, 6, 2, -7) satisfies this property.
Let F(R, X) be the number of the integer quadruplets (r, a, b, c) with this property, and with 0 &lt; r ≤ R and 0
&lt; a ≤ X. We can verify that F(1, 5) = 10, F(2, 10) = 52 and F(10, 100) = 3384. Find F(108, 109) + F(109, 108).

*/

    @Test
    public void test() {
        Assert.assertEquals(799999783589946560L, Problem410.solve(/* change signature to provide required inputs */));
    }
}

