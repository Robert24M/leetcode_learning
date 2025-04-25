package array;

public class ProductOfArrayExceptSelf {

    // first solution no improvements
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = 1;
        int[] suffix = new int[nums.length];
        suffix[suffix.length - 1] = 1;

        for (int i = 0, j = nums.length - 1; i < nums.length - 1 && j > 0; i++, j--) {
            prefix[i + 1] = prefix[i] * nums[i];
            suffix[j - 1] = suffix[j] * nums[j];
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix[i] * suffix[i];
        }
        return result;
    }

    // Optimal
    public int[] secondSolution(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            result[i + 1] = result[i] * nums[i];
        }
        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }
        return result;
    }
}
