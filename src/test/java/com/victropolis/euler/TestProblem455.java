package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem455 {
/*

Description (from https://projecteuler.net/problem=455):

Let f(n) be the largest positive integer x less than 109 such that the last 9 digits of nx form the number x
(including leading zeros), or zero if no such integer exists. For example:  f(4) = 411728896 (4411728896 =
...490411728896)  f(10) = 0 f(157) = 743757 (157743757 = ...567000743757) Σf(n), 2 ≤ n ≤ 103 = 442530011399  Find Σf
(n), 2 ≤ n ≤ 106.

*/

    @Test
    public void test() {
        Assert.assertEquals(450186511399999L, Problem455.solve(/* change signature to provide required inputs */));
    }
}

