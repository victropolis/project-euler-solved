package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem047 {
/*

Description (from https://projecteuler.net/problem=47):

The first two consecutive numbers to have two distinct prime factors are: 14 = 2 × 715 = 3 × 5 The first three
consecutive numbers to have three distinct prime factors are: 644 = 2² × 7 × 23645 = 3 × 5 × 43646 = 2 × 17 × 19.
Find the first four consecutive integers to have four distinct prime factors. What is the first of these numbers?

*/

    @Test
    public void test() {
        Assert.assertEquals(134043L, Problem047.solve(/* change signature to provide required inputs */));
    }
}

