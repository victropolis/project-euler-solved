package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem448 {
/*

Description (from https://projecteuler.net/problem=448):

The function lcm(a,b) denotes the least common multiple of a and b. Let A(n) be the average of the values of lcm(n,i)
 for 1≤i≤n. E.g: A(2)=(2+2)/2=2 and A(10)=(10+10+30+20+10+30+70+40+90+10)/10=32.  Let S(n)=∑A(k) for 1≤k≤n.  S(100)
 =122726.   Find S(99999999019) mod 999999017.

*/

    @Test
    public void test() {
        Assert.assertEquals(106467648L, Problem448.solve(/* change signature to provide required inputs */));
    }
}

