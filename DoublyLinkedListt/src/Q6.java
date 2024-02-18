public class Q6 {
    class Node {
        int data;
        Node next, prev;

        public Node(int data) {
            this.data = data;
        }
    }

    class CircularDoublyLinkedList {
        Node head;
        public CircularDoublyLinkedList() {
            head = null;
        }

        public void rotate() {
            if (head != null) {
                head = head.next;
            }
        }

        public void rotateBackward() {
            if (head != null) {
                head = head.prev;
            }
        }
        // Implement other methods  add, remove, , etc.
    }
}
