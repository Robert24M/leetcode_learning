package bitmanipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberTest {

    @Test
    public void testSingleNumber() {
        SingleNumber solution = new SingleNumber();
        assertEquals(1, solution.singleNumber(new int[]{2,2,1}));
        assertEquals(4, solution.singleNumber(new int[]{4,1,2,1,2}));
    }
}
