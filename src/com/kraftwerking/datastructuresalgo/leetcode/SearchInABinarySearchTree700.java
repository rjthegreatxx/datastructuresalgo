package com.kraftwerking.datastructuresalgo.leetcode;


public class SearchInABinarySearchTree700 {
  public TreeNode searchBST(TreeNode root, int val) {
    if (root == null) {
      return null;
    }

    if(val > root.val){
      return searchBST(root.right, val);
    } else if(val < root.val){
      return searchBST(root.left, val);
    } else {
      return root;
    }
  }

  public static void main(String[] args) {
    SearchInABinarySearchTree700 searchInABinarySearchTree700 = new SearchInABinarySearchTree700();

  }
}