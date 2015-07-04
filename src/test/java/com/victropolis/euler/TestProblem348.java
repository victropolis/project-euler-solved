package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem348 {
/*

Description (from https://projecteuler.net/problem=348):

Many numbers can be expressed as the sum of a square and a cube. Some of them in more than one way. Consider the
palindromic numbers that can be expressed as the sum of a square and a cube, both greater than 1, in exactly 4
different ways. For example, 5229225 is a palindromic number and it can be expressed in exactly 4 different ways:
22852 + 203 22232 + 663 18102 + 1253 11972 + 1563 Find the sum of the five smallest such palindromic numbers.

*/

    @Test
    public void test() {
        Assert.assertEquals(1004195061L, Problem348.solve(/* change signature to provide required inputs */));
    }
}

