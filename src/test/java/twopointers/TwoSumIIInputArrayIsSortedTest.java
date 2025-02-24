package twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumIIInputArrayIsSortedTest {

    @Test
    public void testTwoSum() {

        TwoSumIIInputArrayIsSorted twoSumIIInputArrayIsSorted = new TwoSumIIInputArrayIsSorted();
        assertArrayEquals(new int[]{1, 2}, twoSumIIInputArrayIsSorted.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 3}, twoSumIIInputArrayIsSorted.twoSum(new int[]{2, 3, 4}, 6));
        assertArrayEquals(new int[]{1, 2}, twoSumIIInputArrayIsSorted.twoSum(new int[]{-1, 0}, -1));
    }
}
