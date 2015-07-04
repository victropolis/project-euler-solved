package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem280 {
/*

Description (from https://projecteuler.net/problem=280):

A laborious ant walks randomly on a 5x5 grid. The walk starts from the central square. At each step, the ant moves to
 an adjacent square at random, without leaving the grid; thus there are 2, 3 or 4 possible moves at each step
 depending on the ant's position. At the start of the walk, a seed is placed on each square of the lower row. When
 the ant isn't carrying a seed and reaches a square of the lower row containing a seed, it will start to carry the
 seed. The ant will drop the seed on the first empty square of the upper row it eventually reaches. What's the
 expected number of steps until all seeds have been dropped in the top row?  Give your answer rounded to 6 decimal
 places.

*/

    @Test
    public void test() {
        Assert.assertEquals(430.088247F, Problem280.solve(/* change signature to provide required inputs */));
    }
}

