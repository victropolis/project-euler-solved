package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem146 {
/*

Description (from https://projecteuler.net/problem=146):

The smallest positive integer n for which the numbers n2+1, n2+3, n2+7, n2+9, n2+13, and n2+27 are consecutive primes
 is 10. The sum of all such integers n below one-million is 1242490. What is the sum of all such integers n below 150
  million?

*/

    @Test
    public void test() {
        Assert.assertEquals(676333270L, Problem146.solve(/* change signature to provide required inputs */));
    }
}

