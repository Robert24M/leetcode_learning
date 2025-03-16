package twopointers;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char leftCh = s.charAt(left);
            char rightCh = s.charAt(right);
            boolean shouldSkipLeft = shouldSkip(leftCh);
            boolean shouldSkipRight = shouldSkip(rightCh);
            if (!shouldSkipRight && !shouldSkipLeft) {
                if (!areEqualsIgnoreCase(leftCh, rightCh)) {
                    return false;
                }
                left++;
                right--;
            }
            if (shouldSkipLeft) {
                left++;
            }
            if (shouldSkipRight) {
                right--;
            }
        }
        return true;
    }

    private boolean areEqualsIgnoreCase(char leftCh, char rightCh) {
        boolean isLeftCharNumber = leftCh > 47 && leftCh < 58;
        boolean isRightCharNumber = rightCh > 47 && rightCh < 58;
        if (isLeftCharNumber || isRightCharNumber) {
            return leftCh == rightCh;
        }
        return leftCh == rightCh || leftCh + 32 == rightCh || leftCh == rightCh + 32;
    }

    private boolean shouldSkip(char ch) {
        if (ch > 47 && ch < 58) {
            return false;
        } else if (ch > 64 && ch < 91) {
            return false;
        } else return ch <= 96 || ch >= 123;
    }

    public boolean isPalindromeFastSolution(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        s = sb.toString();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public boolean isPalindromeWithCharMethods(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char leftCh = s.charAt(left);
            char rightCh = s.charAt(right);
            if (Character.isLetterOrDigit(leftCh) && Character.isLetterOrDigit(rightCh)) {
                if (Character.toLowerCase(leftCh) != Character.toLowerCase(rightCh)) {
                    return false;
                }
                left++;
                right--;
            }
            if (!Character.isLetterOrDigit(leftCh)) {
                left++;
            }
            if (!Character.isLetterOrDigit(rightCh)) {
                right--;
            }
        }
        return true;
    }
}
