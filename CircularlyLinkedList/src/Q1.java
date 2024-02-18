//1.	 Consider the implementation of CircularlyLinkedList.addFirst,
// in Code Fragment 3.16. The else body at lines 39 and 40 of that method relies on a
// locally declared variable, newest. Redesign that clause to avoid use of any local variable.


public class Q1 {
    public void addFirst(E element) {
        Node<E> newest = new Node<>(element);

        if (isEmpty()) {
            newest.setNext(newest);
            tail = newest;
        } else {
            newest.setNext(tail.getNext());
            tail.setNext(newest);
        }

        size++;
    }


}
