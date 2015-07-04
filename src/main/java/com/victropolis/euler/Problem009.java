package com.victropolis.euler;

/**
 * Created by victropolis on 6/12/15.
 */
public class Problem009 extends BaseProblem {
    /*

    A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

    a2 + b2 = c2
    For example, 32 + 42 = 9 + 16 = 25 = 52.

    There exists exactly one Pythagorean triplet for which a + b + c = 1000.

    Find the product abc.

    */
    public static double solve(int sum) {
        double answer = 0;

        int a = 0, b = 0;
        double c = 0;
        for (a = 1; (a < 1000) && ((a + b + c) != sum); a++) {
            int aSquared = a * a;
            for (b = a + 1; (b < 1000) && ((a + b + c) != sum); b++) {
                int bSquared = b * b;
                c = Math.sqrt(aSquared + bSquared);
                if (a < b && b < c && (a + b + c) == sum) {
                    answer = a * b * c;
                }
            }
        }

        return answer;
    }
}