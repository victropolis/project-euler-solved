package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem378 {
/*

Description (from https://projecteuler.net/problem=378):

Let T(n) be the nth triangle number, so T(n) =      n (n+1)   2      .      Let dT(n) be the number of divisors of T
(n). E.g.: T(7) = 28 and dT(7) = 6.   Let Tr(n) be the number of triples (i, j, k) such that 1 ≤ i &lt; j &lt; k ≤ n
and dT(i) &gt; dT(j) &gt; dT(k). Tr(20) = 14, Tr(100) = 5772 and Tr(1000) = 11174776.   Find Tr(60 000 000).  Give
the last 18 digits of your answer.

*/

    @Test
    public void test() {
        Assert.assertEquals(147534623725724718L, Problem378.solve(/* change signature to provide required inputs */));
    }
}

