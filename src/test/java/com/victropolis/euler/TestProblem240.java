package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem240 {
/*

Description (from https://projecteuler.net/problem=240):

There are 1111 ways in which five 6-sided dice (sides numbered 1 to 6) can be rolled so that the top three sum to 15.
 Some examples are:  D1,D2,D3,D4,D5 = 4,3,6,3,5  D1,D2,D3,D4,D5 = 4,3,3,5,6  D1,D2,D3,D4,D5 = 3,3,3,6,6  D1,D2,D3,D4,
 D5 = 6,6,3,3,3  In how many ways can twenty 12-sided dice (sides numbered 1 to 12) be rolled so that the top ten sum
  to 70?

*/

    @Test
    public void test() {
        Assert.assertEquals(7448717393364181966L, Problem240.solve(/* change signature to provide required inputs */));
    }
}

