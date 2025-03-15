package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seenNumber = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            Integer complement = seenNumber.get(target - currentNum);
            if (complement != null) {
                return new int[]{i, complement};
            }
            seenNumber.put(currentNum, i);
        }
        return null;
    }
}
