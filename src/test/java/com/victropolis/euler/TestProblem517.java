package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem517 {
/*

Description (from https://projecteuler.net/problem=517):

For every real number $a \gt 1$ is given the sequence $g_a$ by: $g_{a}(x)=1$ for $x \lt a$ $g_{a}(x)=g_{a}(x-1)+g_a
(x-a)$ for $x \ge a$ $G(n)=g_{\sqrt {n}}(n)$ $G(90)=7564511$.  Find $\sum G(p)$ for $p$ prime and $10000000 \lt p \lt
 10010000$ Give your answer modulo 1000000007.

*/

    @Test
    public void test() {
        Assert.assertEquals(581468882L, Problem517.solve(/* change signature to provide required inputs */));
    }
}
