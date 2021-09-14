package com.kraftwerking.datastructuresalgo.datastructurescourse;

public class DepthFirstSearch {
    TreeNode root;

    public DepthFirstSearch() {
        root = null;
    }

    /*
    1
    / \
    2 3
    / \
    4 5 */
    void printLevelOrder() {
        int h = getTotalLevel(root);
        int i;
        for (i = 0; i < h; i++)
            printGivenLevel(root, i);
    }

    public int getTotalLevel(TreeNode TreeNode) {
        if (TreeNode == null) {
            return 0;
        } else {
            return 1 +
                    Math.max(getTotalLevel(TreeNode.left), getTotalLevel(TreeNode.right));
        }
    }

    /*
    1
    / \
    2 3
    / \
    4 5 */
    void printGivenLevel(TreeNode root, int level) {
        if (root == null)
            return;
        if (level == 0)
            System.out.print(root.key + " ");
        else if (level > 0) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }

    /*
    1
    / \
    2 3
    / \ / \
    4 5 6 7 */
    void preOrder() {
        preOrderHelper(root);
    }

    // 1 2 4 5 3 6 7
    void preOrderHelper(TreeNode root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preOrderHelper(root.left);
            preOrderHelper(root.right);
        }
    }

    /*
    1
    / \
    2 3
    / \ / \
    4 5 6 7 */
    void inorder() {
        inorderHelper(root);
    }

    void inorderHelper(TreeNode root) {
        if (root != null) {
            inorderHelper(root.left);
            System.out.print(root.key + " ");
            inorderHelper(root.right);
        }
    }

    /*
    1
    / \
    2 3
    / \ / \
    4 5 6 7 */
    void postOrder() {
        postOrderHelper(root);
    }

    void postOrderHelper(TreeNode root) {
        if (root != null) {
            postOrderHelper(root.left);
            postOrderHelper(root.right);
            System.out.print(root.key + " ");
        }
    }

    public static void main(String[] args) {
 /*
 1
 / \
 2 3
 / \ / \
 4 5 6 7 */
        DepthFirstSearch tree = new DepthFirstSearch();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);

        System.out.println("DFS Pre-Order traversal of tree is(Root --> Left --> Right) ");
        tree.preOrder();
        System.out.println();
        System.out.println("DFS In-Order traversal of tree is (Left --> Root --> Right) ");
        tree.inorder();
        System.out.println();
        System.out.println("DFS Post-Order traversal of tree is (Left --> Right --> Root) ");
        tree.postOrder();
    }
}