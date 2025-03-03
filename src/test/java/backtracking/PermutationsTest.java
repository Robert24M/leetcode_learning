package backtracking;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermutationsTest {

    @Test
    void testPermuteWithThreeElements() {
        Permutations solution = new Permutations();
        int[] nums = {1, 2, 3};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 3, 2),
                Arrays.asList(2, 1, 3),
                Arrays.asList(2, 3, 1),
                Arrays.asList(3, 1, 2),
                Arrays.asList(3, 2, 1)
        );

        List<List<Integer>> result = solution.permute(nums);
        assertEquals(new HashSet<>(expected), new HashSet<>(result));
    }

    @Test
    void testPermuteWithSingleElement() {
        Permutations solution = new Permutations();
        int[] nums = {5};
        List<List<Integer>> expected = Collections.singletonList(Collections.singletonList(5));

        List<List<Integer>> result = solution.permute(nums);
        assertEquals(expected, result);
    }
}
