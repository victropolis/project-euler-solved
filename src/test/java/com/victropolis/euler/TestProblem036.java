package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem036 {
/*

Description (from https://projecteuler.net/problem=36):

The decimal number, 585 = 10010010012 (binary), is palindromic in both bases. Find the sum of all numbers, less than
one million, which are palindromic in base 10 and base 2. (Please note that the palindromic number, in either base,
may not include leading zeros.)

*/

    @Test
    public void test() {
        Assert.assertEquals(872187L, Problem036.solve(/* change signature to provide required inputs */));
    }
}

