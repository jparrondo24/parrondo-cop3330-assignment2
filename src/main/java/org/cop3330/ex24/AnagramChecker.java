package org.cop3330.ex24;

import java.util.HashMap;

public class AnagramChecker {
    public boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        HashMap<Character, Integer> frequency1 = new HashMap<>();
        HashMap<Character, Integer> frequency2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char nextChar1 = str1.charAt(i);
            char nextChar2 = str2.charAt(i);

            int prevVal1 = frequency1.getOrDefault(nextChar1, 0);
            int prevVal2 = frequency2.getOrDefault(nextChar2, 0);

            frequency1.put(nextChar1, prevVal1 + 1);
            frequency2.put(nextChar2, prevVal2 + 1);
        }

        return frequency1.equals(frequency2);
    }
}