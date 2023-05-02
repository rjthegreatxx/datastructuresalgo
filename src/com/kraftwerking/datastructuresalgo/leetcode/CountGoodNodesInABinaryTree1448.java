package com.kraftwerking.datastructuresalgo.leetcode;

public class CountGoodNodesInABinaryTree1448 {
  /**
   The idea is to do DFS, in each call check the max of current node val and max value till now is less than or equal to current node val
   if yes, increse the good nodes number and send the max of current node and max value till now in left and right side.

   Time complexity: O(n)
   Space complexity: O(h), h is tree height, considering the recursion stack.
   */

  int goodNodesVal = 0;

  public int goodNodes(TreeNode root) {
    getGoodNodesVal(root, root.val);

    return goodNodesVal;
  }

  private void getGoodNodesVal(TreeNode root, int ma) {
    if(root == null){
      return;
    }

    int max = Math.max(root.val, ma);
    if(max <= root.val) goodNodesVal++;

    System.out.println(root.val);
    getGoodNodesVal(root.left, max);
    getGoodNodesVal(root.right, max);
  }

}