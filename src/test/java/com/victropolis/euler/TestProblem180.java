package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem180 {
/*

Description (from https://projecteuler.net/problem=180):

For any integer n, consider the three functions f1,n(x,y,z) = xn+1 + yn+1 − zn+1 f2,n(x,y,z) = (xy + yz + zx)*(xn-1 +
 yn-1 − zn-1) f3,n(x,y,z) = xyz*(xn-2 + yn-2 − zn-2) and their combination fn(x,y,z) = f1,n(x,y,z) + f2,n(x,y,z) −
 f3,n(x,y,z) We call (x,y,z) a golden triple of order k if x, y, and z are all rational numbers of the form a / b
 with 0 &lt; a &lt; b ≤ k and there is (at least) one integer n, so that fn(x,y,z) = 0. Let s(x,y,z) = x + y + z. Let
  t = u / v be the sum of all distinct s(x,y,z) for all golden triples (x,y,z) of order 35. All the s(x,y,z) and t
  must be in reduced form. Find u + v.

*/

    @Test
    public void test() {
        Assert.assertEquals(285196020571078987L, Problem180.solve(/* change signature to provide required inputs */));
    }
}

