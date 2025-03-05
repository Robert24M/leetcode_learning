package backtracking;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used, result, new ArrayList<>());
        return result;
    }

    private void backtrack(int[] nums, boolean[] used, List<List<Integer>> result, List<Integer> currentPermutation) {
        if (currentPermutation.size() == nums.length) {
            result.add(new ArrayList<>(currentPermutation));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }

            used[i] = true;
            currentPermutation.add(nums[i]);

            backtrack(nums, used, result, currentPermutation);

            used[i] = false;
            currentPermutation.removeLast();
        }
    }

    // todo: develop a non recursive solution

    public List<List<Integer>> permuteNoRecursion(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<List<Integer>> permutations = new ArrayDeque<>();
        permutations.add(new ArrayList<>());

        for (int num : nums) {
            int size = permutations.size();
            while (size-- > 0) {
                List<Integer> currentPermutation = permutations.poll();
                for (int i = 0; i <= currentPermutation.size(); i++) {
                    List<Integer> newPermutation = new ArrayList<>(currentPermutation);
                    newPermutation.add(i,num);          // add method will push the existing element to the right, will not override it
                    if (newPermutation.size() == nums.length) {
                        result.add(newPermutation);
                    } else {
                        permutations.add(newPermutation);
                    }
                }
            }
        }
        return result;
    }
}
