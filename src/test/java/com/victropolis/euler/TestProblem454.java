package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem454 {
/*

Description (from https://projecteuler.net/problem=454):

In the following equation x, y, and n are positive integers.       1  x   +    1  y   =    1  n      For a limit L we
 define F(L) as the number of solutions which satisfy x &lt; y ≤ L. We can verify that F(15) = 4 and F(1000) = 1069.
 Find F(1012).

*/

    @Test
    public void test() {
        Assert.assertEquals(5435004633092L, Problem454.solve(/* change signature to provide required inputs */));
    }
}

