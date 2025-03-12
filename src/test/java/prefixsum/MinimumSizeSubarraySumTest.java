package prefixsum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumSizeSubarraySumTest {

    @Test
    void testSmallArray() {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        assertEquals(2, new MinimumSizeSubarraySum().minSubArraySum(target, nums));
    }

    @Test
    void testSingleElementValid() {
        int[] nums = {7};
        int target = 7;
        assertEquals(1, new MinimumSizeSubarraySum().minSubArraySum(target, nums));
    }

    @Test
    void testNoValidSubarray() {
        int[] nums = {1, 1, 1, 1};
        int target = 10;
        assertEquals(0, new MinimumSizeSubarraySum().minSubArraySum(target, nums));
    }

    @Test
    void testLargeInput() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 15;
        assertEquals(2, new MinimumSizeSubarraySum().minSubArraySum(target, nums));
    }
}
