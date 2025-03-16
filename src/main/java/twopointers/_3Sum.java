package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3Sum {

    public List<List<Integer>> treeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int target = nums[left] + nums[right] + nums[i];
                if (target < 0) {
                    left++;
                } else if (target > 0) {
                    right--;
                } else {
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    do {
                        left++;
                    } while (nums[left] == nums[left - 1] && left < right);
                }
            }
        }
        return result;
    }
}
