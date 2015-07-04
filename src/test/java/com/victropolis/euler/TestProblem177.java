package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem177 {
/*

Description (from https://projecteuler.net/problem=177):

Let ABCD be a convex quadrilateral, with diagonals AC and BD. At each vertex the diagonal makes an angle with each of
 the two sides, creating eight corner angles.  For example, at vertex A, the two angles are CAD, CAB. We call such a
 quadrilateral for which all eight corner angles have integer values when measured in degrees an "integer angled
 quadrilateral". An example of an integer angled quadrilateral is a square, where all eight corner angles are 45°.
 Another example is given by DAC = 20°, BAC = 60°, ABD = 50°, CBD = 30°, BCA = 40°, DCA = 30°, CDB = 80°, ADB = 50°.
 What is the total number of non-similar integer angled quadrilaterals? Note: In your calculations you may assume
 that a calculated angle is integral if it is within a tolerance of 10-9 of an integer value.

*/

    @Test
    public void test() {
        Assert.assertEquals(129325L, Problem177.solve(/* change signature to provide required inputs */));
    }
}

