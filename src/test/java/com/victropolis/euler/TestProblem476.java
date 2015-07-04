package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem476 {
/*

Description (from https://projecteuler.net/problem=476):

Let R(a, b, c) be the maximum area covered by three non-overlapping circles inside a triangle with edge lengths a, b
and c. Let S(n) be the average value of R(a, b, c) over all integer triplets (a, b, c) such that 1&nbsp;≤&nbsp;
a&nbsp;≤&nbsp;b&nbsp;≤&nbsp;c&nbsp;&lt;&nbsp;a&nbsp;+&nbsp;b&nbsp;≤&nbsp;n You are given S(2) = R(1, 1, 1) ≈ 0.31998,
 S(5) ≈ 1.25899. Find S(1803) rounded to 5 decimal places behind the decimal point.

*/

    @Test
    public void test() {
        Assert.assertEquals(110242.87794F, Problem476.solve(/* change signature to provide required inputs */));
    }
}

