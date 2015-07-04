package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem412 {
/*

Description (from https://projecteuler.net/problem=412):

For integers m, n (0&nbsp;≤&nbsp;n&nbsp;&lt;&nbsp;m), let L(m,&nbsp;n) be an m×m grid with the top-right n×n grid
removed. For example, L(5, 3) looks like this:  We want to number each cell of L(m,&nbsp;n) with consecutive integers
 1, 2, 3, ... such that the number in every cell is smaller than the number below it and to the left of it. For
 example, here are two valid numberings of L(5,&nbsp;3):  Let LC(m, n) be the number of valid numberings of L(m, n).
 It can be verified that LC(3,&nbsp;0) = 42, LC(5,&nbsp;3) = 250250, LC(6,&nbsp;3) = 406029023400 and LC(10,&nbsp;5)
 mod 76543217 = 61251715. Find LC(10000,&nbsp;5000) mod 76543217.

*/

    @Test
    public void test() {
        Assert.assertEquals(38788800L, Problem412.solve(/* change signature to provide required inputs */));
    }
}

