package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem181 {
/*

Description (from https://projecteuler.net/problem=181):

Having three black objects B and one white object W they can be grouped in 7 ways like this:    (BBBW) (B,BBW) (B,B,
BW) (B,B,B,W) (B,BB,W) (BBB,W) (BB,BW)    In how many ways can sixty black objects B and forty white objects W be
thus grouped?

*/

    @Test
    public void test() {
        Assert.assertEquals(83735848679360680L, Problem181.solve(/* change signature to provide required inputs */));
    }
}

