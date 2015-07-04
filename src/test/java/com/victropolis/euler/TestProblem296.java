package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem296 {
/*

Description (from https://projecteuler.net/problem=296):

Given is an integer sided triangle ABC with BC ≤ AC ≤ AB. k is the angular bisector of angle ACB. m is the tangent at
 C to the circumscribed circle of ABC. n is a line parallel to m through B. The intersection of n and k is called E.
      How many triangles ABC with a perimeter not exceeding 100 000 exist such that BE has integral length?

*/

    @Test
    public void test() {
        Assert.assertEquals(1137208419L, Problem296.solve(/* change signature to provide required inputs */));
    }
}

