package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem226 {
/*

Description (from https://projecteuler.net/problem=226):

The blancmange curve is the set of points (x,y) such that 0 ≤ x ≤ 1 and  ,where s(x) = the distance from x to the
nearest integer. The area under the blancmange curve is equal to ½, shown in pink in the diagram below.    Let C be
the circle with centre (¼,½) and radius ¼, shown in black in the diagram. What area under the blancmange curve is
enclosed by C?Give your answer rounded to eight decimal places in the form 0.abcdefgh

*/

    @Test
    public void test() {
        Assert.assertEquals(0.11316017F, Problem226.solve(/* change signature to provide required inputs */));
    }
}

