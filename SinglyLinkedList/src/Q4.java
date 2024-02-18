//3.	Give an implementation of the size( ) method for the
// SingularlyLinkedList class,
// assuming that we did not maintain size as an instance variable.


public class Q4 {
    public int size() {
        int count = 0;
        Node<T> n = head;

        while (n != null) {
            count++;
            n = n.next;
        }

        return count;
    }
}
