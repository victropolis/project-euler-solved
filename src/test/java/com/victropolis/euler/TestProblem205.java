package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem205 {
/*

Description (from https://projecteuler.net/problem=205):

Peter has nine four-sided (pyramidal) dice, each with faces numbered 1, 2, 3, 4. Colin has six six-sided (cubic)
dice, each with faces numbered 1, 2, 3, 4, 5, 6. Peter and Colin roll their dice and compare totals: the highest
total wins. The result is a draw if the totals are equal. What is the probability that Pyramidal Pete beats Cubic
Colin? Give your answer rounded to seven decimal places in the form 0.abcdefg

*/

    @Test
    public void test() {
        Assert.assertEquals(0.5731441F, Problem205.solve(/* change signature to provide required inputs */));
    }
}

