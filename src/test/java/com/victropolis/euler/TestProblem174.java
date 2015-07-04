package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem174 {
/*

Description (from https://projecteuler.net/problem=174):

We shall define a square lamina to be a square outline with a square "hole" so that the shape possesses vertical and
horizontal symmetry. Given eight tiles it is possible to form a lamina in only one way: 3x3 square with a 1x1 hole in
 the middle. However, using thirty-two tiles it is possible to form two distinct laminae.    If t represents the
 number of tiles used, we shall say that t = 8 is type L(1) and t = 32 is type L(2). Let N(n) be the number of t ≤
 1000000 such that t is type L(n); for example, N(15) = 832. What is ∑ N(n) for 1 ≤ n ≤ 10?

*/

    @Test
    public void test() {
        Assert.assertEquals(209566L, Problem174.solve(/* change signature to provide required inputs */));
    }
}

