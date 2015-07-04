package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem389 {
/*

Description (from https://projecteuler.net/problem=389):

An unbiased single 4-sided die is thrown and its value, T, is noted. T unbiased 6-sided dice are thrown and their
scores are added together. The sum, C, is noted. C unbiased 8-sided dice are thrown and their scores are added
together. The sum, O, is noted. O unbiased 12-sided dice are thrown and their scores are added together. The sum, D,
is noted. D unbiased 20-sided dice are thrown and their scores are added together. The sum, I, is noted. Find the
variance of I, and give your answer rounded to 4 decimal places.

*/

    @Test
    public void test() {
        Assert.assertEquals(2406376.3623F, Problem389.solve(/* change signature to provide required inputs */));
    }
}

