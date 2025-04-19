package slidingwindow;

public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int solution = Integer.MAX_VALUE;
        while (right < nums.length) {
            sum += nums[right++];
            while (sum >= target) {
                solution = Math.min(solution, right - left);
                sum -= nums[left++];
            }
        }
        return solution == Integer.MAX_VALUE ? 0 : solution;
    }
}
