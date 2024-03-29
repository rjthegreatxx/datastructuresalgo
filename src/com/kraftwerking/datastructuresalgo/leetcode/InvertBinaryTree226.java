package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.ArrayDeque;
import java.util.Deque;

public class InvertBinaryTree226 {
  public TreeNode invertTree(TreeNode root) {
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

        TreeNode tmp = curr.left;
        curr.left = curr.right;
        curr.right = tmp;

      }
      level++;
      System.out.println();
    }
    return root;

  }

  public static void main(String[] args) {
    InvertBinaryTree226 invertBinaryTree226 = new InvertBinaryTree226();

  }
}