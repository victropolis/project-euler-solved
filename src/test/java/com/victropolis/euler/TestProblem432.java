package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem432 {
/*

Description (from https://projecteuler.net/problem=432):

Let S(n,m) = ∑φ(n × i) for 1 ≤ i ≤ m. (φ is Euler's totient function) You are given that S(510510,106 )=
45480596821125120.   Find S(510510,1011). Give the last 9 digits of your answer.

*/

    @Test
    public void test() {
        Assert.assertEquals(754862080L, Problem432.solve(/* change signature to provide required inputs */));
    }
}

