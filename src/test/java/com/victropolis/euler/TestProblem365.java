package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem365 {
/*

Description (from https://projecteuler.net/problem=365):

The binomial coeffient C(1018,109) is a number with more than 9 billion (9×109) digits.   Let M(n,k,m) denote the
binomial coefficient C(n,k) modulo m.   Calculate ∑M(1018,109,p*q*r) for 1000&lt;p&lt;q&lt;r&lt;5000 and p,q,r prime.

*/

    @Test
    public void test() {
        Assert.assertEquals(162619462356610313L, Problem365.solve(/* change signature to provide required inputs */));
    }
}

