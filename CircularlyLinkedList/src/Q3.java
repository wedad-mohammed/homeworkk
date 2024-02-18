//3.	Implement the equals( ) method for the CircularlyLinkedList class, assuming that two lists are equal if they have
// the same sequence of elements, with corresponding elements currently at the front of the list.

public class Q3 {

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof CircularlyLinkedList)) return false;

        CircularlyLinkedList<?> otherList = (CircularlyLinkedList<?>) obj;
        if (size() != otherList.size()) return false;

        Node<E> currentThis = tail.getNext();
        Node<?> currentOther = otherList.tail.getNext();

        while (currentThis != tail) {
            if (!currentThis.getElement().equals(currentOther.getElement()))
                return false;

            currentThis = currentThis.getNext();
            currentOther = currentOther.getNext();
        }

        return currentThis.getElement().equals(currentOther.getElement());
    }
}
