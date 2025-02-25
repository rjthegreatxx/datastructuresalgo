package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.HashSet;
import java.util.Set;

class LongestSubstringWithoutRepeatingCharacters3 {

  public int lengthOfLongestSubstring(String s) {
    if (s.length() <= 1) {return s.length();}
    int res = 0;

    for (int l = 0; l < s.length() - 1; l++) {
      Set<String > charSet = new HashSet<>();
      charSet.add(String.valueOf(s.charAt(l)));

      int r = l + 1;
      int len = 1;
      while(r<s.length()){
        if(!charSet.contains(String.valueOf(s.charAt(r)))){
          charSet.add(String.valueOf(s.charAt(r)));
          len++;
          r++;
        } else {
          break;
        }
      }
      res = Math.max(res, len);
    }

    return res;
  }

  public static void main(String[] args) {
    LongestSubstringWithoutRepeatingCharacters3 longestSubstringWithoutRepeatingCharacters3 = new LongestSubstringWithoutRepeatingCharacters3();
    int result = longestSubstringWithoutRepeatingCharacters3.lengthOfLongestSubstring("pwwkew");
    System.out.println(result);
  }
}