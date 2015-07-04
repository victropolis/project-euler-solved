package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem519 {
/*

Description (from https://projecteuler.net/problem=519):

An arrangement of coins in one or more rows with the bottom row being a block without gaps and every coin in a higher
 row touching exactly two coins in the row below is called a fountain of coins. Let f(n) be the number of possible
 fountains with n coins. For 4 coins there are three possible arrangements:    Therefore f(4)&nbsp;=&nbsp;3 while f
 (10)&nbsp;=&nbsp;78. Let T(n) be the number of all possible colorings with three colors for all f(n) different
 fountains with n coins, given the condition that no two touching coins have the same color. Below you see the
 possible colorings for one of the three valid fountains for 4 coins:    You are given that T(4)&nbsp;=&nbsp;48 and T
 (10)&nbsp;=&nbsp;17760. Find the last 9 digits of T(20000).

*/

    @Test
    public void test() {
        Assert.assertEquals(804739330L, Problem519.solve(/* change signature to provide required inputs */));
    }
}

