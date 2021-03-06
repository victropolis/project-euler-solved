package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem515 {
/*

Description (from https://projecteuler.net/problem=515):

Let d(p,n,0) be the multiplicative inverse of n modulo prime p, defined as n&nbsp;×&nbsp;d(p,n,0)&nbsp;=&nbsp;1&nbsp;
mod&nbsp;p. Let d(p,n,k) = $\sum_{i=1}^n$d(p,i,k−1) for k&nbsp;≥&nbsp;1. Let D(a,b,k) = $\sum$(d(p,p-1,k) mod p) for
all primes a&nbsp;≤&nbsp;p&nbsp;&lt;&nbsp;a&nbsp;+&nbsp;b. You are given:  D(101,1,10) = 45 D(103,102,102) = 8334 D
(106,103,103) = 38162302  Find D(109,105,105).

*/

    @Test
    public void test() {
        Assert.assertEquals(2422639000800L, Problem515.solve(/* change signature to provide required inputs */));
    }
}

