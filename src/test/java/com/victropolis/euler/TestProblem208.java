package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem208 {
/*

Description (from https://projecteuler.net/problem=208):

A robot moves in a series of one-fifth circular arcs (72°), with a free choice of a clockwise or an anticlockwise arc
 for each step, but no turning on the spot. One of 70932 possible closed paths of 25 arcs starting northward is
 Given that the robot starts facing North, how many journeys of 70 arcs in length can it take that return it, after
 the final arc, to its starting position?  (Any arc may be traversed multiple times.)

*/

    @Test
    public void test() {
        Assert.assertEquals(331951449665644800L, Problem208.solve(/* change signature to provide required inputs */));
    }
}

