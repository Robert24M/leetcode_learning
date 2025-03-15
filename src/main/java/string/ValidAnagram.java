package string;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] letters = new int[26];
        for (char ch : s.toCharArray()) {
            letters[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            if (letters[ch - 'a']-- == 0) {
                return false;
            }
        }
        return true;
    }
}
