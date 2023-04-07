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

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreeLevelOrderTraversal102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<TreeNode>();
        if (root != null) {
            queue.add(root);
        }
        int level = 0;
        while(!queue.isEmpty()) {
            System.out.print("level " + level + ": ");
            int levelLength = queue.size();
            List<Integer> currList = new ArrayList<>();
            for (int i = 0; i < levelLength; i++) {
                TreeNode curr = queue.removeFirst();
                System.out.print(curr.val + " ");
                currList.add(curr.val);

                if(curr.left != null) {
                    queue.add(curr.left);
                }
                if(curr.right != null) {
                    queue.add(curr.right);
                }
            }
            res.add(currList);
            level++;
            System.out.println();
        }
        return res;
    }
}
