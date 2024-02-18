//4.	Suppose you are given two circularly linked lists, L and M. Describe an algorithm for telling if
// L and M store the same sequence of elements (but perhaps with different starting points).
public class Q4 {
 public boolean sameSequence(CircularlyLinkedList<E> L, CircularlyLinkedList<E> M) {
        if (L.isEmpty() && M.isEmpty()) return true;
        Node<E> currentL = L.tail.getNext();
        Node<E> currentM = M.tail.getNext();
        do {
            if (!currentL.getElement().equals(currentM.getElement()))
                return false;
            currentL = currentL.getNext();
            currentM = currentM.getNext();

        } while (currentL != L.tail && currentM != M.tail);

        return true;
    }
}
