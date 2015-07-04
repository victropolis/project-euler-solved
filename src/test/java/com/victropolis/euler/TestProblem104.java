package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem104 {
/*

Description (from https://projecteuler.net/problem=104):

The Fibonacci sequence is defined by the recurrence relation:  F n = F n−1 + F n−2, where F 1 = 1 and F 2 = 1.  It
turns out that F541, which contains 113 digits, is the first Fibonacci number for which the last nine digits are 1-9
pandigital (contain all the digits 1 to 9, but not necessarily in order). And F2749, which contains 575 digits, is
the first Fibonacci number for which the first nine digits are 1-9 pandigital. Given that Fk is the first Fibonacci
number for which the first nine digits AND the last nine digits are 1-9 pandigital, find k.

*/

    @Test
    public void test() {
        Assert.assertEquals(329468L, Problem104.solve(/* change signature to provide required inputs */));
    }
}

