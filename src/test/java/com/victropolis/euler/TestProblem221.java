package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem221 {
/*

Description (from https://projecteuler.net/problem=221):

We shall call a positive integer A an "Alexandrian integer", if there exist integers p, q, r such that:     A = p · q
 · r &nbsp;&nbsp;&nbsp;and&nbsp;&nbsp;      1   A     =     1   p     +     1   q     +     1   r        For example,
  630 is an Alexandrian integer (p&nbsp;=&nbsp;5, q&nbsp;=&nbsp;−7, r&nbsp;=&nbsp;−18). In fact, 630 is the 6th
  Alexandrian integer, the first 6 Alexandrian integers being: 6, 42, 120, 156, 420 and 630. Find the 150000th
  Alexandrian integer.

*/

    @Test
    public void test() {
        Assert.assertEquals(1884161251122450L, Problem221.solve(/* change signature to provide required inputs */));
    }
}

