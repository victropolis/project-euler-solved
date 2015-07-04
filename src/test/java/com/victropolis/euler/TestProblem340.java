package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem340 {
/*

Description (from https://projecteuler.net/problem=340):

For fixed integers a, b, c, define the crazy function F(n) as follows: F(n) = n - c for all n &gt; b  F(n) = F(a + F
(a + F(a + F(a + n)))) for all n ≤ b.   Also, define S(a, b, c) = .   For example, if a = 50, b = 2000 and c = 40,
then F(0) = 3240 and F(2000) = 2040. Also, S(50, 2000, 40) = 5204240.   Find the last 9 digits of S(217, 721, 127).

*/

    @Test
    public void test() {
        Assert.assertEquals(291504964L, Problem340.solve(/* change signature to provide required inputs */));
    }
}

