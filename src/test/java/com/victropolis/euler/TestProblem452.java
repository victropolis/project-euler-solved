package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem452 {
/*

Description (from https://projecteuler.net/problem=452):

Define F(m,n) as the number of n-tuples of positive integers for which the product of the elements doesn't exceed m.
F(10, 10) = 571. F(106, 106) mod 1&nbsp;234&nbsp;567&nbsp;891 = 252903833. Find F(109, 109) mod 1&nbsp;234&nbsp;
567&nbsp;891.

*/

    @Test
    public void test() {
        Assert.assertEquals(345558983L, Problem452.solve(/* change signature to provide required inputs */));
    }
}

