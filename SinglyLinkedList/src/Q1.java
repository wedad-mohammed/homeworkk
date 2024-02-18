public class Q1 {
    class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // SinglyLinkedList class
    class SinglyLinkedList<T> {
        private Node<T> head;
        private Node<T> tail;
        private int size;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public T first() {
            if (isEmpty()) {
                return null;
            }
            return head.data;
        }

        public T last() {
            if (isEmpty()) {
                return null;
            }
            return tail.data;
        }

        public void addFirst(T data) {
            Node<T> newNode = new Node<>(data);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            size++;
        }

        public void addLast(T data) {
            Node<T> newNode = new Node<>(data);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        public T removeFirst() {
            if (isEmpty()) {
                return null;
            }
            T removedData = head.data;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
            }
            size--;
            return removedData;
        }
    }











}
