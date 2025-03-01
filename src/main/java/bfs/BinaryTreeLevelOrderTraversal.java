package bfs;

import datastructures.TreeNode;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> levelOrder = new ArrayList<>();
        if (root == null) {
            return levelOrder;
        }

        Queue<TreeNode> levelNodes = new ArrayDeque<>();
        levelNodes.add(root);

        while (!levelNodes.isEmpty()) {
            int size = levelNodes.size();
            List<Integer> levelValues = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = levelNodes.poll();
                levelValues.add(node.val);
                if (node.left != null) {
                    levelNodes.add(node.left);
                }
                if (node.right != null) {
                    levelNodes.add(node.right);
                }
            }
            levelOrder.add(levelValues);
        }
        return levelOrder;
    }
}
