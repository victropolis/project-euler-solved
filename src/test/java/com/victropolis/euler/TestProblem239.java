package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem239 {
/*

Description (from https://projecteuler.net/problem=239):

A set of disks numbered 1 through 100 are placed in a line in random order. What is the probability that we have a
partial derangement such that exactly 22 prime number discs are found away from their natural positions? (Any number
of non-prime disks may also be found in or out of their natural positions.) Give your answer rounded to 12 places
behind the decimal point in the form 0.abcdefghijkl.

*/

    @Test
    public void test() {
        Assert.assertEquals(0.001887854841F, Problem239.solve(/* change signature to provide required inputs */));
    }
}

