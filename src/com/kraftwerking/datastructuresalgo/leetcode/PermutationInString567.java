package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.HashMap;
import java.util.Map;

class PermutationInString567 {
  public boolean checkInclusion(String s1, String s2) {
    boolean res = false;
    Map<Character, Integer> charCountsOrig = new HashMap<>();

    for(int i = 0;i<s1.length();i++){
      charCountsOrig.put(s1.charAt(i), charCountsOrig.getOrDefault(s1.charAt(i), 0) + 1);
    }

    for(int l = 0;l<s2.length();l++){
      Map<Character, Integer> charCounts= new HashMap<Character,Integer>(charCountsOrig);
      if(!charCounts.containsKey(s2.charAt(l))) {
        continue;
      }

      int r = l;
      while(r - l + 1 <= s1.length() &&  r < s2.length()){
        if(!charCounts.containsKey(s2.charAt(r)) || charCounts.get(s2.charAt(r)) < 0) {
          break;
        }
        if(charCounts.containsKey(s2.charAt(r))) {
          charCounts.put(s2.charAt(r), charCounts.get(s2.charAt(r)) - 1);
        }
        r++;
      }

      int charCountsSum = charCounts.values().stream().mapToInt(Integer::intValue).sum();
      if(charCountsSum == 0) {
        res = true;
        break;
      }
    }

    return res;
  }

  public static void main(String[] args) {
    PermutationInString567 permutationInString567 = new PermutationInString567();
    boolean result = permutationInString567.checkInclusion("hello", "ooolleoooleh");
    System.out.println(result);
  }
}