package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem258 {
/*

Description (from https://projecteuler.net/problem=258):

A sequence is defined as:    gk = 1, for 0 ≤ k ≤ 1999 gk = gk-2000 + gk-1999, for k ≥ 2000.    Find gk mod 20092010
for k = 1018.

*/

    @Test
    public void test() {
        Assert.assertEquals(12747994L, Problem258.solve(/* change signature to provide required inputs */));
    }
}

