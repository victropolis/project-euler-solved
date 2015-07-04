package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem271 {
/*

Description (from https://projecteuler.net/problem=271):

For a positive number n, define S(n) as the sum of the integers x, for which 1&lt;x&lt;n and x3≡1 mod n.   When n=91,
 there are 8 possible values for x, namely : 9, 16, 22, 29, 53, 74, 79, 81. Thus, S(91)=9+16+22+29+53+74+79+81=363.
 Find S(13082761331670030).

*/

    @Test
    public void test() {
        Assert.assertEquals(4617456485273129588L, Problem271.solve(/* change signature to provide required inputs */));
    }
}

