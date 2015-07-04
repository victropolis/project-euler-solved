package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem409 {
/*

Description (from https://projecteuler.net/problem=409):

Let n be a positive integer. Consider nim positions where:  There are n non-empty piles.  Each pile has size less
than 2n.  No two piles have the same size.    Let W(n) be the number of winning nim positions satisfying the above
conditions (a position is winning if the first player has a winning strategy). For example, W(1) = 1, W(2) = 6, W(3)
= 168, W(5) = 19764360 and W(100) mod 1&nbsp;000&nbsp;000&nbsp;007 = 384777056.  Find W(10&nbsp;000&nbsp;000) mod
1&nbsp;000&nbsp;000&nbsp;007.

*/

    @Test
    public void test() {
        Assert.assertEquals(253223948L, Problem409.solve(/* change signature to provide required inputs */));
    }
}

