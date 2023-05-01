package com.kraftwerking.datastructuresalgo.leetcode;

// Definiton of TreeNode in Java
/*
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
*/

public class DiameterOfBinaryTree543 {
    int result = -1;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return result;
    }
    private int dfs(TreeNode current) {
        if (current == null) {
            return -1;
        }
        int left = 1 + dfs(current.left);
        int right = 1 + dfs(current.right);
        result = Math.max(result, (left + right));
        return Math.max(left, right);
    }

}
