package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem066 {
/*

Description (from https://projecteuler.net/problem=66):

Consider quadratic Diophantine equations of the form: x2 – Dy2 = 1 For example, when D=13, the minimal solution in x
is 6492 – 13×1802 = 1. It can be assumed that there are no solutions in positive integers when D is square. By
finding minimal solutions in x for D = {2, 3, 5, 6, 7}, we obtain the following: 32 – 2×22 = 1 22 – 3×12 = 1 92 –
5×42 = 1 52 – 6×22 = 1 82 – 7×32 = 1 Hence, by considering minimal solutions in x for D ≤ 7, the largest x is
obtained when D=5. Find the value of D ≤ 1000 in minimal solutions of x for which the largest value of x is obtained.

*/

    @Test
    public void test() {
        Assert.assertEquals(661L, Problem066.solve(/* change signature to provide required inputs */));
    }
}

