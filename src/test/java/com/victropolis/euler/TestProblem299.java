package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem299 {
/*

Description (from https://projecteuler.net/problem=299):

Four points with integer coordinates are selected:A(a,&nbsp;0), B(b,&nbsp;0), C(0,&nbsp;c) and D(0,&nbsp;d), with
0&nbsp;&lt;&nbsp;a&nbsp;&lt;&nbsp;b and 0&nbsp;&lt;&nbsp;c&nbsp;&lt;&nbsp;d. Point P, also with integer coordinates,
is chosen on the line AC so that the three triangles ABP, CDP and BDP are all similar.    It is easy to prove that
the three triangles can be similar, only if a=c. So, given that a=c, we are looking for triplets (a,b,d) such that at
 least one point P (with integer coordinates) exists on AC, making the three triangles ABP, CDP and BDP all similar.
 For example, if (a,b,d)=(2,3,4), it can be easily verified that point P(1,1) satisfies the above condition. Note
 that the triplets (2,3,4) and (2,4,3) are considered as distinct, although point P(1,1) is common for both. If
 b+d&nbsp;&lt;&nbsp;100, there are 92 distinct triplets (a,b,d) such that point P exists. If b+d&nbsp;&lt;&nbsp;100
 000, there are 320471 distinct triplets (a,b,d) such that point P exists. If b+d&nbsp;&lt;&nbsp;100 000 000, how
 many distinct triplets (a,b,d) are there such that point P exists?

*/

    @Test
    public void test() {
        Assert.assertEquals(549936643L, Problem299.solve(/* change signature to provide required inputs */));
    }
}

