package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem447 {
/*

Description (from https://projecteuler.net/problem=447):

For every integer n&gt;1, the family of functions fn,a,b is defined by fn,a,b(x)≡ax+b mod n for a,b,x integer and
0&lt;a&lt;n, 0≤b&lt;n, 0≤x&lt;n. We will call fn,a,b a retraction if fn,a,b(fn,a,b(x))≡fn,a,b(x) mod n for every
0≤x&lt;n. Let R(n) be the number of retractions for n.   F(N)=∑R(n) for 2≤n≤N. F(107)≡638042271 (mod 1 000 000 007).
  Find F(1014) (mod 1 000 000 007).

*/

    @Test
    public void test() {
        Assert.assertEquals(530553372L, Problem447.solve(/* change signature to provide required inputs */));
    }
}

