package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by victropolis on 6/12/15.
 */
public class TestProblem001 {
    @Test
    public void test() {
        Assert.assertEquals(233168L, Problem001.solve(1000));
    }
}
