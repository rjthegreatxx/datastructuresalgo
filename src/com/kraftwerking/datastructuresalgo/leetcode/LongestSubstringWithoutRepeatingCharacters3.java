package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.HashSet;
import java.util.Set;

class LongestSubstringWithoutRepeatingCharacters3 {

  public int lengthOfLongestSubstring(String s) {
    if (s.length() <= 1) {return s.length();}
    int res = 0;

    for(int i = 0;i<s.length();i++){
      Set<Character> charSet = new HashSet<>();
      charSet.add(s.charAt(i));
      int r = i + 1;

      while(r < s.length() && !charSet.contains(s.charAt(r))){
       charSet.add(s.charAt(r));
        r++;
      }
      res = Math.max(res, charSet.size());

    }

    return res;
  }

  public static void main(String[] args) {
    LongestSubstringWithoutRepeatingCharacters3 longestSubstringWithoutRepeatingCharacters3 = new LongestSubstringWithoutRepeatingCharacters3();
    int result = longestSubstringWithoutRepeatingCharacters3.lengthOfLongestSubstring("pwwkew");
    System.out.println(result);
  }
}