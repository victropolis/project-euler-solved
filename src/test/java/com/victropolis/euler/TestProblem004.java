package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by victropolis on 6/12/15.
 */
public class TestProblem004 {
    @Test
    public void test() {
        Assert.assertEquals(906609L, Problem004.solve(100, 999));
    }
}
