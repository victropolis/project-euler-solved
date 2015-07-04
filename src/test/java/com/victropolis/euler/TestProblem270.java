package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem270 {
/*

Description (from https://projecteuler.net/problem=270):

A square piece of paper with integer dimensions N×N is placed with a corner at the origin and two of its sides along
the x- and y-axes. Then, we cut it up respecting the following rules:   We only make straight cuts between two points
 lying on different sides of the square, and having integer coordinates. Two cuts cannot cross, but several cuts can
 meet at the same border point. Proceed until no more legal cuts can be made.   Counting any reflections or rotations
  as distinct, we call C(N) the number of ways to cut an N×N square. For example, C(1) = 2 and C(2) = 30 (shown
  below).    What is C(30) mod 108 ?

*/

    @Test
    public void test() {
        Assert.assertEquals(82282080L, Problem270.solve(/* change signature to provide required inputs */));
    }
}

