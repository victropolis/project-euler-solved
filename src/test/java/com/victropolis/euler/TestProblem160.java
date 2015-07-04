package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem160 {
/*

Description (from https://projecteuler.net/problem=160):

For any N, let f(N) be the last five digits before the trailing zeroes in N!. For example, 9! = 362880 so f(9)=36288
10! = 3628800 so f(10)=36288 20! = 2432902008176640000 so f(20)=17664 Find f(1,000,000,000,000)

*/

    @Test
    public void test() {
        Assert.assertEquals(16576L, Problem160.solve(/* change signature to provide required inputs */));
    }
}

