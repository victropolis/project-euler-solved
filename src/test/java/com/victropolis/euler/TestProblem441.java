package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem441 {
/*

Description (from https://projecteuler.net/problem=441):

For an integer M, we define R(M) as the sum of 1/(p·q) for all the integer pairs p and q which satisfy all of these
conditions:    1 ≤ p &lt; q ≤ M  p + q ≥ M  p and q are coprime.   We also define S(N) as the sum of R(i) for 2 ≤ i ≤
 N. We can verify that S(2) = R(2) = 1/2, S(10) ≈ 6.9147 and S(100) ≈ 58.2962.   Find S(107). Give your answer
 rounded to four decimal places.

*/

    @Test
    public void test() {
        Assert.assertEquals(5000088.8395F, Problem441.solve(/* change signature to provide required inputs */));
    }
}

