package dfs;

import datastructures.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PathSumTest {

    @Test
    public void hasPathSum() {
        TreeNode tree = new TreeNode(5);
        tree.left = new TreeNode(4);
        tree.right = new TreeNode(8);
        tree.left.left = new TreeNode(11);
        tree.right.left = new TreeNode(13);
        tree.right.right = new TreeNode(4);
        tree.left.left.left = new TreeNode(7);
        tree.left.left.right = new TreeNode(2);
        tree.right.right.right = new TreeNode(1);

        assertTrue(new PathSum().hasPathSum(tree, 22));
    }
}
