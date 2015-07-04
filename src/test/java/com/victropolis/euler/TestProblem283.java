package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem283 {
/*

Description (from https://projecteuler.net/problem=283):

Consider the triangle with sides 6, 8 and 10. It can be seen that the perimeter and the area are both equal to 24. So
 the area/perimeter ratio is equal to 1. Consider also the triangle with sides 13, 14 and 15. The perimeter equals 42
  while the area is equal to 84. So for this triangle the area/perimeter ratio is equal to 2.   Find the sum of the
  perimeters of all integer sided triangles for which the area/perimeter ratios are equal to positive integers not
  exceeding 1000.

*/

    @Test
    public void test() {
        Assert.assertEquals(28038042525570324L, Problem283.solve(/* change signature to provide required inputs */));
    }
}

