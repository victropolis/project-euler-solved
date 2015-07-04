package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem216 {
/*

Description (from https://projecteuler.net/problem=216):

Consider numbers t(n) of the form t(n) = 2n2-1 with n &gt; 1. The first such numbers are 7, 17, 31, 49, 71, 97, 127
and 161. It turns out that only 49 = 7*7 and 161 = 7*23 are not prime. For n ≤ 10000 there are 2202 numbers t(n) that
 are prime. How many numbers t(n) are prime for n ≤ 50,000,000 ?

*/

    @Test
    public void test() {
        Assert.assertEquals(5437849L, Problem216.solve(/* change signature to provide required inputs */));
    }
}

