package com.victropolis.euler;

import org.junit.Assert;
import org.junit.Test;

/**
 * Generated programatically by victropolis on 07/04/15.
 */
public class TestProblem477 {
/*

Description (from https://projecteuler.net/problem=477):

The number sequence game starts with a sequence S of N numbers written on a line. Two players alternate turns. At his
 turn, a player must select and remove either the first or the last number remaining in the sequence. The player
 score is the sum of all the numbers he has taken. Each player attempts to maximize his own sum. If N = 4 and S = {1,
  2, 10, 3}, then each player maximizes his score as follows:   Player 1: removes the first number (1) Player 2:
  removes the last number from the remaining sequence (3) Player 1: removes the last number from the remaining
  sequence (10) Player 2: removes the remaining number (2)  Player 1 score is 1 + 10 = 11. Let F(N) be the score of
  player 1 if both players follow the optimal strategy for the sequence S = {s1, s2,&nbsp;...,&nbsp;sN} defined as:
  s1 = 0 si+1 = (si2 + 45) modulo 1 000 000 007  The sequence begins with S&nbsp;=&nbsp;{0,&nbsp;45,&nbsp;2070,&nbsp;
  4284945,&nbsp;753524550,&nbsp;478107844,&nbsp;894218625,&nbsp;...}. You are given F(2)&nbsp;=&nbsp;45, F(4)&nbsp;
  =&nbsp;4284990, F(100)&nbsp;=&nbsp;26365463243, F(104)&nbsp;=&nbsp;2495838522951. Find F(108).

*/

    @Test
    public void test() {
        Assert.assertEquals(25044905874565165L, Problem477.solve(/* change signature to provide required inputs */));
    }
}

