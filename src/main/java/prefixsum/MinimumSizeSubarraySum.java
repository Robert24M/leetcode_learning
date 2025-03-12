package prefixsum;

public class MinimumSizeSubarraySum {

    public int minSubArraySum(int target, int[] nums) {

        int[] prefixSum = new int[nums.length];
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            prefixSum[i] = i == 0 ? nums[i] : prefixSum[i - 1] + nums[i];
            int left = 0;
            int right = prefixSum.length - 1;
            int currentTarget = target - prefixSum[i];
            while (left < right) {
                int middle = (left + right) / 2;
                if (currentTarget == prefixSum[middle]) {
                    result = Math.min(result, i - middle);
                    break;
                } else if (currentTarget > prefixSum[middle]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
