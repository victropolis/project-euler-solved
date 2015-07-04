package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem122 {
/*

Description (from https://projecteuler.net/problem=122):

The most naive way of computing n15 requires fourteen multiplications: n × n × ... × n = n15 But using a "binary"
method you can compute it in six multiplications: n × n = n2 n2 × n2 = n4 n4 × n4 = n8 n8 × n4 = n12 n12 × n2 = n14
n14 × n = n15 However it is yet possible to compute it in only five multiplications: n × n = n2 n2 × n = n3 n3 × n3 =
 n6 n6 × n6 = n12 n12 × n3 = n15 We shall define m(k) to be the minimum number of multiplications to compute nk; for
 example m(15) = 5. For 1 ≤ k ≤ 200, find ∑ m(k).

*/

    @Test
    public void test() {
        Assert.assertEquals(1582L, Problem122.solve(/* change signature to provide required inputs */));
    }
}

