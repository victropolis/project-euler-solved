package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem266 {
/*

Description (from https://projecteuler.net/problem=266):

The divisors of 12 are: 1,2,3,4,6 and 12. The largest divisor of 12 that does not exceed the square root of 12 is 3.
We shall call the largest divisor of an integer n that does not exceed the square root of n the pseudo square root
(PSR) of n. It can be seen that PSR(3102)=47.   Let p be the product of the primes below 190. Find PSR(p) mod 1016.

*/

    @Test
    public void test() {
        Assert.assertEquals(1096883702440585L, Problem266.solve(/* change signature to provide required inputs */));
    }
}

