package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem418 {
/*

Description (from https://projecteuler.net/problem=418):

Let n be a positive integer. An integer triple (a, b, c) is called a factorisation triple of n if:   1 ≤ a ≤ b ≤ c
a·b·c = n.     Define f(n) to be a + b + c for the factorisation triple (a, b, c) of n which minimises c / a. One can
 show that this triple is unique.   For example, f(165) = 19, f(100100) = 142 and f(20!) = 4034872.   Find f(43!).

*/

    @Test
    public void test() {
        Assert.assertEquals(1177163565297340320L, Problem418.solve(/* change signature to provide required inputs */));
    }
}

