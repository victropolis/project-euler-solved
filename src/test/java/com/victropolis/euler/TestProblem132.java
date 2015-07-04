package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem132 {
/*

Description (from https://projecteuler.net/problem=132):

A number consisting entirely of ones is called a repunit. We shall define R(k) to be a repunit of length k. For
example, R(10) = 1111111111 = 11×41×271×9091, and the sum of these prime factors is 9414. Find the sum of the first
forty prime factors of R(109).

*/

    @Test
    public void test() {
        Assert.assertEquals(843296L, Problem132.solve(/* change signature to provide required inputs */));
    }
}

