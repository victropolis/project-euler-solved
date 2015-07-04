package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem178 {
/*

Description (from https://projecteuler.net/problem=178):

Consider the number 45656.  It can be seen that each pair of consecutive digits of 45656 has a difference of one.  A
number for which every pair of consecutive digits has a difference of one is called a step number.  A pandigital
number contains every decimal digit from 0 to 9 at least once.  How many pandigital step numbers less than 10 40 are
there?

*/

    @Test
    public void test() {
        Assert.assertEquals(126461847755L, Problem178.solve(/* change signature to provide required inputs */));
    }
}

