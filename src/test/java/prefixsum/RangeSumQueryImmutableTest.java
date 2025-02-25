package prefixsum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangeSumQueryImmutableTest {

    @Test
    public void testSumRange() {
        RangeSumQueryImmutable rangeSumQueryImmutable = new RangeSumQueryImmutable(new int[]{-2, 0, 3, -5, 2, -1});
        assertEquals(1, rangeSumQueryImmutable.sumRange(0,2));
        assertEquals(-1, rangeSumQueryImmutable.sumRange(2,5));
        assertEquals(-3, rangeSumQueryImmutable.sumRange(0,5));
    }
}
