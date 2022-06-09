package LinkedList;

// Que Link: https://leetcode.com/problems/reverse-linked-list/

public class ReverseLinkedList {
    public static void main(String[] args) {

    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode restHead = reverseList(head.next);
        ListNode restTail = head.next;
        restTail.next = head;
        head.next = null;
        return restHead;
    }
}
