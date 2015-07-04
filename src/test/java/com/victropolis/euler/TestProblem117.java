package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem117 {
/*

Description (from https://projecteuler.net/problem=117):

Using a combination of black square tiles and oblong tiles chosen from: red tiles measuring two units, green tiles
measuring three units, and blue tiles measuring four units, it is possible to tile a row measuring five units in
length in exactly fifteen different ways.
                                                                                                     &nbsp;    How
                                                                                                     many ways can a
                                                                                                     row measuring
                                                                                                     fifty units in
                                                                                                     length be tiled?
                                                                                                      NOTE: This is
                                                                                                      related to
                                                                                                      Problem 116.

*/

    @Test
    public void test() {
        Assert.assertEquals(100808458960497L, Problem117.solve(/* change signature to provide required inputs */));
    }
}

