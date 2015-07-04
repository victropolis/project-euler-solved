package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem033 {
/*

Description (from https://projecteuler.net/problem=33):

The fraction 49/98 is a curious fraction, as an inexperienced mathematician in attempting to simplify it may
incorrectly believe that 49/98 = 4/8, which is correct, is obtained by cancelling the 9s. We shall consider fractions
 like, 30/50 = 3/5, to be trivial examples. There are exactly four non-trivial examples of this type of fraction,
 less than one in value, and containing two digits in the numerator and denominator. If the product of these four
 fractions is given in its lowest common terms, find the value of the denominator.

*/

    @Test
    public void test() {
        Assert.assertEquals(100L, Problem033.solve(/* change signature to provide required inputs */));
    }
}

