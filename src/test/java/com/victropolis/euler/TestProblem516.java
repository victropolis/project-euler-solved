package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem516 {
/*

Description (from https://projecteuler.net/problem=516):

5-smooth numbers are numbers whose largest prime factor doesn't exceed 5. 5-smooth numbers are also called Hamming
numbers. Let S(L) be the sum of the numbers n not exceeding L such that Euler's totient function φ(n) is a Hamming
number. S(100)=3728.   Find S(1012). Give your answer modulo 232.

*/

    @Test
    public void test() {
        Assert.assertEquals(939087315L, Problem516.solve(/* change signature to provide required inputs */));
    }
}

