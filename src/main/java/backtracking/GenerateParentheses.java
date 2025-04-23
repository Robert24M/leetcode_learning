package backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder stack = new StringBuilder();
        backTrack(0, 0, 0, result, stack);

        return result;
    }

    public void backTrack(int openN, int closeN, int n, List<String> result, StringBuilder stack) {
        if (closeN == openN && openN == n) {
            result.add(stack.toString());
            return;
        }

        if (openN < n) {
            stack.append("(");
            backTrack(openN + 1, closeN, n, result, stack);
            stack.deleteCharAt(stack.length() - 1);
        }

        if (closeN < openN) {
            stack.append(")");
            backTrack(openN, closeN + 1, n, result, stack);
            stack.deleteCharAt(stack.length() - 1);
        }
    }
}
