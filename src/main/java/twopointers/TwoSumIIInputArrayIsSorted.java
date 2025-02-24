package twopointers;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
public class TwoSumIIInputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {

        int left = 0, right = numbers.length - 1;       // start with a pointer from the start of the array and with another from the end
        while (left != right) {                         // while the pointers do not intersect
            if (numbers[left] + numbers[right] < target) {
                left++;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                return new int[] { left + 1, right + 1 };
            }
        }
        return new int[]{-1,-1};
    }
}
