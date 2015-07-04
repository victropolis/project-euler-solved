package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem370 {
/*

Description (from https://projecteuler.net/problem=370):

Let us define a geometric triangle as an integer sided triangle with sides a ≤ b ≤ c so that its sides form a
geometric progression, i.e. b2&nbsp;=&nbsp;a&nbsp;·&nbsp;c&nbsp;.&nbsp; An example of such a geometric triangle is
the triangle with sides a = 144, b = 156 and c = 169. There are 861805 geometric triangles with perimeter ≤ 106 . How
 many geometric triangles exist with perimeter ≤ 2.5·1013 ?

*/

    @Test
    public void test() {
        Assert.assertEquals(41791929448408L, Problem370.solve(/* change signature to provide required inputs */));
    }
}

