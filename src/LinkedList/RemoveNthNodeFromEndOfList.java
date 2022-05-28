package LinkedList;

// Que Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode();
        start.next = head;
        ListNode slow = start;
        ListNode fast = start;
        for (int i = 0; i < n ; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }
}
