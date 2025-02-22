package slidingwindow;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        // Use hasMap to store character and its las index
        Map<Character, Integer> characters = new HashMap<>();
        // final result
        int result = 0;
        // left pointer of substring
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentCharacter = s.charAt(right);
            // if the character already exist and its index is in the window move left pointer to character index + 1
            if (characters.containsKey(currentCharacter) && characters.get(currentCharacter) >= left) {
                left = characters.get(currentCharacter) + 1;
            }
            characters.put(currentCharacter, right);
            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}
