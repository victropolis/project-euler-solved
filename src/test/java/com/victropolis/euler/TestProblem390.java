package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem390 {
/*

Description (from https://projecteuler.net/problem=390):

Consider the triangle with sides √5, √65 and √68. It can be shown that this triangle has area 9. S(n) is the sum of
the areas of all triangles with sides √(1+b2), √(1+c2) and √(b2+c2) (for positive integers b and c ) that have an
integral area not exceeding n. The example triangle has b=2 and c=8. S(106)=18018206. Find S(1010).

*/

    @Test
    public void test() {
        Assert.assertEquals(2919133642971L, Problem390.solve(/* change signature to provide required inputs */));
    }
}

