package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem446 {
/*

Description (from https://projecteuler.net/problem=446):

For every integer n&gt;1, the family of functions fn,a,b is defined by fn,a,b(x)≡ax+b mod n for a,b,x integer and
0&lt;a&lt;n, 0≤b&lt;n, 0≤x&lt;n. We will call fn,a,b a retraction if fn,a,b(fn,a,b(x))≡fn,a,b(x) mod n for every
0≤x&lt;n. Let R(n) be the number of retractions for n.   F(N)=∑R(n4+4) for 1≤n≤N.  F(1024)=77532377300600.   Find F
(107) (mod 1 000 000 007)

*/

    @Test
    public void test() {
        Assert.assertEquals(907803852L, Problem446.solve(/* change signature to provide required inputs */));
    }
}

