package com.kraftwerking.datastructuresalgo.leetcode;


public class ValidPalindrome125 {
  public boolean isPalindrome(String s) {
    int l = 0, r = s.length() - 1;

    while (l < r) {
        while (l < r && !Character.isLetterOrDigit(Character.toLowerCase(s.charAt(l)))) {
            l++;
        }
        while (r > l && !Character.isLetterOrDigit(Character.toLowerCase(s.charAt(r)))) {
            r--;
        }
        if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
            return false;
        }
        l++; r--;
    }
    return true;
  }

  public static void main(String[] args) {
    ValidPalindrome125 validPalindrom125 = new ValidPalindrome125();
    boolean result = validPalindrom125.isPalindrome(" ");
    System.out.println(result);

  }
}