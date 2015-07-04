package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem170 {
/*

Description (from https://projecteuler.net/problem=170):

Take the number 6 and multiply it by each of 1273 and 9854: 6 × 1273 = 7638 6 × 9854 = 59124 By concatenating these
products we get the 1 to 9 pandigital 763859124. We will call 763859124 the "concatenated product of 6 and (1273,
9854)". Notice too, that the concatenation of the input numbers, 612739854, is also 1 to 9 pandigital. The same can
be done for 0 to 9 pandigital numbers. What is the largest 0 to 9 pandigital 10-digit concatenated product of an
integer with two or more other integers, such that the concatenation of the input numbers is also a 0 to 9 pandigital
 10-digit number?

*/

    @Test
    public void test() {
        Assert.assertEquals(9857164023L, Problem170.solve(/* change signature to provide required inputs */));
    }
}

