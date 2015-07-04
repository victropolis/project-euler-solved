package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem024 {
/*

Description (from https://projecteuler.net/problem=24):

A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2,
 3 and 4. If all of the permutations are listed numerically or alphabetically, we call it lexicographic order. The
 lexicographic permutations of 0, 1 and 2 are: 012&nbsp; &nbsp;021&nbsp; &nbsp;102&nbsp; &nbsp;120&nbsp; &nbsp;
 201&nbsp; &nbsp;210 What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?

*/

    @Test
    public void test() {
        Assert.assertEquals(2783915460L, Problem024.solve(/* change signature to provide required inputs */));
    }
}

