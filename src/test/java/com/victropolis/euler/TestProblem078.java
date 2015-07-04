package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem078 {
/*

Description (from https://projecteuler.net/problem=78):

Let p(n) represent the number of different ways in which n coins can be separated into piles. For example, five coins
 can be separated into piles in exactly seven different ways, so p(5)=7.     OOOOO   OOOO&nbsp; &nbsp;O   OOO&nbsp;
 &nbsp;OO   OOO&nbsp; &nbsp;O&nbsp; &nbsp;O   OO&nbsp; &nbsp;OO&nbsp; &nbsp;O   OO&nbsp; &nbsp;O&nbsp; &nbsp;O&nbsp;
 &nbsp;O   O&nbsp; &nbsp;O&nbsp; &nbsp;O&nbsp; &nbsp;O&nbsp; &nbsp;O     Find the least value of n for which p(n) is
 divisible by one million.

*/

    @Test
    public void test() {
        Assert.assertEquals(55374L, Problem078.solve(/* change signature to provide required inputs */));
    }
}

