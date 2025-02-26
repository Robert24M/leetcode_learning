package hashing;

public class ContainsDuplicates {

    private final Node[] memory = new Node[1000];

    public boolean containsDuplicate(int[] nums) {
        for (int num : nums) {
            if (!add(num)) {
                return true;
            }
        }
        return false;
    }

    public boolean add(int value) {
        int hash = Math.abs(value) % memory.length;
        Node currentElement = memory[hash];
        if (currentElement == null) {
            memory[hash] = new Node(hash, value);
            return true;
        }

        while (true) {
            if (currentElement.data == value) {
                return false;
            }
            if (currentElement.next == null) {
                currentElement.next = new Node(hash, value);
                return true;
            }
            currentElement = currentElement.next;
        }
    }

    static class Node {
        int hash;
        int data;
        Node next;

        public Node(int hash, int data) {
            this.hash = hash;
            this.data = data;
        }
    }
}

