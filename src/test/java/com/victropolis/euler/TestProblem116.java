package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem116 {
/*

Description (from https://projecteuler.net/problem=116):

A row of five black square tiles is to have a number of its tiles replaced with coloured oblong tiles chosen from red
 (length two), green (length three), or blue (length four). If red tiles are chosen there are exactly seven ways this
  can be done.                                                                                       &nbsp;    If
  green tiles are chosen there are three ways.                                     &nbsp;    And if blue tiles are
  chosen there are two ways.                           Assuming that colours cannot be mixed there are 7 + 3 + 2 = 12
   ways of replacing the black tiles in a row measuring five units in length. How many different ways can the black
   tiles in a row measuring fifty units in length be replaced if colours cannot be mixed and at least one coloured
   tile must be used? NOTE: This is related to Problem 117.

*/

    @Test
    public void test() {
        Assert.assertEquals(20492570929L, Problem116.solve(/* change signature to provide required inputs */));
    }
}

