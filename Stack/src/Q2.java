public class Q2 {

    public static <E> void removeAll(Stack<E> stack) {
        if (!stack.isEmpty()) {
            stack.pop();
            removeAll(stack);
        }
    }
}
