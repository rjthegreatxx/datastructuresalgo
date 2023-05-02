package com.kraftwerking.datastructuresalgo.leetcode;

public class BalancedBinaryTree110 {
  boolean result = true;

  public boolean isBalanced(TreeNode root) {
    dfs(root);
    return result;

  }

  private int dfs(TreeNode current) {
    if (current == null) {
      return -1;
    }

    //get the height of left and right
    int left = 1 + dfs(current.left);
    int right = 1 + dfs(current.right);

    //is balanced?
    int diff = Math.abs(left - right);
    if(diff > 1) {
      System.out.println(left);
      System.out.println(right);
      result = false;
    }
    return Math.max(left, right);
  }
}
