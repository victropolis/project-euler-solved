package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem458 {
/*

Description (from https://projecteuler.net/problem=458):

Consider the alphabet A made out of the letters of the word "project": A={c,e,j,o,p,r,t}. Let T(n) be the number of
strings of length n consisting of letters from A that do not have a substring that is one of the 5040 permutations of
 "project".  T(7)=7 7-7!=818503.   Find T(1012). Give the last 9 digits of your answer.

*/

    @Test
    public void test() {
        Assert.assertEquals(423341841L, Problem458.solve(/* change signature to provide required inputs */));
    }
}

