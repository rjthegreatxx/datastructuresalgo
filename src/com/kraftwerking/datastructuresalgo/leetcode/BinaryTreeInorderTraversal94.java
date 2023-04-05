package com.kraftwerking.datastructuresalgo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal94 {
  private List<Integer> result = new ArrayList<>();

  public List<Integer> inorderTraversal(TreeNode root) {
    inorder(root);
    return result;
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