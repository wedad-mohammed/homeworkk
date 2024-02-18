public class Q1 {
    public static <E> void transfer(Stack<E> S, Stack<E> T) {
        Stack<E> temp = new Stack<>();

        while (!S.isEmpty()) {
            temp.push(S.pop());
        }

        while (!temp.isEmpty()) {
            T.push(temp.pop());
        }
    }
}
