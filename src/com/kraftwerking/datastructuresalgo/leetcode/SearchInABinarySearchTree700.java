package com.kraftwerking.datastructuresalgo.leetcode;


public class SearchInABinarySearchTree700 {
  public TreeNode searchBST(TreeNode root, int val) {
    if (root == null) {
      return null;
    }

    if(val < root.val){
      root = searchBST(root.left, val);
    } else if(val > root.val){
      root = searchBST(root.right, val);
    }
    return root;

  }

  public static void main(String[] args) {
    SearchInABinarySearchTree700 searchInABinarySearchTree700 = new SearchInABinarySearchTree700();

  }
}