package stack;

import java.util.ArrayList;

public class MinStack {
    private final ArrayList<int[]> stack;
    private int min = Integer.MAX_VALUE;
    public MinStack() {
        stack = new ArrayList<>();
    }

    public void push(int val) {
        min = Math.min(val, min);
        stack.add(new int[]{val, min});
    }

    public void pop() {
        stack.removeLast();
        min = stack.isEmpty() ? Integer.MAX_VALUE : stack.getLast()[1];
    }
    public int top() {
        return stack.getLast()[0];
    }

    public int getMin() {
        return stack.getLast()[1];
    }
}
