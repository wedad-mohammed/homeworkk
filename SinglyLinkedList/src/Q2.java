//1-develop an implementation of the
// equals method in the context of the SinglyLinkedList class.

public class Q2 {
    private Node head;
    private Node tail;

    private class Node {
        private int data;
        private Node next;t
        public Node(int daa) {
            this.data = data;
            this.next = null;
        }
    }
    public boolean equals(Q2 other) {
        Node currentNode = this.head;
        Node otherNode = other.head;

        while (currentNode != null && otherNode != null) {
            if (currentNode.data != otherNode.data) {
                return false;
            }
            currentNode = currentNode.next;
            otherNode = otherNode.next;
        }

        return currentNode == null && otherNode == null;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public static void main(String[] args) {
        Q2 l1 = new Q2();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        Q2 l2 = new Q2();
        l2.add(1);
        l2.add(2);
        l2.add(3);

        boolean isEqual = l1.equals(l2);
        System.out.println("Are the lists equal? " + isEqual);
    }
}
/*الكود الذي تمت مشاركته هو تعريف لفئة تسمى "Q2" وتمثل قائمة متسلسلة. قائمة المتسلسلة تحتوي على عقدتين رئيسيتين تسمى "head" و "tail". وكل عقدة تحتوي على متغيرين، وهما "data" و "next". يتم استخدام متغير "data" لتخزين قيمة العنصر، بينما يتم استخدام متغير "next" للإشارة إلى العقدة التالية في القائمة.
الطريقة المسماة "equals" تُستخدم لمقارنة قائمة معينة (التي تم استدعاء الطريقة عليها وهي ممثلة بـ "this") مع قائمة أخرى (التي تم تمريرها كمعامل وتمثل بـ "other"). وفيما يلي شرح لكيفية عمل هذه الطريقة بشكل مفصل:
يتم إنشاء متغيرين، وهما "currentNode" و "otherNode"، للإشارة إلى رؤوس القوائم المستخدمة في المقارنة، وهي "this.head" و "other.head" على التوالي.

يتم دخول حلقة "while"، والتي تستمر حتى يتم الوصول إلى نهاية إحدى القوائم. ويتم التحقق من ثلاثة شروط في كل تكرار للحلقة:

إذا كانت قيمة "currentNode.data" لا تساوي قيمة "otherNode.data"، فإن القوائم غير متساوية ويتم إرجاع قيمة "false"، لأن هذا يعني أن العناصر المقابلة في القوائم غير متساوية.

يتم تحديث العقدة الحالية "currentNode" لتصبح العقدة التالية في القائمة "currentNode.next".

يتم تحديث العقدة الأخرى "otherNode" لتصبح العقدة التالية في القائمة "otherNode.next".

بعد الخروج من الحلقة، يتم التحقق مما إذا كانت كلا القوائم قد وصلتا إلى نهايتهما بالتحقق من قيمتي "currentNode" و "otherNode". إذا كانت كلا القيمتين تساويان "null"، فإن القوائم متساوية ويتم إرجاع قيمة "true"، لأن هذا يعني أنه تم الوصول إلى نهاية القوائم في نفس الوقت.

بهذه الطريقة، يتم استخدام الطريقة "equals" لمقارنة قوائم متسلسلة من نوع "Q2" بناءً على قيمة عناصرها. إذا كانت جميع العناصر متطابقة وتم الوصولإلى نهاية القوائم في نفس الوقت، فإن القوائم يمكن اعتبارها متساوية.

أتمنى أن يكون الشرح واضحًا ومفهومًا. إذا كان لديك أي أسئلة إضافية، فلا تتردد في طرحها.*/