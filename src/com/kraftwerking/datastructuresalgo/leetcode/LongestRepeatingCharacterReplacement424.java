package com.kraftwerking.datastructuresalgo.leetcode;

import java.util.HashSet;

class LongestRepeatingCharacterReplacement424 {
  public int characterReplacement(String s, int k) {
    int res = 0;
    HashSet<Character> charSet = new HashSet<>();
    for (char c : s.toCharArray()) {
      charSet.add(c);
    }

        for (char c : charSet) {
          int count = 0, l = 0;
          for (int r = 0; r < s.length(); r++) {
            if (s.charAt(r) == c) {
              count++;
            }

                while ((r - l + 1) - count > k) {
                  if (s.charAt(l) == c) {
                    count--;
                  }
                    l++;
                  }

                  res = Math.max(res, r - l + 1);
                }
              }
              return res;
            }

  public static void main(String[] args) {
    LongestRepeatingCharacterReplacement424 longestRepeatingCharacterReplacement424 = new LongestRepeatingCharacterReplacement424();
    int result = longestRepeatingCharacterReplacement424.characterReplacement("ABAB", 2);
    System.out.println(result);
  }
}