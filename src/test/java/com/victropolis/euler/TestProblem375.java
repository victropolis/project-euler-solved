package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem375 {
/*

Description (from https://projecteuler.net/problem=375):

Let Sn be an integer sequence produced with the following pseudo-random number generator:     S0 =&nbsp; 290797&nbsp;
   Sn+1 =&nbsp; Sn2 mod 50515093      Let A(i, j) be the minimum of the numbers Si, Si+1, ... , Sj for i ≤ j. Let M
   (N) = ΣA(i, j) for 1 ≤ i ≤ j ≤ N. We can verify that M(10) = 432256955 and M(10 000) = 3264567774119.  Find M(2
   000 000 000).

*/

    @Test
    public void test() {
        Assert.assertEquals(7435327983715286168L, Problem375.solve(/* change signature to provide required inputs */));
    }
}

