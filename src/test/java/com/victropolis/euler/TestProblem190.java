package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem190 {
/*

Description (from https://projecteuler.net/problem=190):

Let Sm = (x1, x2, ... , xm) be the m-tuple of positive real numbers with x1 + x2 + ... + xm = m for which Pm = x1 *
x22 * ... * xmm is maximised. For example, it can be verified that [P10] = 4112 ([ ] is the integer part function).
Find Σ[Pm] for 2 ≤ m ≤ 15.

*/

    @Test
    public void test() {
        Assert.assertEquals(371048281L, Problem190.solve(/* change signature to provide required inputs */));
    }
}

