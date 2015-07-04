package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem154 {
/*

Description (from https://projecteuler.net/problem=154):

A triangular pyramid is constructed using spherical balls so that each ball rests on exactly three balls of the next
lower level.    Then, we calculate the number of paths leading from the apex to each position: A path starts at the
apex and progresses downwards to any of the three spheres directly below the current position. Consequently, the
number of paths to reach a certain position is the sum of the numbers immediately above it (depending on the
position, there are up to three numbers above it). The result is Pascal's pyramid and the numbers at each level n are
 the coefficients of the trinomial expansion (x + y + z)n. How many coefficients in the expansion of (x + y + z)
 200000 are multiples of 1012?

*/

    @Test
    public void test() {
        Assert.assertEquals(479742450L, Problem154.solve(/* change signature to provide required inputs */));
    }
}

