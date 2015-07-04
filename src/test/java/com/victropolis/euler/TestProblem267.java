package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem267 {
/*

Description (from https://projecteuler.net/problem=267):

You are given a unique investment opportunity. Starting with £1 of capital, you can choose a fixed proportion, f, of
your capital to bet on a fair coin toss repeatedly for 1000 tosses. Your return is double your bet for heads and you
lose your bet for tails. For example, if f = 1/4, for the first toss you bet £0.25, and if heads comes up you win £0
.5 and so then have £1.5. You then bet £0.375 and if the second toss is tails, you have £1.125. Choosing f to
maximize your chances of having at least £1,000,000,000 after 1,000 flips, what is the chance that you become a
billionaire? All computations are assumed to be exact (no rounding), but give your answer rounded to 12 digits behind
 the decimal point in the form 0.abcdefghijkl.

*/

    @Test
    public void test() {
        Assert.assertEquals(0.999992836187F, Problem267.solve(/* change signature to provide required inputs */));
    }
}
