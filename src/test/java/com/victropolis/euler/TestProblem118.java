package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem118 {
/*

Description (from https://projecteuler.net/problem=118):

Using all of the digits 1 through 9 and concatenating them freely to form decimal integers, different sets can be
formed. Interestingly with the set {2,5,47,89,631}, all of the elements belonging to it are prime. How many distinct
sets containing each of the digits one through nine exactly once contain only prime elements?

*/

    @Test
    public void test() {
        Assert.assertEquals(44680L, Problem118.solve(/* change signature to provide required inputs */));
    }
}

