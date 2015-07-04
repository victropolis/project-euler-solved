package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem457 {
/*

Description (from https://projecteuler.net/problem=457):

Let f(n) = n2 - 3n - 1. Let p be a prime. Let R(p) be the smallest positive integer n such that f(n) mod p2 = 0 if
such an integer n exists, otherwise R(p) = 0.   Let SR(L) be ∑R(p) for all primes not exceeding L.   Find SR(107).

*/

    @Test
    public void test() {
        Assert.assertEquals(2647787126797397063L, Problem457.solve(/* change signature to provide required inputs */));
    }
}

