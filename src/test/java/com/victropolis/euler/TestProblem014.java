package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by victropolis on 6/12/15.
 */
public class TestProblem014 {
    @Test
    public void test() {
        Assert.assertEquals(837799, Problem014.solve(1000000));
    }
}