package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by victropolis on 6/12/15.
 */
public class TestProblem009 {
    @Test
    public void test() {
        Assert.assertEquals(31875000, Problem009.solve(1000), 0);
    }
}
