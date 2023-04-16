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
        while(!queue.isEmpty()){
            int levelLen = queue.size();
            System.out.println("level " + level + ":");
            List<Integer> currList = new ArrayList<>();

            for(int i = 0;i < levelLen;i++){
                TreeNode curr = queue.removeFirst();
                System.out.print(curr.val + " ");

                if(curr.left != null){
                    currList.add(curr.left.val);
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    currList.add(curr.right.val);
                    queue.add(curr.right);
                }
            }
            if(!currList.isEmpty()) res.add(currList.get(currList.size() - 1));
            level++;
            System.out.println();


        }
        return res;
    }
}
