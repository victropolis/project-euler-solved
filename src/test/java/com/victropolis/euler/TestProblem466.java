package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem466 {
/*

Description (from https://projecteuler.net/problem=466):

Let P(m,n) be the number of distinct terms in an m×n multiplication table. For example, a 3×4 multiplication table
looks like this:      × 1 2 3 4   1 1 2 3 4   2 2 4 6 8   3 3 6 9 12      There are 8 distinct terms {1,2,3,4,6,8,9,
12}, therefore P(3,4) = 8. You are given that: P(64,64) = 1263, P(12,345) = 1998, and P(32,1015) = 13826382602124302.
 Find P(64,1016).

*/

    @Test
    public void test() {
        Assert.assertEquals(258381958195474745L, Problem466.solve(/* change signature to provide required inputs */));
    }
}

