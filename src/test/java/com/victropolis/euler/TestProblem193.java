package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem193 {
/*

Description (from https://projecteuler.net/problem=193):

A positive integer n is called squarefree, if no square of a prime divides n, thus 1, 2, 3, 5, 6, 7, 10, 11 are
squarefree, but not 4, 8, 9, 12. How many squarefree numbers are there below 250?

*/

    @Test
    public void test() {
        Assert.assertEquals(684465067343069L, Problem193.solve(/* change signature to provide required inputs */));
    }
}

