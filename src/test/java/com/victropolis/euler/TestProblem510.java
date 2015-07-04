package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem510 {
/*

Description (from https://projecteuler.net/problem=510):

Circles A and B are tangent to each other and to line L at three distinct points. Circle C is inside the space
between A, B and L, and tangent to all three. Let rA, rB and rC be the radii of A, B and C respectively.     Let S(n)
&nbsp;=&nbsp;Σ&nbsp;rA&nbsp;+&nbsp;rB&nbsp;+&nbsp;rC, for 0&nbsp;&lt;&nbsp;rA&nbsp;≤&nbsp;rB&nbsp;≤&nbsp;n where rA,
rB and rC are integers. The only solution for 0&nbsp;&lt;&nbsp;rA&nbsp;≤&nbsp;rB&nbsp;≤&nbsp;5 is rA&nbsp;=&nbsp;4,
rB&nbsp;=&nbsp;4 and rC&nbsp;=&nbsp;1, so S(5)&nbsp;=&nbsp;4&nbsp;+&nbsp;4&nbsp;+&nbsp;1&nbsp;=&nbsp;9. You are also
given S(100)&nbsp;=&nbsp;3072. Find S(109).

*/

    @Test
    public void test() {
        Assert.assertEquals(315306518862563689L, Problem510.solve(/* change signature to provide required inputs */));
    }
}

