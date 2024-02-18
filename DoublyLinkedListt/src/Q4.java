public class Q4 {

    public void concatenate(DoublyLinkedList list1, DoublyLinkedList list2) {
        if (list1.head == null || list2.head == null) {
            head = (list1.head == null) ? list2.head : list1.head;
            tail = (list2.head == null) ? list1.tail : list2.tail;
            return;
        }
        list1.tail.next = list2.head;
        list2.head.prev = list1.tail;
        head = list1.head;
        tail = list2.tail;
    }
}
