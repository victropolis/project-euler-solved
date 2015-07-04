package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem131 {
/*

Description (from https://projecteuler.net/problem=131):

There are some prime values, p, for which there exists a positive integer, n, such that the expression n3 + n2p is a
perfect cube. For example, when p = 19, 83 + 82×19 = 123. What is perhaps most surprising is that for each prime with
 this property the value of n is unique, and there are only four such primes below one-hundred. How many primes below
  one million have this remarkable property?

*/

    @Test
    public void test() {
        Assert.assertEquals(173L, Problem131.solve(/* change signature to provide required inputs */));
    }
}

