package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class EvaluateReversePolishNotation {

    private static Map<String, BiFunction<Integer, Integer, Integer>> signToOperation = new HashMap<>();
    static {
        signToOperation.put("+", Integer::sum);
        signToOperation.put("-", (x, y) -> x - y);
        signToOperation.put("*", (x, y) -> x * y);
        signToOperation.put("/", (x, y) -> x / y);
    }

    public int evalRPN(String[] tokens) {

        Deque<Integer> numbers = new ArrayDeque<>();
        int result = 0;
        for (String token : tokens) {
            if (signToOperation.containsKey(token)) {
                int y = numbers.pop();
                int x = numbers.pop();
                result = signToOperation.get(token).apply(x, y);
            } else {
                result = Integer.parseInt(token);
            }
            numbers.push(result);
        }
        return result;
    }
}
