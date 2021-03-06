package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem233 {
/*

Description (from https://projecteuler.net/problem=233):

Let f(N) be the number of points with integer coordinates that are on a circle passing through (0,0), (N,0),(0,N),
and (N,N). It can be shown that f(10000) = 36. What is the sum of all positive integers N ≤ 1011 such that f(N) = 420 ?

*/

    @Test
    public void test() {
        Assert.assertEquals(271204031455541309L, Problem233.solve(/* change signature to provide required inputs */));
    }
}

