package random.challenge;

import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {

        int[] A = {1, 3, 6, 4, 1, 2};

        int number = solution(A);

        System.out.println(number);
    }
    static public int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : A) {
            if (num > 0) {
                set.add(num);
            }
        }

        int smallestMissing = 1;
        while (set.contains(smallestMissing)) {
            smallestMissing++;
        }

        return smallestMissing;
    }
}
