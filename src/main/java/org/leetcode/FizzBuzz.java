package org.leetcode;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
 */

public class FizzBuzz {
    public static void main(String[] args) {

        int n = 15;

        List<String> list = IntStream.rangeClosed(1, n)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.toList());


        list.replaceAll(s -> {
            int num = Integer.parseInt(s);
            if (num % 3 == 0 && num % 5 == 0) return "FizzBuzz";
            if (num % 3 == 0) return "Fizz";
            if (num % 5 == 0) return "Buzz";
            return s;
        });


      //  System.out.println(list);
        list.forEach(s -> {
            System.out.println(s);
        });

    }


}
