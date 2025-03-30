package linkedlist;

import datastructures.ListNode;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head.next;
        ListNode previous = head;
        previous.next = null;

        while (current != null) {
            ListNode currentNext = current.next;
            current.next = previous;
            previous = current;
            current = currentNext;
        }

        return previous;
    }
}
