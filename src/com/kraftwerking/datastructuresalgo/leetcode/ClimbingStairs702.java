package com.kraftwerking.datastructuresalgo.leetcode;

class ClimbingStairs702 {

  public int climbStairs(int n) {
    //o(n) solution w/o memoization
    // base cases
    if (n <= 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    if (n == 2) {
      return 2;
    }
    int one_step_before = 2;
    int two_steps_before = 1;
    int all_ways = 0;

    for (int i = 2; i < n; i++) {
      all_ways = one_step_before + two_steps_before;
      two_steps_before = one_step_before;
      one_step_before = all_ways;
    }
    return all_ways;
  }

  public static void main(String[] args) {
    ClimbingStairs702 climbingStairs70 = new ClimbingStairs702();
    int result = climbingStairs70.climbStairs(3);
    System.out.println(result);
  }
}