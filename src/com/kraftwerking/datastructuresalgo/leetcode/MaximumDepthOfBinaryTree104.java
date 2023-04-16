package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumDepthOfBinaryTree104 {
  public int maxDepth(TreeNode root) {
    Deque<TreeNode> queue = new ArrayDeque<TreeNode>();
    if (root != null) {
      queue.add(root);
    }

    int level = 0;
    while(!queue.isEmpty()) {
      System.out.print("level " + level + ": ");
      int levelLength = queue.size();
      for (int i = 0; i < levelLength; i++) {
        TreeNode curr = queue.removeFirst();
        System.out.print(curr.val + " ");
        if(curr.right != null) {
          queue.add(curr.right);
        }
        if(curr.left != null) {
          queue.add(curr.left);
        }
      }
      level++;
      System.out.println();
    }
    return level;

  }

  public static void main(String[] args) {
    MaximumDepthOfBinaryTree104 maximumDepthOfBinaryTree104 = new MaximumDepthOfBinaryTree104();

  }
}