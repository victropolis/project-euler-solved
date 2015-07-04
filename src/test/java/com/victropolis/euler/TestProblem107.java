package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem107 {
/*

Description (from https://projecteuler.net/problem=107):

The following undirected network consists of seven vertices and twelve edges with a total weight of 243.     The same
 network can be represented by the matrix below.    &nbsp;&nbsp;&nbsp;&nbsp; A B C D E F G   A - 16 12 21 - - -   B
 16 - - 17 20 - -   C 12 - - 28 - 31 -   D 21 17 28 - 18 19 23   E - 20 - 18 - - 11   F - - 31 19 - - 27   G - - - 23
  11 27 -    However, it is possible to optimise the network by removing some edges and still ensure that all points
  on the network remain connected. The network which achieves the maximum saving is shown below. It has a weight of
  93, representing a saving of 243 − 93 = 150 from the original network.     Using network.txt (right click and 'Save
   Link/Target As...'), a 6K text file containing a network with forty vertices, and given in matrix form, find the
   maximum saving which can be achieved by removing redundant edges whilst ensuring that the network remains connected.

*/

    @Test
    public void test() {
        Assert.assertEquals(259679L, Problem107.solve(/* change signature to provide required inputs */));
    }
}

