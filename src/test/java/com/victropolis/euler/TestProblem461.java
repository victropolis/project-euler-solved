package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem461 {
/*

Description (from https://projecteuler.net/problem=461):

Let fn(k)&nbsp;=&nbsp;ek/n&nbsp;-&nbsp;1, for all non-negative integers k. Remarkably, f200(6)&nbsp;+&nbsp;f200(75)
&nbsp;+&nbsp;f200(89)&nbsp;+&nbsp;f200(226)&nbsp;= 3.141592644529…&nbsp;≈&nbsp;π. In fact, it is the best
approximation of π of the form fn(a)&nbsp;+&nbsp;fn(b)&nbsp;+&nbsp;fn(c)&nbsp;+&nbsp;fn(d) for n&nbsp;=&nbsp;200. Let
 g(n)&nbsp;=&nbsp;a2&nbsp;+&nbsp;b2&nbsp;+&nbsp;c2&nbsp;+&nbsp;d 2 for a, b, c, d that minimize the error: |&nbsp;fn
 (a)&nbsp;+&nbsp;fn(b)&nbsp;+&nbsp;fn(c)&nbsp;+&nbsp;fn(d)&nbsp;-&nbsp;π| (where |x| denotes the absolute value of x)
 . You are given g(200)&nbsp;=&nbsp;62&nbsp;+&nbsp;752&nbsp;+&nbsp;892&nbsp;+&nbsp;2262&nbsp;=&nbsp;64658. Find g
 (10000).

*/

    @Test
    public void test() {
        Assert.assertEquals(159820276L, Problem461.solve(/* change signature to provide required inputs */));
    }
}

