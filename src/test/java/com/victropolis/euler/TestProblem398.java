package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem398 {
/*

Description (from https://projecteuler.net/problem=398):

Inside a rope of length n, n-1 points are placed with distance 1 from each other and from the endpoints. Among these
points, we choose m-1 points at random and cut the rope at these points to create m segments.   Let E(n, m) be the
expected length of the second-shortest segment. For example, E(3, 2) = 2 and E(8, 3) = 16/7. Note that if multiple
segments have the same shortest length the length of the second-shortest segment is defined as the same as the
shortest length.   Find E(107, 100). Give your answer rounded to 5 decimal places behind the decimal point.

*/

    @Test
    public void test() {
        Assert.assertEquals(2010.59096F, Problem398.solve(/* change signature to provide required inputs */));
    }
}

