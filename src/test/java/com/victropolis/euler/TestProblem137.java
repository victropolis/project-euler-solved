package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem137 {
/*

Description (from https://projecteuler.net/problem=137):

Consider the infinite polynomial series AF(x) = xF1 + x2F2 + x3F3 + ..., where Fk is the kth term in the Fibonacci
sequence: 1, 1, 2, 3, 5, 8, ... ; that is, Fk = Fk−1 + Fk−2, F1 = 1 and F2 = 1. For this problem we shall be
interested in values of x for which AF(x) is a positive integer.    Surprisingly AF(1/2) &nbsp;=&nbsp; (1/2).1 +
(1/2)2.1 + (1/2)3.2 + (1/2)4.3 + (1/2)5.5 + ...   &nbsp; &nbsp;=&nbsp; 1/2 + 1/4 + 2/8 + 3/16 + 5/32 + ...   &nbsp;
&nbsp;=&nbsp; 2    The corresponding values of x for the first five natural numbers are shown below.     x AF(x)
√2−1 1   1/2 2   (√13−2)/3 3   (√89−5)/8 4   (√34−3)/5 5     We shall call AF(x) a golden nugget if x is rational,
because they become increasingly rarer; for example, the 10th golden nugget is 74049690. Find the 15th golden nugget.

*/

    @Test
    public void test() {
        Assert.assertEquals(1120149658760L, Problem137.solve(/* change signature to provide required inputs */));
    }
}

