package com.kraftwerking.datastructuresalgo.leetcode;

class ClimbingStairs702 {

  public int climbStairs(int n) {
    return dfs(n, 0); 
}

public int dfs(int n, int i) {
    if (i >= n) return i == n ? 1 : 0;
    return dfs(n, i + 1) + dfs(n, i + 2);
}

  public static void main(String[] args) {
    ClimbingStairs702 climbingStairs70 = new ClimbingStairs702();
    int result = climbingStairs70.climbStairs(3);
    System.out.println(result);
  }
}