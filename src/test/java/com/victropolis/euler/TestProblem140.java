package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem140 {
/*

Description (from https://projecteuler.net/problem=140):

Consider the infinite polynomial series AG(x) = xG1 + x2G2 + x3G3 + ..., where Gk is the kth term of the second order
 recurrence relation Gk = Gk−1 + Gk−2, G1 = 1 and G2 = 4; that is, 1, 4, 5, 9, 14, 23, ... . For this problem we
 shall be concerned with values of x for which AG(x) is a positive integer. The corresponding values of x for the
 first five natural numbers are shown below.     x AG(x)   (√5−1)/4 1   2/5 2   (√22−2)/6 3   (√137−5)/14 4   1/2 5
    We shall call AG(x) a golden nugget if x is rational, because they become increasingly rarer; for example, the
    20th golden nugget is 211345365. Find the sum of the first thirty golden nuggets.

*/

    @Test
    public void test() {
        Assert.assertEquals(5673835352990L, Problem140.solve(/* change signature to provide required inputs */));
    }
}

