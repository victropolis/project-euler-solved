package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem141 {
/*

Description (from https://projecteuler.net/problem=141):

A positive integer, n, is divided by d and the quotient and remainder are q and r respectively. In addition d, q, and
 r are consecutive positive integer terms in a geometric sequence, but not necessarily in that order. For example, 58
  divided by 6 has quotient 9 and remainder 4. It can also be seen that 4, 6, 9 are consecutive terms in a geometric
  sequence (common ratio 3/2). We will call such numbers, n, progressive. Some progressive numbers, such as 9 and
  10404 = 1022, happen to also be perfect squares. The sum of all progressive perfect squares below one hundred
  thousand is 124657. Find the sum of all progressive perfect squares below one trillion (1012).

*/

    @Test
    public void test() {
        Assert.assertEquals(878454337159L, Problem141.solve(/* change signature to provide required inputs */));
    }
}

