package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem235 {
/*

Description (from https://projecteuler.net/problem=235):

Given is the arithmetic-geometric sequence u(k) = (900-3k)rk-1. Let s(n) = Σk=1...nu(k).   Find the value of r for
which s(5000) = -600,000,000,000.   Give your answer rounded to 12 places behind the decimal point.

*/

    @Test
    public void test() {
        Assert.assertEquals(1.002322108633F, Problem235.solve(/* change signature to provide required inputs */));
    }
}

