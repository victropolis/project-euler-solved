package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem468 {
/*

Description (from https://projecteuler.net/problem=468):

An integer is called B-smooth if none of its prime factors is greater than B. Let SB(n) be the largest B-smooth
divisor of n. Examples: S1(10) = 1 S4(2100) = 12 S17(2496144) = 5712 Define F(n) = ∑1≤B≤n ∑0≤r≤n SB(C(n,r)). Here, C
(n,r) denotes the binomial coefficient. Examples: F(11) = 3132 F(1&nbsp;111) mod 1&nbsp;000&nbsp;000&nbsp;993 =
706036312 F(111&nbsp;111) mod 1&nbsp;000&nbsp;000&nbsp;993 = 22156169 Find F(11&nbsp;111&nbsp;111) mod 1&nbsp;
000&nbsp;000&nbsp;993.

*/

    @Test
    public void test() {
        Assert.assertEquals(852950321L, Problem468.solve(/* change signature to provide required inputs */));
    }
}

