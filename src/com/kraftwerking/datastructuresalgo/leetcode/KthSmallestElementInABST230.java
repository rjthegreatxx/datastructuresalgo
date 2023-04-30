package com.kraftwerking.datastructuresalgo.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class KthSmallestElementInABST230 {

  public int kthSmallest(TreeNode root, int k) {
    List<Integer> res = new ArrayList<>();
    if(root == null) return -1;

    java.util.Stack<TreeNode> stack = new Stack<>();
    TreeNode node = root;
    while(!stack.isEmpty() || node != null){
      if(node != null){
        stack.push(node);
        node = node.left;
      } else {
        node = stack.pop();
        res.add(node.val);
        node = node.right;
      }

    }

    System.out.println(res);
    return res.get(k-1);
  }

//  private List<Integer> result = new ArrayList<>();
//
//  public int kthSmallest(TreeNode root, int k) {
//    inorder(root);
//    // System.out.println(result);
//    // System.out.println(result.get(k-1));
//    return result.get(k-1);
//  }
//
//  public void inorder(TreeNode root) {
//    if (root == null) {
//      return;
//    }
//    inorder(root.left);
//    result.add(root.val);
//    inorder(root.right);
//  }
}