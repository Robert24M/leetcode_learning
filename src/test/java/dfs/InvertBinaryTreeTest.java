package dfs;

import datastructures.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvertBinaryTreeTest {

    @Test
    public void testInvertTree() {

        TreeNode tree = new TreeNode(4, new TreeNode(2), new TreeNode(7));
        tree.left.left = new TreeNode(1);
        tree.left.right = new TreeNode(3);
        tree.right.left = new TreeNode(6);
        tree.right.right = new TreeNode(9);
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        tree = invertBinaryTree.invertTree(tree);
        assertEquals(4, tree.val);
        assertEquals(7, tree.left.val);
        assertEquals(2, tree.right.val);
        assertEquals(9, tree.left.left.val);
        assertEquals(6, tree.left.right.val);
        assertEquals(3, tree.right.left.val);
        assertEquals(1, tree.right.right.val);
    }
}
