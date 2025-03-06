package bitmanipulation;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operator set bit to 1 if bits are different, if 2 number are the same XOR will return 0, is commutative
        }
        return result;
    }
}
