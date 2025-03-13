package org.leetcode;

/*
Given an integer num, return the number of steps to reduce it to zero.

In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 */

public class NumberOfSteps {
    public static void main(String[] args) {

        int num = 123;
        int count = 0;

        while (num > 0 ) {

            if (num % 2 == 0) {
                num /=  2;
            } else {
                num--;
            }
            count++;
        }

        System.out.println(count);
    }
}
