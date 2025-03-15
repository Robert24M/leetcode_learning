package array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicatesUsingInterval(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num < min || num > max) {
                min = Math.min(min, num);
                max = Math.max(max, num);
                continue;
            }

            for (int j = 0; j < i; j++) {
                if (num == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
