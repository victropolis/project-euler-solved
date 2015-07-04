package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem169 {
/*

Description (from https://projecteuler.net/problem=169):

Define f(0)=1 and f(n) to be the number of different ways n can be expressed as a sum of integer powers of 2 using
each power no more than twice. For example, f(10)=5 since there are five different ways to express 10: 1 + 1 + 8 1 +
1 + 4 + 41 + 1 + 2 + 2 + 4 2 + 4 + 4 2 + 8 What is f(1025)?

*/

    @Test
    public void test() {
        Assert.assertEquals(178653872807L, Problem169.solve(/* change signature to provide required inputs */));
    }
}

