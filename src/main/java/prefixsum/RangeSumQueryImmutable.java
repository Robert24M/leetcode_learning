package prefixsum;

public class RangeSumQueryImmutable {

    private final int[] sums;

    public RangeSumQueryImmutable(int[] nums) {
        sums = new int[nums.length];
        calculateSums(nums);
    }

    public int sumRange(int left, int right) {
        return sums[right] - ( left == 0 ? 0 : sums[left - 1]);
    }

    private void calculateSums(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                sums[i] = nums[i];
            } else {
                sums[i] = sums[i - 1] + nums[i];
            }
        }
    }
}
