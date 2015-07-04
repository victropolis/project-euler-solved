package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem254 {
/*

Description (from https://projecteuler.net/problem=254):

Define f(n) as the sum of the factorials of the digits of n. For example, f(342) = 3! + 4! + 2! = 32. Define sf(n) as
 the sum of the digits of f(n). So sf(342) = 3 + 2 = 5. Define g(i) to be the smallest positive integer n such that
 sf(n) = i. Though sf(342) is 5, sf(25) is also 5, and it can be verified that g(5) is 25. Define sg(i) as the sum of
  the digits of g(i). So sg(5) = 2 + 5 = 7. Further, it can be verified that g(20) is 267 and ∑ sg(i) for 1 ≤ i ≤ 20
  is 156. What is ∑ sg(i) for 1 ≤ i ≤ 150?

*/

    @Test
    public void test() {
        Assert.assertEquals(8184523820510L, Problem254.solve(/* change signature to provide required inputs */));
    }
}

