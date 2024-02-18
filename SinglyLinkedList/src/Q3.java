//2-Give an algorithm for finding the second-to-last
// node in a singly linked list in which
// the last node is indicated by a null next reference.

public class Q3 {
    public Node<T> SecondToLastNode() {
        if (head == null || head.next == null) {
            return null;  //ا
        }

        Node<T> cur = head;
        Node<T> pre = null;


        while (cur.next != null) {
            pre = cur;
            cur = cur.next;
        }


        return pre;
    }


}
/* -> null.

عند استخدام الخوارزمية المعطاة، سنحصل على العقدة قبل الأخيرة في القائمة.

التنفيذ الخطوة بالخطوة سيكون كالتالي:

في البداية، سنقوم بتعيين "current" ليشير إلى العقدة الأولى "1" و "previous" ليكون قيمته "null".

سندخل في الحلقة "while" حيث سيتم التحقق من قيمة "current.next". في هذه الحالة، القيمة ليست "null"، لذا سنقوم بتحديث "previous" ليصبح يشير إلى العقدة "1" و "current" ليشير إلى العقدة "2".

سنكرر الخطوة 2 حتى نصل إلى العقدة الأخيرة. سيتم تحديث قيمة "previous" في كل تكرار لتكون تشير إلى العقدة قبل "current". سيكون المشهد كالتالي:

الخطوة 2: "previous" = 1, "current" = 2.
الخطوة 2: "previous" = 2, "current" = 3.
الخطوة 2: "previous" = 3, "current" = 4.
بعد الخروج من الحلقة، ستكون العقدة الأخيرة هي "4" والعقدة قبل الأخيرة هي "3". سيتم إرجاع "previous" كنتيجة.

بالتالي، ستكون العقدة الثانية من الأخير هي "3" في القائمة المعطا*/