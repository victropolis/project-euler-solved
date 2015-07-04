package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem506 {
/*

Description (from https://projecteuler.net/problem=506):

Consider the infinite repeating sequence of digits: 1234321234321234321... Amazingly, you can break this sequence of
digits into a sequence of integers such that the sum of the digits in the n'th value is n. The sequence goes as
follows: 1, 2, 3, 4, 32, 123, 43, 2123, 432, 1234, 32123, ... Let vn be the n'th value in this sequence. For example,
 v2&nbsp;=&nbsp;2, v5&nbsp;=&nbsp;32 and v11&nbsp;=&nbsp;32123. Let S(n) be v1&nbsp;+&nbsp;v2&nbsp;+&nbsp;...&nbsp;
 +&nbsp;vn. For example, S(11)&nbsp;=&nbsp;36120, and S(1000)&nbsp;mod&nbsp;123454321&nbsp;=&nbsp;18232686. Find S
 (1014)&nbsp;mod&nbsp;123454321.

*/

    @Test
    public void test() {
        Assert.assertEquals(18934502L, Problem506.solve(/* change signature to provide required inputs */));
    }
}

