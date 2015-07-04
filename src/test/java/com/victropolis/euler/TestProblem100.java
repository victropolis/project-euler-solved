package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem100 {
/*

Description (from https://projecteuler.net/problem=100):

If a box contains twenty-one coloured discs, composed of fifteen blue discs and six red discs, and two discs were
taken at random, it can be seen that the probability of taking two blue discs, P(BB) = (15/21)×(14/20) = 1/2. The
next such arrangement, for which there is exactly 50% chance of taking two blue discs at random, is a box containing
eighty-five blue discs and thirty-five red discs. By finding the first arrangement to contain over 1012 = 1,000,000,
000,000 discs in total, determine the number of blue discs that the box would contain.

*/

    @Test
    public void test() {
        Assert.assertEquals(756872327473L, Problem100.solve(/* change signature to provide required inputs */));
    }
}

