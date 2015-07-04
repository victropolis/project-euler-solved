package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem349 {
/*

Description (from https://projecteuler.net/problem=349):

An ant moves on a regular grid of squares that are coloured either black or white. The ant is always oriented in one
of the cardinal directions (left, right, up or down) and moves from square to adjacent square according to the
following rules: - if it is on a black square, it flips the color of the square to white, rotates 90 degrees
counterclockwise and moves forward one square. - if it is on a white square, it flips the color of the square to
black, rotates 90 degrees clockwise and moves forward one square.   Starting with a grid that is entirely white, how
many squares are black after 1018 moves of the ant?

*/

    @Test
    public void test() {
        Assert.assertEquals(115384615384614952L, Problem349.solve(/* change signature to provide required inputs */));
    }
}

