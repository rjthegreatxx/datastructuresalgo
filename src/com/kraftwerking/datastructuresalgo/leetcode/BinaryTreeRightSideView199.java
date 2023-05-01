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
        if (root == null) {
            return new ArrayList<>();
        }

        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()){
            int queueSz = queue.size();
            System.out.println("processing level " + level);
            List<Integer> tmpList = new ArrayList<>();

            for(int i = 0;i<queueSz;i++){
                TreeNode cur = queue.removeFirst();
                System.out.println(cur.val);
                tmpList.add(cur.val);
                if(cur.left != null){
                    queue.add(cur.left);
                }
                if(cur.right != null){
                    queue.add(cur.right);
                }
            }
            System.out.println(tmpList);
            res.add(tmpList.get(tmpList.size()-1));

            level++;
        }

        return res;
    }
}
