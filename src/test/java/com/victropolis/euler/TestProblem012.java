package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by victropolis on 6/12/15.
 */
public class TestProblem012 {
    @Test
    public void test() {
        Assert.assertEquals(28L, Problem012.solve(5));
        Assert.assertEquals(76576500L, Problem012.solve(500));
    }
}
