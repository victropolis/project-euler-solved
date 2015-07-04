package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem040 {
/*

Description (from https://projecteuler.net/problem=40):

An irrational decimal fraction is created by concatenating the positive integers: 0
.123456789101112131415161718192021... It can be seen that the 12th digit of the fractional part is 1. If dn
represents the nth digit of the fractional part, find the value of the following expression. d1 × d10 × d100 × d1000
× d10000 × d100000 × d1000000

*/

    @Test
    public void test() {
        Assert.assertEquals(210L, Problem040.solve(/* change signature to provide required inputs */));
    }
}

