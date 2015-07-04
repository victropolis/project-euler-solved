package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem286 {
/*

Description (from https://projecteuler.net/problem=286):

Barbara is a mathematician and a basketball player. She has found that the probability of scoring a point when
shooting from a distance x is exactly (1 -&nbsp;x/q), where q is a real constant greater than 50. During each
practice run, she takes shots from distances x = 1, x = 2, ..., x = 50 and, according to her records, she has
precisely a 2 % chance to score a total of exactly 20 points. Find q and give your answer rounded to 10 decimal places.

*/

    @Test
    public void test() {
        Assert.assertEquals(52.6494571953F, Problem286.solve(/* change signature to provide required inputs */));
    }
}

