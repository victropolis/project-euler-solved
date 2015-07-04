package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem471 {
/*

Description (from https://projecteuler.net/problem=471):

The triangle ΔABC is inscribed in an ellipse with equation $\frac {x^2} {a^2} + \frac {y^2} {b^2} = 1$, 0&nbsp;&lt;
&nbsp;2b&nbsp;&lt;&nbsp;a, a and b integers. Let r(a,b) be the radius of the incircle of ΔABC when the incircle has
center (2b, 0) and A has coordinates $\left( \frac a 2, \frac {\sqrt 3} 2 b\right)$. For example, r(3,1)&nbsp;=&nbsp;
½, r(6,2)&nbsp;=&nbsp;1, r(12,3)&nbsp;=&nbsp;2.   Let $G(n) = \sum_{a=3}^n \sum_{b=1}^{\lfloor \frac {a - 1} 2
\rfloor} r(a, b)$ You are given G(10) = 20.59722222, G(100) = 19223.60980 (rounded to 10 significant digits). Find G
(1011). Give your answer in scientific notation rounded to 10 significant digits. Use a lowercase e to separate
mantissa and exponent. For G(10) the answer would have been 2.059722222e1.

*/

    @Test
    public void test() {
        Assert.assertEquals(1.895093981F, Problem471.solve(/* change signature to provide required inputs */));
    }
}

