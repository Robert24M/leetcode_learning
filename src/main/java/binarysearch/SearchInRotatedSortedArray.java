package binarysearch;

// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {

        // start with one pointer at the beginning of the array and one at the end
        int leftPointer = 0, rightPointer = nums.length - 1;
        while (leftPointer <= rightPointer) {   // break when the pointers overlay
            int middlePointer = (leftPointer + rightPointer) / 2;
            int middleNumber = nums[middlePointer];
            int leftNumber = nums[leftPointer];
            int rightNumber = nums[rightPointer];

            if (middleNumber == target) {
                return middlePointer;
            } else if (middleNumber >= leftNumber) {    // If the middle is bigger or equals with left pointer
                if (leftNumber <= target && target < middleNumber) {    // if target is between left and middle we know
                    rightPointer = middlePointer - 1;                   // the target is in this sorted partition
                } else {                                                // else it's in the other not necessary sorted
                    leftPointer = middlePointer + 1;                    // partition
                }
            } else {                                    // If middle is smaller than right
                if (middleNumber < target && target >= rightNumber) {   // if target is between middle and right
                    leftPointer = middlePointer + 1;                    // the target is in this sorted partition
                } else {                                                // else it's in the other ont necessary sorted
                    rightPointer = middlePointer - 1;                   // partition
                }
            }
        }
        return -1;
    }
}
