package dfs;

import dfs.MaximumDepthOfBinaryTree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumDepthOfBinaryTreeTest {

    private TreeNode createTree(Integer[] values, int index) {
        if (index >= values.length || values[index] == null) {
            return null;
        }
        TreeNode node = new TreeNode(values[index]);
        node.left = createTree(values, 2 * index + 1);
        node.right = createTree(values, 2 * index + 2);
        return node;
    }

    @Test
    public void testMaxDepth() {

        MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();

        Integer[] values1 = {1, 2, 3, 4, 5, 6, 7};
        TreeNode root1 = createTree(values1, 0);
        assertEquals(3, solution.maxDepth(root1));

        TreeNode root2 = null;
        assertEquals(0, solution.maxDepth(root2));

        Integer[] values3 = {1, 2, null, 3, null};
        TreeNode root3 = createTree(values3, 0);
        assertEquals(3, solution.maxDepth(root3));

        Integer[] values5 = {1, 2, 3, 4, 5, 6, 7, 8};
        TreeNode root5 = createTree(values5, 0);
        assertEquals(4, solution.maxDepth(root5));

        Integer[] values6 = {1};
        TreeNode root6 = createTree(values6, 0);
        assertEquals(1, solution.maxDepth(root6));

    }
}
