package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem373 {
/*

Description (from https://projecteuler.net/problem=373):

Every triangle has a circumscribed circle that goes through the three vertices. Consider all integer sided triangles
for which the radius of the circumscribed circle is integral as well.   Let S(n) be the sum of the radii of the
circumscribed circles of all such triangles for which the radius does not exceed n.  S(100)=4950 and S(1200)=1653605.
   Find S(107).

*/

    @Test
    public void test() {
        Assert.assertEquals(727227472448913L, Problem373.solve(/* change signature to provide required inputs */));
    }
}

