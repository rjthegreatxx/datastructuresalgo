package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram242 {
      public boolean isAnagram(String s, String t) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String ss = new String(charArray);
        charArray = t.toCharArray();
        Arrays.sort(charArray);
        String st = new String(charArray);
        if(ss.equals(st)) return true;
        return false;
        
    }

  public static void main(String[] args) {
    ValidAnagram242 validAnagram242 = new ValidAnagram242();
    boolean result = validAnagram242.isAnagram("anagram", "nagaram");
    System.out.println(result);

  }
}