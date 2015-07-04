package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem407 {
/*

Description (from https://projecteuler.net/problem=407):

If we calculate a2 mod 6 for 0 ≤ a ≤ 5 we get: 0,1,4,3,4,1.   The largest value of a such that a2 ≡ a mod 6 is 4.
Let's call M(n) the largest value of a &lt; n such that a2 ≡ a (mod n). So M(6) = 4.   Find ∑M(n) for 1 ≤ n ≤ 107.

*/

    @Test
    public void test() {
        Assert.assertEquals(39782849136421L, Problem407.solve(/* change signature to provide required inputs */));
    }
}

