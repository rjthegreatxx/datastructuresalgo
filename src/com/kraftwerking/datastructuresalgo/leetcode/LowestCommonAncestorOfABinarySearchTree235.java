package com.kraftwerking.datastructuresalgo.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class LowestCommonAncestorOfABinarySearchTree235 {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    // If the root is null, then there is no LCA, so return null.
    if(root == null){
      return root;
    }

    // Get the value of the current node.
    int cur = root.val;

    // If both p and q are greater than the current node, then the LCA is in the right subtree.
    if(cur < p.val && cur < q.val){
      return lowestCommonAncestor(root.right, p, q); // Recurse on the right subtree.
    }
    // If both p and q are less than the current node, then the LCA is in the left subtree.
    if(cur > p.val && cur > q.val){
      return lowestCommonAncestor(root.left, p, q); // Recurse on the left subtree.
    }
    // Otherwise, the current node is the LCA.
    return root;
  }
  public TreeNode printTree(TreeNode root) {
    Deque<TreeNode> queue = new ArrayDeque<>();
    queue.add(root);
    int level = 0;

    while(!queue.isEmpty()){
      int levelLen = queue.size();
      System.out.println("level " + level + ": ");

      for(int i = 0;i<levelLen;i++){
        TreeNode curr = queue.removeFirst();

        if(curr.left != null){
          queue.add(curr.left);
        }
        System.out.print(curr.val + " ");

        if(curr.right != null){
          queue.add(curr.right);
        }
      }
      level++;
      System.out.println("");

    }

    return root;
  }
}
