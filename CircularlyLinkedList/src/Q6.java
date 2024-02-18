//6.	Implement the clone( ) method for the CircularlyLinkedList class.


public class Q6 {
    public CircularlyLinkedList<E> clone() {
        CircularlyLinkedList<E> clonedList = new CircularlyLinkedList<>();

        if (isEmpty()) {
            return clonedList;
        }

        Node<E> current = tail.getNext();

        do {
            clonedList.addLast(current.getElement());
            current = current.getNext();
        } while (current != tail.getNext());

        return clonedList;
    }
}
