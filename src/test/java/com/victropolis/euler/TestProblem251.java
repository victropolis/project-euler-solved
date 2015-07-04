package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem251 {
/*

Description (from https://projecteuler.net/problem=251):

A triplet of positive integers (a,b,c) is called a Cardano Triplet if it satisfies the condition:     For example,
(2,1,5) is a Cardano Triplet.   There exist 149 Cardano Triplets for which a+b+c ≤ 1000.   Find how many Cardano
Triplets exist such that a+b+c ≤ 110,000,000.

*/

    @Test
    public void test() {
        Assert.assertEquals(18946051L, Problem251.solve(/* change signature to provide required inputs */));
    }
}

