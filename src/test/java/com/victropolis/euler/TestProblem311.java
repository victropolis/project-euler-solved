package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem311 {
/*

Description (from https://projecteuler.net/problem=311):

ABCD is a convex, integer sided quadrilateral with 1 ≤ AB &lt; BC &lt; CD &lt; AD. BD has integer length. O is the
midpoint of BD. AO has integer length. We'll call ABCD a biclinic integral quadrilateral if AO = CO ≤ BO = DO.  For
example, the following quadrilateral is a biclinic integral quadrilateral: AB = 19, BC = 29, CD = 37, AD = 43, BD =
48 and AO = CO = 23.     Let B(N) be the number of distinct biclinic integral quadrilaterals ABCD that satisfy
AB2+BC2+CD2+AD2 ≤ N. We can verify that B(10 000) = 49 and B(1 000 000) = 38239.  Find B(10 000 000 000).

*/

    @Test
    public void test() {
        Assert.assertEquals(2466018557L, Problem311.solve(/* change signature to provide required inputs */));
    }
}

