public class Q7 {


    @Override
    public DoublyLinkedList clone() {
        DoublyLinkedList newList = new DoublyLinkedList();
        Node current = this.head;
        while (current != null) {
            newList.addNode(current.data);
            current = current.next;
        }
        return newList;
    }
}
