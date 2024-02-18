//2.	Give an implementation of the size( ) method for the CircularlyLinkedList class,
// assuming that we did not maintain size as an instance variable.


public class Q2 {

    public int size() {
        if (isEmpty()) {
            return 0;
        }

        int count = 1;
        Node<E> current = tail.getNext();

        while (current != tail) {
            count++;
            current = current.getNext();
        }

        return count;
    }
}
