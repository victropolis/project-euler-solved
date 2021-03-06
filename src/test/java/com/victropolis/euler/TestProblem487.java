package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem487 {
/*

Description (from https://projecteuler.net/problem=487):

Let fk(n) be the sum of the kth powers of the first n positive integers. For example, f2(10) = 12 + 22 + 32 + 42 + 52
 + 62 + 72 + 82 + 92 + 102 = 385. Let Sk(n) be the sum of fk(i) for 1 ≤ i ≤ n. For example, S4(100) = 35375333830.
 What is ∑ (S10000(1012) mod p) over all primes p between 2 ⋅ 109 and 2 ⋅ 109 + 2000?

*/

    @Test
    public void test() {
        Assert.assertEquals(106650212746L, Problem487.solve(/* change signature to provide required inputs */));
    }
}

