public class Q3 {
    import java.util.Stack;

    public class PostfixEvaluator {
        public static int evaluate(String expression) {
            Stack<Integer> stack = new Stack<>();
            for (char c : expression.toCharArray()) {
                if (Character.isDigit(c)) {
                    stack.push(c - '0');
                } else if (c == '+') {
                    int operand2 = stack.pop();
                    int operand1 = stack.pop();
                    stack.push(operand1 + operand2);
                } else if (c == '-') {
                    int operand2 = stack.pop();
                    int operand1 = stack.pop();
                    stack.push(operand1 - operand2);
                } else if (c == '*') {
                    int operand2 = stack.pop();
                    int operand1 = stack.pop();
                    stack.push(operand1 * operand2);
                } else if (c == '/') {
                    int operand2 = stack.pop();
                    int operand1 = stack.pop();
                    stack.push(operand1 / operand2);
                }
            }
            return stack.pop();
        }

        public static void main(String[] args) {
            String postfixExpression = "52+83-*4/";
            int result = evaluate(postfixExpression);
            System.out.println("Result: " + result);
        }
    }
}
