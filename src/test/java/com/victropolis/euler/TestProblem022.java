package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem022 {
/*

Description (from https://projecteuler.net/problem=22):

Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first
names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply
this value by its alphabetical position in the list to obtain a name score. For example, when the list is sorted into
 alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would
 obtain a score of 938 × 53 = 49714. What is the total of all the name scores in the file?

*/

    @Test
    public void test() {
        Assert.assertEquals(871198282L, Problem022.solve(/* change signature to provide required inputs */));
    }
}

