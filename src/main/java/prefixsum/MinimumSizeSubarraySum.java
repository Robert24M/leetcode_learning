package prefixsum;

public class MinimumSizeSubarraySum {

    public int minSubArraySum(int target, int[] nums) {

        int[] prefixSum = new int[nums.length + 1];
        int result = Integer.MAX_VALUE;

        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = nums[i - 1] + prefixSum[i - 1];
            if (prefixSum[i] < target) {
                continue;
            }
            int left = 0;
            int right = i - 1;
            while (left <= right) {
                int middle = (left + right) / 2;
                if (prefixSum[i] - prefixSum[middle] >= target) {
                    result = Math.min(result, i - middle);
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
