package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem413 {
/*

Description (from https://projecteuler.net/problem=413):

We say that a d-digit positive number (no leading zeros) is a one-child number if exactly one of its sub-strings is
divisible by d. For example, 5671 is a 4-digit one-child number. Among all its sub-strings 5, 6, 7, 1, 56, 67, 71,
567, 671 and 5671, only 56 is divisible by 4. Similarly, 104 is a 3-digit one-child number because only 0 is
divisible by 3. 1132451 is a 7-digit one-child number because only 245 is divisible by 7. Let F(N) be the number of
the one-child numbers less than N. We can verify that F(10) = 9, F(103) = 389 and F(107) = 277674. Find F(1019).

*/

    @Test
    public void test() {
        Assert.assertEquals(3079418648040719L, Problem413.solve(/* change signature to provide required inputs */));
    }
}
