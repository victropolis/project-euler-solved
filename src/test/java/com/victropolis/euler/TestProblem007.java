package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by victropolis on 6/12/15.
 */
public class TestProblem007 {
    @Test
    public void test() {
        Assert.assertEquals(104743L, Problem007.nthPrime(10001));
    }
}
