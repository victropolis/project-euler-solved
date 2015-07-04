package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem463 {
/*

Description (from https://projecteuler.net/problem=463):

The function $f$ is defined for all positive integers as follows:   $f(1)=1$  $f(3)=3$  $f(2n)=f(n)$  $f(4n + 1)=2f
(2n + 1) - f(n)$  $f(4n + 3)=3f(2n + 1) - 2f(n)$    The function $S(n)$ is defined as $\sum_{i=1}^{n}f(i)$. $S(8)=22$
 and $S(100)=3604$. Find $S(3^{37})$. Give the last 9 digits of your answer.

*/

    @Test
    public void test() {
        Assert.assertEquals(808981553L, Problem463.solve(/* change signature to provide required inputs */));
    }
}

