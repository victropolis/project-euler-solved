package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem369 {
/*

Description (from https://projecteuler.net/problem=369):

In a standard 52 card deck of playing cards, a set of 4 cards is a Badugi if it contains 4 cards with no pairs and no
 two cards of the same suit. Let f(n) be the number of ways to choose n cards with a 4 card subset that is a Badugi.
 For example, there are 2598960 ways to choose five cards from a standard 52 card deck, of which 514800 contain a 4
 card subset that is a Badugi, so f(5) = 514800. Find ∑f(n) for 4 ≤ n ≤ 13.

*/

    @Test
    public void test() {
        Assert.assertEquals(862400558448L, Problem369.solve(/* change signature to provide required inputs */));
    }
}

