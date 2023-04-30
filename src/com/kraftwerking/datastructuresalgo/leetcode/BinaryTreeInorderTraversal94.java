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
    return res;
  }

  List<Integer> res = new ArrayList<>();

  public List<Integer> inorderTraversal2(TreeNode root) {
    root = inOrder(root);
    return res;
  }

  TreeNode inOrder(TreeNode root){
    if(root == null) {
      return null;
    }

    inOrder(root.left);
    //System.out.println(root.val);
    res.add(root.val);
    inOrder(root.right);
    return root;
  }

}