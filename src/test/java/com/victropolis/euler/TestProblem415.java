package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem415 {
/*

Description (from https://projecteuler.net/problem=415):

A set of lattice points S is called a titanic set if there exists a line passing through exactly two points in S. An
example of a titanic set is S = {(0, 0), (0, 1), (0, 2), (1, 1), (2, 0), (1, 0)}, where the line passing through (0,
1) and (2, 0) does not pass through any other point in S. On the other hand, the set {(0, 0), (1, 1), (2, 2), (4, 4)}
 is not a titanic set since the line passing through any two points in the set also passes through the other two. For
  any positive integer N, let T(N) be the number of titanic sets S whose every point (x, y) satisfies 0 ≤ x, y ≤ N.
  It can be verified that T(1) = 11, T(2) = 494, T(4) = 33554178, T(111) mod 108 = 13500401 and T(105)&nbsp;mod&nbsp;
  108 = 63259062. Find T(1011)&nbsp;mod&nbsp;108.

*/

    @Test
    public void test() {
        Assert.assertEquals(55859742L, Problem415.solve(/* change signature to provide required inputs */));
    }
}

