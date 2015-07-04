package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem149 {
/*

Description (from https://projecteuler.net/problem=149):

Looking at the table below, it is easy to verify that the maximum possible sum of adjacent numbers in any direction
(horizontal, vertical, diagonal or anti-diagonal) is 16 (= 8 + 7 + 1).     −2 5 3 2   9 −6 5 1   3 2 7 3   −1 8 −4
&nbsp; 8     Now, let us repeat the search, but on a much larger scale: First, generate four million pseudo-random
numbers using a specific form of what is known as a "Lagged Fibonacci Generator": For 1 ≤ k ≤ 55, sk = [100003 −
200003k + 300007k3] (modulo 1000000) − 500000. For 56 ≤ k ≤ 4000000, sk = [sk−24 + sk−55 + 1000000] (modulo 1000000)
− 500000. Thus, s10 = −393027 and s100 = 86613. The terms of s are then arranged in a 2000×2000 table, using the
first 2000 numbers to fill the first row (sequentially), the next 2000 numbers to fill the second row, and so on.
Finally, find the greatest sum of (any number of) adjacent entries in any direction (horizontal, vertical, diagonal
or anti-diagonal).

*/

    @Test
    public void test() {
        Assert.assertEquals(52852124L, Problem149.solve(/* change signature to provide required inputs */));
    }
}

