package stack;

import java.util.PriorityQueue;

public class MinStack {
    // toDo: keep in every entry of stack the value and the min at that point
    private Integer[] stack;
    private int pointer;
    private PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    public MinStack() {
        stack = new Integer[300000];
        pointer = -1;
    }

    public void push(int val) {
        stack[++pointer] = val;
        priorityQueue.add(val);
    }

    public void pop() {
        int lastElement = stack[pointer];
        stack[pointer--] = null;
        priorityQueue.remove(lastElement);
    }

    public int top() {
        return stack[pointer];
    }

    public int getMin() {
        Integer min = priorityQueue.peek();
        if (min != null) {
            return min;
        }
        return Integer.MIN_VALUE;
    }

}
