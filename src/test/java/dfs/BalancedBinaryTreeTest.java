package dfs;

import datastructures.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BalancedBinaryTreeTest {

    @Test
    public void isBalancedTest() {
        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(9);
        tree.right = new TreeNode(20);
        tree.right.left = new TreeNode(15);
        tree.right.right = new TreeNode(7);
        assertTrue(balancedBinaryTree.isBalanced(tree));
    }
}
