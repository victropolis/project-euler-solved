package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem210 {
/*

Description (from https://projecteuler.net/problem=210):

Consider the set S(r) of points (x,y) with integer coordinates satisfying |x| + |y| ≤ r.  Let O be the point (0,0)
and C the point (r/4,r/4).  Let N(r) be the number of points B in S(r), so that the triangle OBC has an obtuse angle,
 i.e. the largest angle α satisfies 90°&lt;α&lt;180°.  So, for example, N(4)=24 and N(8)=100.  What is N(1,000,000,000)?

*/

    @Test
    public void test() {
        Assert.assertEquals(1598174770174689458L, Problem210.solve(/* change signature to provide required inputs */));
    }
}

