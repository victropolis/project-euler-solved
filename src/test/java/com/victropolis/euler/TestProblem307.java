package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem307 {
/*

Description (from https://projecteuler.net/problem=307):

k defects are randomly distributed amongst n integrated-circuit chips produced by a factory (any number of defects
may be found on a chip and each defect is independent of the other defects).   Let p(k,n) represent the probability
that there is a chip with at least 3 defects. For instance p(3,7) ≈ 0.0204081633.   Find p(20 000, 1 000 000) and
give your answer rounded to 10 decimal places in the form 0.abcdefghij

*/

    @Test
    public void test() {
        Assert.assertEquals(0.7311720251F, Problem307.solve(/* change signature to provide required inputs */));
    }
}

