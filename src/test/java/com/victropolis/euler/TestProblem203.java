package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem203 {
/*

Description (from https://projecteuler.net/problem=203):

The binomial coefficients nCk can be arranged in triangular form, Pascal's triangle, like this:      1     1  1     1
  2  1     1  3  3  1     1  4  6  4  1     1  5  10  10  5  1     1  6  15  20  15  6  1    1  7  21  35  35  21  7
   1    .........  It can be seen that the first eight rows of Pascal's triangle contain twelve distinct numbers: 1,
   &nbsp;2,&nbsp;3,&nbsp;4,&nbsp;5,&nbsp;6,&nbsp;7,&nbsp;10,&nbsp;15,&nbsp;20,&nbsp;21&nbsp;and&nbsp;35. A positive
   integer n is called squarefree if no square of a prime divides n. Of the twelve distinct numbers in the first
   eight rows of Pascal's triangle, all except 4 and 20 are squarefree. The sum of the distinct squarefree numbers in
    the first eight rows is 105. Find the sum of the distinct squarefree numbers in the first 51 rows of Pascal's
    triangle.

*/

    @Test
    public void test() {
        Assert.assertEquals(34029210557338L, Problem203.solve(/* change signature to provide required inputs */));
    }
}

