public class Topics {

    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
        }
    }

    class DoublyLinkedList {
        Node head, tail;

        boolean isEmpty() {
            return head == null;
        }

        void addFirst(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        }

        void addLast(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        int removeFirst() {
            if (isEmpty()) return -1;
            int data = head.data;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            return data;
        }

        int removeLast() {
            if (isEmpty()) return -1;
            int data = tail.data;
            if (head == tail) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
            return data;
        }
    }
}
