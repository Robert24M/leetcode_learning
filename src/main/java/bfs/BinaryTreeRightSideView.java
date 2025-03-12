package bfs;

import datastructures.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> levels = new LinkedList<>();
        levels.add(root);
        while (!levels.isEmpty()) {
            int size = levels.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = levels.poll();
                if (node.left != null) {
                    levels.add(node.left);
                }
                if (node.right != null) {
                    levels.add(node.right);
                }
                if (size - 1 == i) {
                    result.add(node.val);
                }
            }
        }
        return result;
    }
}
