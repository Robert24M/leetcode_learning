package twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class ValidPalindromeTest {

    @Test
    void test() {
        assertFalse(new ValidPalindrome().isPalindrome("0P"));
    }
}
