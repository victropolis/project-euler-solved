package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem245 {
/*

Description (from https://projecteuler.net/problem=245):

We shall call a fraction that cannot be cancelled down a resilient fraction. Furthermore we shall define the
resilience of a denominator, R(d), to be the ratio of its proper fractions that are resilient; for example, R(12) =
4⁄11.    The resilience of a number d &gt; 1 is then   φ( d)  d − 1  , where φ is Euler's totient function.       We
further define the coresilience of a number n &gt; 1 as C(n) =&nbsp;   n − φ(n)  n − 1  .       The coresilience of a
 prime p is C(p) =&nbsp;   1  p − 1  .    Find the sum of all composite integers 1 &lt; n ≤ 2×1011, for which C(n) is
  a unit fraction.

*/

    @Test
    public void test() {
        Assert.assertEquals(288084712410001L, Problem245.solve(/* change signature to provide required inputs */));
    }
}

