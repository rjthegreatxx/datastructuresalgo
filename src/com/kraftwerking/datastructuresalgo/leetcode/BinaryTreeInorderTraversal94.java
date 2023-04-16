package com.kraftwerking.datastructuresalgo.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal94 {

  public List<Integer> inorderTraversal(TreeNode root) {
    //iterative
    List<Integer> res = new ArrayList<>();
    if(root == null) return res;

    Stack<TreeNode> stack = new Stack<>();
    TreeNode node = root;
    while(!stack.isEmpty() || node != null) {
      if(node != null) {
        stack.push(node);
        node = node.left;
      } else {
        node = stack.pop();
        res.add(node.val);
        node = node.right;
      }
    }

    return res;
  }

  private List<Integer> result = new ArrayList<>();

  public List<Integer> inorderTraversal2(TreeNode root) {
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