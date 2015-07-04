package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem192 {
/*

Description (from https://projecteuler.net/problem=192):

Let x be a real number. A best approximation to x for the denominator bound d is a rational number r/s in reduced
form, with s ≤ d, such that any rational number which is closer to x than r/s has a denominator larger than d:  | p/
q- x| &lt; | r/ s- x| ⇒ q &gt; d  For example, the best approximation to √13 for the denominator bound 20 is 18/5 and
 the best approximation to √13 for the denominator bound 30 is 101/28. Find the sum of all denominators of the best
 approximations to √n for the denominator bound 1012, where n is not a perfect square and 1 &lt; n ≤ 100000.

*/

    @Test
    public void test() {
        Assert.assertEquals(57060635927998347L, Problem192.solve(/* change signature to provide required inputs */));
    }
}

