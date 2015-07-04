package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem469 {
/*

Description (from https://projecteuler.net/problem=469):

In a room N chairs are placed around a round table. Knights enter the room one by one and choose at random an
available empty chair. To have enough elbow room the knights always leave at least one empty chair between each other
.   When there aren't any suitable chairs left, the fraction C of empty chairs is determined. We also define E(N) as
the expected value of C. We can verify that E(4) = 1/2 and E(6) = 5/9.   Find E(1018). Give your answer rounded to
fourteen decimal places in the form 0.abcdefghijklmn.

*/

    @Test
    public void test() {
        Assert.assertEquals(0.56766764161831F, Problem469.solve(/* change signature to provide required inputs */));
    }
}

