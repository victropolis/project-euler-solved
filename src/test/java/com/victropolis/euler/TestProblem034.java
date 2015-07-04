package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem034 {
/*

Description (from https://projecteuler.net/problem=34):

145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145. Find the sum of all numbers which are equal to the sum
 of the factorial of their digits. Note: as 1! = 1 and 2! = 2 are not sums they are not included.

*/

    @Test
    public void test() {
        Assert.assertEquals(40730L, Problem034.solve(/* change signature to provide required inputs */));
    }
}

