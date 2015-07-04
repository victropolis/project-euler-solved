package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem388 {
/*

Description (from https://projecteuler.net/problem=388):

Consider all lattice points (a,b,c) with 0 ≤ a,b,c ≤ N.   From the origin O(0,0,0) all lines are drawn to the other
lattice points. Let D(N) be the number of distinct such lines.   You are given that D(1 000 000) = 831909254469114121
.   Find D(1010). Give as your answer the first nine digits followed by the last nine digits.

*/

    @Test
    public void test() {
        Assert.assertEquals(831907372805129931L, Problem388.solve(/* change signature to provide required inputs */));
    }
}

