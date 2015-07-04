package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem360 {
/*

Description (from https://projecteuler.net/problem=360):

Given two points (x1,y1,z1) and (x2,y2,z2) in three dimensional space, the Manhattan distance between those points is
 defined as  |x1-x2|+|y1-y2|+|z1-z2|.   Let C(r) be a sphere with radius r and center in the origin O(0,0,0). Let I
 (r) be the set of all points with integer coordinates on the surface of C(r). Let S(r) be the sum of the Manhattan
 distances of all elements of I(r) to the origin O.   E.g. S(45)=34518.   Find S(1010).

*/

    @Test
    public void test() {
        Assert.assertEquals(878825614395267072L, Problem360.solve(/* change signature to provide required inputs */));
    }
}

