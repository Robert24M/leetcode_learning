package array;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

    public int subarraySum(int[] nums, int k) {
        int result = 0;
        int currentSum = 0;
        Map<Integer, Integer> sumOccurrence = new HashMap<>();
        sumOccurrence.put(0, 1); // in case of first prefix sum is = k
        for (int num : nums) {
            currentSum += num;
            int complement = currentSum - k;
            if (sumOccurrence.containsKey(complement)) {
                result += sumOccurrence.get(complement);
            }
            sumOccurrence.put(currentSum, sumOccurrence.getOrDefault(currentSum, 0) + 1);
        }
        return result;
    }
}
