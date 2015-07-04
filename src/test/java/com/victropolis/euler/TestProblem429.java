package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem429 {
/*

Description (from https://projecteuler.net/problem=429):

A unitary divisor d of a number n is a divisor of n that has the property gcd(d, n/d) = 1. The unitary divisors of 4!
 = 24 are 1, 3, 8 and 24. The sum of their squares is 12 + 32 + 82 + 242 = 650.   Let S(n) represent the sum of the
 squares of the unitary divisors of n. Thus S(4!)=650.   Find S(100 000 000!) modulo 1 000 000 009.

*/

    @Test
    public void test() {
        Assert.assertEquals(98792821L, Problem429.solve(/* change signature to provide required inputs */));
    }
}

