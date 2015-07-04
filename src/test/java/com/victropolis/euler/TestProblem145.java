package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem145 {
/*

Description (from https://projecteuler.net/problem=145):

Some positive integers n have the property that the sum [ n + reverse(n) ] consists entirely of odd (decimal) digits.
 For instance, 36 + 63 = 99 and 409 + 904 = 1313. We will call such numbers reversible; so 36, 63, 409, and 904 are
 reversible. Leading zeroes are not allowed in either n or reverse(n). There are 120 reversible numbers below
 one-thousand. How many reversible numbers are there below one-billion (109)?

*/

    @Test
    public void test() {
        Assert.assertEquals(608720L, Problem145.solve(/* change signature to provide required inputs */));
    }
}

