package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem292 {
/*

Description (from https://projecteuler.net/problem=292):

We shall define a pythagorean polygon to be a convex polygon with the following properties:   there are at least
three vertices, no three vertices are aligned, each vertex has integer coordinates, each edge has integer length.
For a given integer n, define P(n) as the number of distinct pythagorean polygons for which the perimeter is ≤ n.
Pythagorean polygons should be considered distinct as long as none is a translation of another. You are given that P
(4) = 1, P(30) = 3655 and P(60) = 891045. Find P(120).

*/

    @Test
    public void test() {
        Assert.assertEquals(3600060866L, Problem292.solve(/* change signature to provide required inputs */));
    }
}

