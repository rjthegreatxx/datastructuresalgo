package com.kraftwerking.datastructuresalgo.leetcode;

class ClimbingStairs70dp {

  public int climbStairs(int n) {
    int one = 1;
    int two = 1;

    for(int i = 0;i < n-1;i++){
      int temp = one;
      one = one + two;
      two = temp;
    }

    return one;
  }

  public static void main(String[] args) {
    ClimbingStairs70dp climbingStairs70 = new ClimbingStairs70dp();
    int result = climbingStairs70.climbStairs(3);
    System.out.println(result);
  }
}