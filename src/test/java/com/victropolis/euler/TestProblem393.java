package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem393 {
/*

Description (from https://projecteuler.net/problem=393):

An n×n grid of squares contains n2 ants, one ant per square. All ants decide to move simultaneously to an adjacent
square (usually 4 possibilities, except for ants on the edge of the grid or at the corners). We define f(n) to be the
 number of ways this can happen without any ants ending on the same square and without any two ants crossing the same
  edge between two squares.   You are given that f(4) = 88. Find f(10).

*/

    @Test
    public void test() {
        Assert.assertEquals(112398351350823112L, Problem393.solve(/* change signature to provide required inputs */));
    }
}

