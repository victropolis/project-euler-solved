package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem197 {
/*

Description (from https://projecteuler.net/problem=197):

Given is the function f(x) = ⌊230.403243784-x2⌋ × 10-9 ( ⌊ ⌋ is the floor-function), the sequence un is defined by u0
 = -1 and un+1 = f(un). Find un + un+1 for n = 1012. Give your answer with 9 digits after the decimal point.

*/

    @Test
    public void test() {
        Assert.assertEquals(1.710637717F, Problem197.solve(/* change signature to provide required inputs */));
    }
}

