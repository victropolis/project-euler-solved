package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by victropolis on 6/12/15.
 */
public class TestProblem002 {
    @Test
    public void test() {
        Assert.assertEquals(4613732L, Problem002.solve(4000000));
    }
}
