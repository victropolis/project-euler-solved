package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem342 {
/*

Description (from https://projecteuler.net/problem=342):

Consider the number 50. 502 = 2500 = 22 × 54, so φ(2500) = 2 × 4 × 53 = 8 × 53 = 23 × 53. 1 So 2500 is a square and φ
(2500) is a cube.   Find the sum of all numbers n, 1 &lt; n &lt; 1010 such that φ(n2) is a cube.   1 φ denotes
Euler's totient function.

*/

    @Test
    public void test() {
        Assert.assertEquals(5943040885644L, Problem342.solve(/* change signature to provide required inputs */));
    }
}

