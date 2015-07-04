package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem148 {
/*

Description (from https://projecteuler.net/problem=148):

We can easily verify that none of the entries in the first seven rows of Pascal's triangle are divisible by 7:
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;1   &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;1 &nbsp; &nbsp;1
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;1 &nbsp; &nbsp;2 &nbsp; &nbsp;1   &nbsp; &nbsp; &nbsp; &nbsp;1 &nbsp; &nbsp;3
&nbsp; &nbsp;3 &nbsp; &nbsp;1   &nbsp; &nbsp; &nbsp;1 &nbsp; &nbsp;4 &nbsp; &nbsp;6 &nbsp; &nbsp;4 &nbsp; &nbsp;1
&nbsp; &nbsp;1 &nbsp; &nbsp;5 &nbsp; 10 &nbsp; 10 &nbsp; &nbsp;5 &nbsp; &nbsp;1   1 &nbsp; &nbsp;6 &nbsp; 15 &nbsp;
20 &nbsp; 15 &nbsp; &nbsp;6 &nbsp; &nbsp;1    However, if we check the first one hundred rows, we will find that only
 2361 of the 5050 entries are not divisible by 7. Find the number of entries which are not divisible by 7 in the
 first one billion (109) rows of Pascal's triangle.

*/

    @Test
    public void test() {
        Assert.assertEquals(2129970655314432L, Problem148.solve(/* change signature to provide required inputs */));
    }
}

