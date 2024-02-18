//6.	Describe in detail an algorithm for
// reversing a singly linked list L using only a constant amount of additional space.

public class Q7 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;
        ListNode temp;

        while (current != null) {
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }

        return previous;
    }
    }
    ////////////////////////////////////////////////////
