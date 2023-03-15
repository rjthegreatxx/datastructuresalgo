package com.kraftwerking.datastructuresalgo.leetcode;


public class ValidPalindrom125 {
  public boolean isPalindrome(String s) {
    s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    int l = 0;
    int r = s.length() - 1;

    while(l<=r){
      if(s.charAt(l) == s.charAt(r)){
        l++;
        r--;
      } else {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    ValidPalindrom125 validPalindrom125 = new ValidPalindrom125();
    boolean result = validPalindrom125.isPalindrome(" ");
    System.out.println(result);

  }
}