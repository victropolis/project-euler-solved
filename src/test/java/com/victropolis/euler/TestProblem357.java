package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem357 {
/*

Description (from https://projecteuler.net/problem=357):

Consider the divisors of 30: 1,2,3,5,6,10,15,30. It can be seen that for every divisor d of 30, d+30/d is prime.
Find the sum of all positive integers n not exceeding 100 000 000such that for every divisor d of n, d+n/d is prime.

*/

    @Test
    public void test() {
        Assert.assertEquals(1739023853137L, Problem357.solve(/* change signature to provide required inputs */));
    }
}

