package com.kraftwerking.datastructuresalgo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementInABST230 {
  private List<Integer> result = new ArrayList<>();

  public int kthSmallest(TreeNode root, int k) {
    inorder(root);
    // System.out.println(result);
    // System.out.println(result.get(k-1));
    return result.get(k-1);
  }

  public void inorder(TreeNode root) {
    if (root == null) {
      return;
    }
    inorder(root.left);
    result.add(root.val);
    inorder(root.right);
  }
}