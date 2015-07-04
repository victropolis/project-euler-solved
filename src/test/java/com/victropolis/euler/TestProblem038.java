package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem038 {
/*

Description (from https://projecteuler.net/problem=38):

Take the number 192 and multiply it by each of 1, 2, and 3:  192 × 1 = 192  192 × 2 = 384  192 × 3 = 576  By
concatenating each product we get the 1 to 9 pandigital, 192384576. We will call 192384576 the concatenated product
of 192 and (1,2,3) The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5, giving the
pandigital, 918273645, which is the concatenated product of 9 and (1,2,3,4,5). What is the largest 1 to 9 pandigital
9-digit number that can be formed as the concatenated product of an integer with (1,2, ... , n) where n &gt; 1?

*/

    @Test
    public void test() {
        Assert.assertEquals(932718654L, Problem038.solve(/* change signature to provide required inputs */));
    }
}

