package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem417 {
/*

Description (from https://projecteuler.net/problem=417):

A unit fraction contains 1 in the numerator. The decimal representation of the unit fractions with denominators 2 to
10 are given:     1/2 =&nbsp; 0.5   1/3 =&nbsp; 0.(3)   1/4 =&nbsp; 0.25   1/5 =&nbsp; 0.2   1/6 =&nbsp; 0.1(6)   1/7
 =&nbsp; 0.(142857)   1/8 =&nbsp; 0.125   1/9 =&nbsp; 0.(1)   1/10 =&nbsp; 0.1     Where 0.1(6) means 0.166666...,
 and has a 1-digit recurring cycle. It can be seen that 1/7 has a 6-digit recurring cycle.  Unit fractions whose
 denominator has no other prime factors than 2 and/or 5 are not considered to have a recurring cycle. We define the
 length of the recurring cycle of those unit fractions as 0.   Let L(n) denote the length of the recurring cycle of
 1/n. You are given that ∑L(n) for 3 ≤ n ≤ 1 000 000 equals 55535191115.   Find ∑L(n) for 3 ≤ n ≤ 100 000 000

*/

    @Test
    public void test() {
        Assert.assertEquals(446572970925740L, Problem417.solve(/* change signature to provide required inputs */));
    }
}

