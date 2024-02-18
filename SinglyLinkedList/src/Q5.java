//4.	Implement a rotate( ) method in the SinglyLinkedList class,
// which has semantics equal to addLast(removeFirst( )), yet without creating any new node


public class Q5 {

    public void rotate() {
        if (head == null || head.next == null) {
            return;
        }

        Node<T> firstNode = head;
        Node<T> secondNode = head.next;

        head = secondNode;
        firstNode.next = null;

        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = firstNode;
    }
}

