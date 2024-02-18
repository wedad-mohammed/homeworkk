//5.	Describe an algorithm for concatenating two singly linked lists L and M,
// into a single list L′ that contains all the nodes of L followed by all the nodes of M


public class Q6 {

    public SinglyLinkedList<T> concatenateLists(SinglyLinkedList<T> L, SinglyLinkedList<T> M) {
        if (L.isEmpty()) {
            return M;  //
        }

        SinglyLinkedList<T> concatenatedList = L;

        Node<T> lastNodeL = L.head;
        while (lastNodeL.next != null) {
            lastNodeL = lastNodeL.next;
        }

        lastNodeL.next = M.head;
        M.head = null;

        return concatenatedList;
    }
}


