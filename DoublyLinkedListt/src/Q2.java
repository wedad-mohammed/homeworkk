public class Q2 {

    int size() {
        int count = 0;
        Node n = head;
        while (n != null) {
            count++;
            n= n.next;
        }
        return count;
    }

}
