package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem031 {
/*

Description (from https://projecteuler.net/problem=31):

In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:  1p,
2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).  It is possible to make £2 in the following way:  1×£1 + 1×50p +
2×20p + 1×5p + 1×2p + 3×1p  How many different ways can £2 be made using any number of coins?

*/

    @Test
    public void test() {
        Assert.assertEquals(73682L, Problem031.solve(/* change signature to provide required inputs */));
    }
}

