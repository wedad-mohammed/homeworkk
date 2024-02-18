public class Q5 {

    class Node {
        int data;
        Node next, prev;

        public Node(int data) {
            this.data = data;
        }
    }

    class DoublyLinkedList {
        Node sentinel;

        public DoublyLinkedList() {
            sentinel = new Node(0);
            sentinel.next = sentinel;
            sentinel.prev = sentinel;
        }

    }
