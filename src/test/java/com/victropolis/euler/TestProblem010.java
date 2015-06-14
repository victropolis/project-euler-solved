package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by victropolis on 6/12/15.
 */
public class TestProblem010 {
    @Test
    public void test() {
        Assert.assertEquals(17L, Problem010.solve(10));
        Assert.assertEquals(142913828922L, Problem010.solve(2000000));
    }
}
