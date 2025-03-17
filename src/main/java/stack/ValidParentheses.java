package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

    public boolean isValid(String s) {
        Deque<Character> charactersStack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                charactersStack.push(c);
            } else {
                if (charactersStack.isEmpty()) {
                    return false;
                }
                char complement = charactersStack.pop();
                if (c == '}' && complement != '{') {
                    return false;
                }
                if (c == ']' && complement != '[') {
                    return false;
                }
                if (c == ')' && complement != '(') {
                    return false;
                }
            }
        }
        return charactersStack.isEmpty();
    }
}
