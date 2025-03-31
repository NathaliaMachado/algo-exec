package org.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public static void main(String[] args) {

        String ransomNote = "oaa";
        String magazine = "bbako";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {

            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }
        return true;
    }
}
