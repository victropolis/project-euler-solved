package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem486 {
/*

Description (from https://projecteuler.net/problem=486):

Let F5(n) be the number of strings s such that:  s consists only of '0's and '1's,  s has length at most n, and  s
contains a palindromic substring of length at least 5.   For example, F5(4)&nbsp;=&nbsp;0, F5(5)&nbsp;=&nbsp;8, F5(6)
&nbsp;=&nbsp;42 and F5(11)&nbsp;=&nbsp;3844. Let D(L) be the number of integers n such that 5&nbsp;≤&nbsp;n&nbsp;
≤&nbsp;L and F5(n) is divisible by 87654321. For example, D(107)&nbsp;=&nbsp;0 and D(5·109)&nbsp;=&nbsp;51. Find D
(1018).

*/

    @Test
    public void test() {
        Assert.assertEquals(11408450515L, Problem486.solve(/* change signature to provide required inputs */));
    }
}

