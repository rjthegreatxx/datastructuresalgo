package com.kraftwerking.datastructuresalgo.leetcode;


public class ValidPalindrom125 {
  public boolean isPalindrome(String s) {
    s = s.replaceAll(
            "[^a-zA-Z0-9]", "");
    s = s.toLowerCase();

    int start = 0;
    int end = s.length() - 1;

    while(start <= end){
      if(s.charAt(start) != s.charAt(end)) return false;
      start++;
      end--;
    }

    return true;
  }

  public static void main(String[] args) {
    ValidPalindrom125 validPalindrom125 = new ValidPalindrom125();
    boolean result = validPalindrom125.isPalindrome(" ");
    System.out.println(result);

  }
}