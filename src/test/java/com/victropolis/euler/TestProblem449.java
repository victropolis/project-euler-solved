package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem449 {
/*

Description (from https://projecteuler.net/problem=449):

Phil the confectioner is making a new batch of chocolate covered candy. Each candy centre is shaped like an ellipsoid
 of revolution defined by the equation: b2x2 + b2y2 + a2z2 = a2b2.   Phil wants to know how much chocolate is needed
 to cover one candy centre with a uniform coat of chocolate one millimeter thick.     If a=1 mm and b=1 mm, the
 amount of chocolate required is      28   3     π mm3    If a=2 mm and b=1 mm, the amount of chocolate required is
 approximately 60.35475635 mm 3.   Find the amount of chocolate in mm3 required if a=3 mm and b=1 mm. Give your
 answer as the number rounded to 8 decimal places behind the decimal point.

*/

    @Test
    public void test() {
        Assert.assertEquals(103.37870096F, Problem449.solve(/* change signature to provide required inputs */));
    }
}

