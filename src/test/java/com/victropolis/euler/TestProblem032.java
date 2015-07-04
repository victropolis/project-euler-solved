package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem032 {
/*

Description (from https://projecteuler.net/problem=32):

We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once; for example,
 the 5-digit number, 15234, is 1 through 5 pandigital. The product 7254 is unusual, as the identity, 39 × 186 = 7254,
  containing multiplicand, multiplier, and product is 1 through 9 pandigital. Find the sum of all products whose
  multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital.  HINT: Some products can be
  obtained in more than one way so be sure to only include it once in your sum.

*/

    @Test
    public void test() {
        Assert.assertEquals(45228L, Problem032.solve(/* change signature to provide required inputs */));
    }
}

