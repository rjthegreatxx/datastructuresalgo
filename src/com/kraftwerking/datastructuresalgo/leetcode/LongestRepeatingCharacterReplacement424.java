package com.kraftwerking.datastructuresalgo.leetcode;

import java.util.HashMap;
import java.util.Map;

class LongestRepeatingCharacterReplacement424 {

  public int characterReplacement(String s, int k) {
    Map<Character, Integer> count = new HashMap<>();
    int res = 0;
    int l = 0;
    int maxVal = 0;

    for(int r = 0;r<s.length();r++){
      count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0) + 1);
      maxVal = Math.max(maxVal,count.get(s.charAt(r)));

      while((r - l + 1 - maxVal) > k){
        count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
        l++;
      }
      res = Math.max(res, r - l + 1);

    }
    return res;
    }

  public static void main(String[] args) {
    LongestRepeatingCharacterReplacement424 longestRepeatingCharacterReplacement424 = new LongestRepeatingCharacterReplacement424();
    int result = longestRepeatingCharacterReplacement424.characterReplacement("ABAB", 2);
    System.out.println(result);
  }
}