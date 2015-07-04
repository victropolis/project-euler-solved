package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem276 {
/*

Description (from https://projecteuler.net/problem=276):

Consider the triangles with integer sides a, b and c with a ≤ b ≤ c. An integer sided triangle (a,b,c) is called
primitive if  gcd(a,b,c)=1.  How many primitive integer sided triangles exist with a perimeter not exceeding 10 000 000?

*/

    @Test
    public void test() {
        Assert.assertEquals(5777137137739632912L, Problem276.solve(/* change signature to provide required inputs */));
    }
}

