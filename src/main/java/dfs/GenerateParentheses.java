package dfs;

import java.util.ArrayList;
import java.util.List;

// Brute force
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        dfs(result, "", n);
        return result;
    }

    private void dfs(List<String> result, String combination, int n) {
        if (combination.length() == n * 2) {
            if (isValid(combination)) {
                result.add(combination);
            }
            return;
        }
        dfs(result, combination + ")", n);
        dfs(result, combination + "(", n);
    }

    private boolean isValid(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            count += c == '(' ? 1 : -1;
            if (count < 0) {
                return false;
            }
        }
        System.out.println("For string " + s);
        return count == 0;
    }
}
