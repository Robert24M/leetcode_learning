package dfs;

import datastructures.TreeNode;

public class BalancedBinaryTree {

    //    A height-balanced binary tree is a binary tree
    //    in which the depth of the two subtrees of every node never differs by more than one.
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        if (left == -1 || right == -1) {
            return -1;
        }
        if (Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right);
    }
}
