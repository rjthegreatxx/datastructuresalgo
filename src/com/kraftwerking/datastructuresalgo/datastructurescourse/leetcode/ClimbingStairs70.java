package com.kraftwerking.datastructuresalgo.datastructurescourse.leetcode;

import java.util.HashMap;
import java.util.Map;

class ClimbingStairs70 {
  Map<Integer, Integer> dp = new HashMap();
  //dp solution w memoization using hashmap
  public int climbStairs(int n) {
    if(n < 0) return 0;
    if(n == 0) return 1;
    if(dp.containsKey(n)) return dp.get(n);
    int steps = climbStairs(n-1) + climbStairs(n-2);
    dp.put(n, steps);
    return steps;
  }

  public static void main(String[] args) {
    ClimbingStairs70 climbingStairs70 = new ClimbingStairs70();
    int result = climbingStairs70.climbStairs(3);
    System.out.println(result);
  }
}