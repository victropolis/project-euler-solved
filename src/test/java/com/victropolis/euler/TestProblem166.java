package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem166 {
/*

Description (from https://projecteuler.net/problem=166):

A 4x4 grid is filled with digits d, 0 ≤ d ≤ 9. It can be seen that in the grid  6 3 3 0 5 0 4 3 0 7 1 4 1 2 4 5 the
sum of each row and each column has the value 12. Moreover the sum of each diagonal is also 12. In how many ways can
you fill a 4x4 grid with the digits d, 0 ≤ d ≤ 9 so that each row, each column, and both diagonals have the same sum?

*/

    @Test
    public void test() {
        Assert.assertEquals(7130034L, Problem166.solve(/* change signature to provide required inputs */));
    }
}

