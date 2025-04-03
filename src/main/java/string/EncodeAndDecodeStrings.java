package string;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strs) {
            stringBuilder.append(str.length()).append("#").append(str);
        }
        return stringBuilder.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        if (str.isEmpty()) {
            return result;
        }
        int left = 0;
        while (left < str.length()) {
            int right = left;
            while (right < str.length() && str.charAt(right) != '#') {
                right++;
            }
            int length = Integer.parseInt(str.substring(left, right));
            left = right + 1;
            right = left + length;
            result.add(str.substring(left, right));
            left = right;
        }
        return result;
    }
}
