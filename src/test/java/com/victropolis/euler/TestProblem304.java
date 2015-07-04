package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem304 {
/*

Description (from https://projecteuler.net/problem=304):

For any positive integer n the function next_prime(n) returns the smallest prime p  such that p&gt;n.   The sequence
a(n) is defined by: a(1)=next_prime(1014) and a(n)=next_prime(a(n-1)) for n&gt;1.    The fibonacci sequence f(n) is
defined by: f(0)=0, f(1)=1 and f(n)=f(n-1)+f(n-2) for n&gt;1.   The sequence b(n) is defined as f(a(n)).   Find ∑b(n)
 for 1≤n≤100 000. Give your answer mod 1234567891011.

*/

    @Test
    public void test() {
        Assert.assertEquals(283988410192L, Problem304.solve(/* change signature to provide required inputs */));
    }
}

