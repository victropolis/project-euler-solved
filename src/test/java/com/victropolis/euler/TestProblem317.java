package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem317 {
/*

Description (from https://projecteuler.net/problem=317):

A firecracker explodes at a height of 100 m above level ground. It breaks into a large number of very small
fragments, which move in every direction; all of them have the same initial velocity of 20 m/s.   We assume that the
fragments move without air resistance, in a uniform gravitational field with g=9.81 m/s2.   Find the volume (in m3)
of the region through which the fragments move before reaching the ground. Give your answer rounded to four decimal
places.

*/

    @Test
    public void test() {
        Assert.assertEquals(1856532.8455F, Problem317.solve(/* change signature to provide required inputs */));
    }
}

