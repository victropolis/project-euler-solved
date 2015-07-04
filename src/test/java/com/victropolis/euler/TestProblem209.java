package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem209 {
/*

Description (from https://projecteuler.net/problem=209):

A k-input binary truth table is a map from k input bits (binary digits, 0 [false] or 1 [true]) to 1 output bit. For
example, the 2-input binary truth tables for the logical AND and XOR functions are:     x y x AND y   0 0 0   0 1 0
 1 0 0   1 1 1       x y x XOR y   0 0 0   0 1 1   1 0 1   1 1 0      How many 6-input binary truth tables, τ,
 satisfy the formula  τ( a, b, c, d, e, f) AND τ( b, c, d, e, f, a XOR ( b AND c)) = 0   for all 6-bit inputs (a, b,
 c, d, e, f)?

*/

    @Test
    public void test() {
        Assert.assertEquals(15964587728784L, Problem209.solve(/* change signature to provide required inputs */));
    }
}

