package com.kraftwerking.datastructuresalgo.datastructurescourse.leetcode;

class NumberOf1Bits191 {
  // you need to treat n as an unsigned value
  public int hammingWeight(int n) {
    int count = 0;
    while(n != 0){
      count = count + (n & 1);
      n = n >>> 1; //right shift with 0s
      //time complexity O(n)
    }

    return count;
  }

  public static void main(String[] args) {
    NumberOf1Bits191 numberOf1Bits191 = new NumberOf1Bits191();
    int result = numberOf1Bits191.hammingWeight(00000000000000000000000000001011);
    System.out.println(result);
  }
}

