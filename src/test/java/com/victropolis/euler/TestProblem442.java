package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem442 {
/*

Description (from https://projecteuler.net/problem=442):

An integer is called eleven-free if its decimal expansion does not contain any substring representing a power of 11
except 1. For example, 2404 and 13431 are eleven-free, while 911 and 4121331 are not. Let E(n) be the nth positive
eleven-free integer. For example, E(3) = 3, E(200) = 213 and E(500&nbsp;000) = 531563. Find E(1018).

*/

    @Test
    public void test() {
        Assert.assertEquals(1295552661530920149L, Problem442.solve(/* change signature to provide required inputs */));
    }
}

