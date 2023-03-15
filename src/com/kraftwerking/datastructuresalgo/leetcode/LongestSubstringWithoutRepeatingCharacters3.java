package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.HashSet;
import java.util.Set;

class LongestSubstringWithoutRepeatingCharacters3 {

  public int lengthOfLongestSubstring(String s) {
    if (s.length() <= 1) {return s.length();}
    int res = 0;

    for (int i = 0; i < s.length(); i++) {
      Set<Character> charSet = new HashSet<>();
      charSet.add(s.charAt(i));
      if(i == s.length() - 1){
        res = Math.max(res, 1);
        break;
      }

      int r = i + 1;
      while(r <= s.length()-1 && !charSet.contains(s.charAt(r))){
        charSet.add(s.charAt(r));
        res = Math.max(res, charSet.size());
        r++;
      }
    }

    return res;
  }

  public static void main(String[] args) {
    LongestSubstringWithoutRepeatingCharacters3 longestSubstringWithoutRepeatingCharacters3 = new LongestSubstringWithoutRepeatingCharacters3();
    int result = longestSubstringWithoutRepeatingCharacters3.lengthOfLongestSubstring("abcabcbb");
    System.out.println(result);
  }
}