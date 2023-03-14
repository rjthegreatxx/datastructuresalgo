package com.kraftwerking.datastructuresalgo.leetcode;

import java.util.*;

class HappyNumber202 {
  public boolean isHappy(int n) {
    if (n < 10) return false;
    List<Integer> digits = new ArrayList<Integer>();
    Set<Integer> seen = new HashSet<>();
    digits = getDigits(n);

    Collections.reverse(digits);
    int num = getSumOfSquares(digits);
    int lastNum = num;
    while(num != 1){
      num = getSumOfSquares(getDigits(num));
      if(lastNum == num) return false;
      lastNum = num;
    }
    return true;
  }

  private List<Integer> getDigits(int n) {
    List<Integer> d = new ArrayList<Integer>();
    while (n > 0) {
      d.add(n%10);
      n/=10;
    }
    return d;
  }

  private int getSumOfSquares(List<Integer> digits) {
    int sum = 0;
    for(int i:digits){
      sum += i * i;
    }
    return sum;
  }

  public static void main(String[] args) {
    HappyNumber202 happyNumber202 = new HappyNumber202();
    boolean result = happyNumber202.isHappy(19);
    System.out.println(result);
  }
}

