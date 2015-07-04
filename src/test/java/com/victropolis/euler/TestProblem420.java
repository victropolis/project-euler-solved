package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem420 {
/*

Description (from https://projecteuler.net/problem=420):

A positive integer matrix is a matrix whose elements are all positive integers. Some positive integer matrices can be
 expressed as a square of a positive integer matrix in two different ways. Here is an example:     We define F(N) as
 the number of the 2x2 positive integer matrices which have a trace less than N and which can be expressed as a
 square of a positive integer matrix in two different ways. We can verify that F(50) = 7 and F(1000) = 1019.   Find F
 (107).

*/

    @Test
    public void test() {
        Assert.assertEquals(145159332L, Problem420.solve(/* change signature to provide required inputs */));
    }
}

