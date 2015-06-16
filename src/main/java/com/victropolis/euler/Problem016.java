package com.victropolis.euler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by victropolis on 6/12/15.
 */
public class Problem016 extends BaseProblem {
/*

215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?

*/
    public static long solve(int base, int exponent) {
        List<Integer> digits = new ArrayList<Integer>();
        digits.add(base);

        for (int x = 0; x < exponent-1; x++) {
            Integer carry = 0;

            for (int position = 0; position < digits.size(); position++) {
                Integer number = digits.get(position);
                number = (number * base) + carry;

                if (number > 9) {
                    carry = number / 10;
                    number = number % 10;
                }
                else {
                    carry = 0;
                }

                digits.set(position, number);
            }

            if (carry > 0) {
                digits.add(carry);
            }
        }

        int answer = 0;

        for (Integer digit : digits) {
            answer+=digit;
        }

        return answer;
    }
}