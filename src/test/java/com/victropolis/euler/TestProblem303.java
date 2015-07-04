package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem303 {
/*

Description (from https://projecteuler.net/problem=303):

For a positive integer n, define f(n) as the least positive multiple of n that, written in base 10, uses only digits
≤ 2. Thus f(2)=2, f(3)=12, f(7)=21, f(42)=210, f(89)=1121222. Also, .  Find .

*/

    @Test
    public void test() {
        Assert.assertEquals(1111981904675169L, Problem303.solve(/* change signature to provide required inputs */));
    }
}

