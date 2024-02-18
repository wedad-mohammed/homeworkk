//5.	Given a circularly linked list L containing an even
// number of nodes, describe how to split L into two circularly linked lists of half the size


public class Q5 {

    public Pair<CircularlyLinkedList<E>, CircularlyLinkedList<E>> splitCircularList(CircularlyLinkedList<E> L) {
        CircularlyLinkedList<E> L1 = new CircularlyLinkedList<>();
        CircularlyLinkedList<E> L2 = new CircularlyLinkedList<>();

        Node<E> slow = L.tail.getNext();
        Node<E> fast = L.tail.getNext().getNext();

        while (fast != L.tail && fast.getNext() != L.tail) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        L1.tail = slow;
        L2.tail = slow.getNext();

        L1.tail.setNext(L1.tail);
        L2.tail.setNext(L2.tail);

        Node<E> current = L.tail.getNext();

        while (current != L1.tail) {
            L1.addLast(current.getElement());
            current = current.getNext();
        }

        while (current != L2.tail.getNext()) {
            L2.addLast(current.getElement());
            current = current.getNext();
        }

        return new Pair<>(L1, L2);
    }
}
