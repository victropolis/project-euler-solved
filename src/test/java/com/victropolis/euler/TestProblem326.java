package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem326 {
/*

Description (from https://projecteuler.net/problem=326):

Let an be a sequence recursively defined by: .   So the first 10 elements of an are: 1,1,0,3,0,3,5,4,1,9.  Let f(N,M)
 represent the number of pairs (p,q) such that:       It can be seen that f(10,10)=4 with the pairs (3,3), (5,5), (7,
 9) and (9,10).   You are also given that f(104,103)=97158.  Find f(1012,106).

*/

    @Test
    public void test() {
        Assert.assertEquals(1966666166408794329L, Problem326.solve(/* change signature to provide required inputs */));
    }
}

