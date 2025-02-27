package bfs;

import bfs.BinaryTreeLevelOrderTraversal.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeLevelOrderTraversalTest {

    @Test
    void testLevelOrder() {
        BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();

        // Tree Structure:
        //      3
        //     / \
        //    9  20
        //       /  \
        //      15   7
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        List<List<Integer>> expected = Arrays.asList(
                List.of(3),
                Arrays.asList(9, 20),
                Arrays.asList(15, 7)
        );

        assertEquals(expected, solution.levelOrder(root));
    }

    @Test
    void testSingleElementTree() {
        BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();
        TreeNode root = new TreeNode(1);
        List<List<Integer>> expected = Collections.singletonList(Collections.singletonList(1));
        assertEquals(expected, solution.levelOrder(root));
    }

    @Test
    void testEmptyTree() {
        BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, solution.levelOrder(null));
    }
}
