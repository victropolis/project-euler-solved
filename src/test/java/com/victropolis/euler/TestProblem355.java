package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem355 {
/*

Description (from https://projecteuler.net/problem=355):

Define Co(n) to be the maximal possible sum of a set of mutually co-prime elements from {1,&nbsp;2,&nbsp;...,&nbsp;n}
. For example Co(10) is 30 and hits that maximum on the subset {1,&nbsp;5,&nbsp;7,&nbsp;8,&nbsp;9}.   You are given
that Co(30) = 193 and Co(100) = 1356.  Find Co(200000).

*/

    @Test
    public void test() {
        Assert.assertEquals(1726545007L, Problem355.solve(/* change signature to provide required inputs */));
    }
}

