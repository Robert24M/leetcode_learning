package bfs;

import datastructures.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeRightSizeViewTest {

    @Test
    public void rightSideView() {
        BinaryTreeRightSideView solution = new BinaryTreeRightSideView();
        TreeNode tree = new TreeNode(1, new TreeNode(2, null, new TreeNode(5)), new TreeNode(3, null, new TreeNode(4)));
        assertEquals(Arrays.asList(1,3,4), solution.rightSideView(tree));
    }
}
