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
                return new int[]{left + 1, right + 1};
            }
        }
        return new int[]{-1, -1};
    }

    public int[] twoSumAgain(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left != right) {
            int current = numbers[right] + numbers[left];
            if (current == target) {
                return new int[]{left + 1, right + 1};
            } else if (target > current) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{0, 0};
    }
}
