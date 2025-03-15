package string;

import java.util.*;

public class GroupAnagrams {

    ValidAnagram validAnagram = new ValidAnagram();

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> solution = new ArrayList<>();
        for (String str : strs) {
            boolean foundPair = false;
            for (List<String> seeString : solution) {
                if (validAnagram.isAnagram(str, seeString.getFirst())) {
                    seeString.add(str);
                    foundPair = true;
                    break;
                }
            }
            if (!foundPair) {
                solution.add(new ArrayList<>(List.of(str)));
            }
        }
        return solution;
    }

    public List<List<String>> groupAnagramsWithSort(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String str : strs) {
            char[] strChars = str.toCharArray();
            Arrays.sort(strChars);
            String key = new String(strChars);
            if (groups.containsKey(key)) {
                groups.get(key).add(str);
            } else {
                groups.put(key, new ArrayList<>(List.of(str)));
            }
        }
        return new ArrayList<>(groups.values());
    }

    public List<List<String>> groupAnagramsFrequencyCount(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String str : strs) {
            char[] chars = new char[26];
            for (char ch : str.toCharArray()) {
                chars[ch - 'a']++;
            }
            String key = new String(chars);
            if (groups.containsKey(key)) {
                groups.get(key).add(str);
            } else {
                groups.put(key, new ArrayList<>(List.of(str)));
            }
        }
        return new ArrayList<>(groups.values());
    }
}
