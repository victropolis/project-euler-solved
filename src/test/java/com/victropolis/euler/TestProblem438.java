package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem438 {
/*

Description (from https://projecteuler.net/problem=438):

For an n-tuple of integers t = (a1, ..., an), let (x1, ..., xn) be the solutions of the polynomial equation xn +
a1xn-1 + a2xn-2 + ... + an-1x + an = 0.   Consider the following two conditions:   x1, ..., xn are all real.  If x1,
..., xn are sorted, ⌊xi⌋ = i for 1 ≤ i ≤ n. (⌊·⌋: floor function.)     In the case of n = 4, there are 12 n-tuples of
 integers which satisfy both conditions. We define S(t) as the sum of the absolute values of the integers in t. For n
  = 4 we can verify that ∑S(t) = 2087 for all n-tuples t which satisfy both conditions.   Find ∑S(t) for n = 7.

*/

    @Test
    public void test() {
        Assert.assertEquals(2046409616809L, Problem438.solve(/* change signature to provide required inputs */));
    }
}

