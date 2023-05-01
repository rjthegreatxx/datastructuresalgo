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
        if(root == null){
            return new ArrayList<>();
        }

        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()){
            System.out.println("processing level " + level);
            List<Integer> curList = new ArrayList<>();

            int queueSz = queue.size();
            for(int i = 0;i<queueSz;i++){
                TreeNode cur = queue.removeFirst();
                curList.add(cur.val);
                if(cur.left != null){
                    queue.add(cur.left);

                }
                if(cur.right != null){
                    queue.add(cur.right);
                }
            }
            res.add(curList);
            level++;
        }
        return res;
    }
}
