package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem213 {
/*

Description (from https://projecteuler.net/problem=213):

A 30×30 grid of squares contains 900 fleas, initially one flea per square. When a bell is rung, each flea jumps to an
 adjacent square at random (usually 4 possibilities, except for fleas on the edge of the grid or at the corners).
 What is the expected number of unoccupied squares after 50 rings of the bell? Give your answer rounded to six
 decimal places.

*/

    @Test
    public void test() {
        Assert.assertEquals(330.721154F, Problem213.solve(/* change signature to provide required inputs */));
    }
}

