package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem173 {
/*

Description (from https://projecteuler.net/problem=173):

We shall define a square lamina to be a square outline with a square "hole" so that the shape possesses vertical and
horizontal symmetry. For example, using exactly thirty-two square tiles we can form two different square laminae:
With one-hundred tiles, and not necessarily using all of the tiles at one time, it is possible to form forty-one
different square laminae. Using up to one million tiles how many different square laminae can be formed?

*/

    @Test
    public void test() {
        Assert.assertEquals(1572729L, Problem173.solve(/* change signature to provide required inputs */));
    }
}

