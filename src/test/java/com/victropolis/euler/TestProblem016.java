package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by victropolis on 6/12/15.
 */
public class TestProblem016 {
    @Test
    public void test() {
        Assert.assertEquals(26, Problem016.solve(2, 15));
        Assert.assertEquals(1366, Problem016.solve(2, 1000));
    }
}