package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem253 {
/*

Description (from https://projecteuler.net/problem=253):

A small child has a “number caterpillar” consisting of forty jigsaw pieces, each with one number on it, which, when
connected together in a line, reveal the numbers 1 to 40 in order. Every night, the child's father has to pick up the
 pieces of the caterpillar that have been scattered across the play room. He picks up the pieces at random and places
  them in the correct order. As the caterpillar is built up in this way, it forms distinct segments that gradually
  merge together. The number of segments starts at zero (no pieces placed), generally increases up to about eleven or
   twelve, then tends to drop again before finishing at a single segment (all pieces placed).   For example:
   Piece Placed Segments So Far   12 1   4 2   29 3   6 4   34 5   5 4   35 4   … …     Let M be the maximum number
   of segments encountered during a random tidy-up of the caterpillar. For a caterpillar of ten pieces, the number of
    possibilities for each M is     M Possibilities   1 512&nbsp; &nbsp;&nbsp; &nbsp;   2 250912&nbsp; &nbsp;&nbsp;
    &nbsp;   3 1815264&nbsp; &nbsp;&nbsp; &nbsp;   4 1418112&nbsp; &nbsp;&nbsp; &nbsp;   5 144000&nbsp; &nbsp;&nbsp;
    &nbsp;     so the most likely value of M is 3 and the average value is 385643⁄113400 = 3.400732, rounded to six
    decimal places. The most likely value of M for a forty-piece caterpillar is 11; but what is the average value of
    M? Give your answer rounded to six decimal places.

*/

    @Test
    public void test() {
        Assert.assertEquals(11.492847F, Problem253.solve(/* change signature to provide required inputs */));
    }
}
