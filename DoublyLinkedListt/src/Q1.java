public class Q1 {
    class Node {
        int data;
        Node prev, next;
    }
    class DoublyLinkedList {
        Node head, tail;
        void addNode(int data) {
            Node newNode = new Node();
            newNode.data = data;
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }
        //////////////////////////////////////////////////////////////////////////////
        Node MiddleNode() {
            Node slow = head, fast = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            if (fast != null) {
                slow = slow.prev;
            }
            return slow;
        }
////////////////////////////////////////////////////////////////////////////////
class DoublyLinkedListTest {
    public static void main(String[] args) {
        testMiddleNode();
    }

    static void testMiddleNode() {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);

        Node middleNode = list.MiddleNode();
        if (middleNode.data == 3) {
            System.out.println("Middle node passed.");
        } else {
            System.out.println("Middle node failed.");
        }
    }
}
}




