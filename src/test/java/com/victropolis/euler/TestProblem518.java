package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem518 {
/*

Description (from https://projecteuler.net/problem=518):

Let S(n) = a+b+c over all triples (a,b,c) such that:  a, b, and c are prime numbers. a &lt; b &lt; c &lt; n. a+1,
b+1, and c+1 form a geometric sequence.  For example, S(100) = 1035 with the following triples:  (2, 5, 11), (2, 11,
47), (5, 11, 23), (5, 17, 53), (7, 11, 17), (7, 23, 71), (11, 23, 47), (17, 23, 31), (17, 41, 97), (31, 47, 71), (71,
 83, 97) Find S(108).

*/

    @Test
    public void test() {
        Assert.assertEquals(100315739184392L, Problem518.solve(/* change signature to provide required inputs */));
    }
}

