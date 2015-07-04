package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem129 {
/*

Description (from https://projecteuler.net/problem=129):

A number consisting entirely of ones is called a repunit. We shall define R(k) to be a repunit of length k; for
example, R(6) = 111111. Given that n is a positive integer and GCD(n, 10) = 1, it can be shown that there always
exists a value, k, for which R(k) is divisible by n, and let A(n) be the least such value of k; for example, A(7) = 6
 and A(41) = 5. The least value of n for which A(n) first exceeds ten is 17. Find the least value of n for which A(n)
  first exceeds one-million.

*/

    @Test
    public void test() {
        Assert.assertEquals(1000023L, Problem129.solve(/* change signature to provide required inputs */));
    }
}
