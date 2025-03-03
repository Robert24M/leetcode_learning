package backtracking;

import java.util.ArrayList;
import java.util.List;

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
}
