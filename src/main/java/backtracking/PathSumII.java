package backtracking;

import datastructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> result = new ArrayList<>();
        pathSum(result, new ArrayList<>(), root, targetSum);
        return result;
    }

    private void pathSum(List<List<Integer>> result, List<Integer> currentPath, TreeNode root, int targetSum) {

//        if (targetSum < 0) { // Not covering cases where target < 0 from the start
//            return;
//        }
        if (root == null) {      // base case
            return;
        }
        currentPath.add(root.val);  // add the current value to the currentPath
        if (targetSum - root.val == 0 && root.left == null && root.right == null) { // if the target is reached with the current value
            result.add(new ArrayList<>(currentPath));                               // and this node is a leaf add the path to the result
        } else {
            pathSum(result, currentPath, root.left, targetSum - root.val);  // continue to travers the tree
            pathSum(result, currentPath, root.right, targetSum - root.val);

        }
        currentPath.removeLast();          // remove current element after the recursive calls ended finishes
    }
}
