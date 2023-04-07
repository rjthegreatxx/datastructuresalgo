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

public class BinaryTreeRightSideView199 {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<TreeNode>();
        if (root != null) {
            queue.add(root);
            res.add(root.val);
        }
        int level = 0;
        while(!queue.isEmpty()) {
            List<Integer> currList = new ArrayList<>();
            System.out.print("level " + level + ": ");
            int levelLength = queue.size();
            for (int i = 0; i < levelLength; i++) {
                TreeNode curr = queue.removeFirst();
                System.out.print(curr.val + " ");
                if(curr.left != null) {
                    queue.add(curr.left);
                    currList.add(curr.left.val);
                }
                if(curr.right != null) {
                    queue.add(curr.right);
                    currList.add(curr.right.val);
                }
            }
            level++;
            if(currList.size() > 0) res.add(currList.get(currList.size() - 1));
            System.out.println();
        }
        return res;
    }
}
