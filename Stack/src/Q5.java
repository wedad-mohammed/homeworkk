public class Q5 {
    mport java.util.Stack;

    public class PostfixEvaluator {
        public static double evaluate(String expression) {
            Stack<Double> stack = new Stack<>();
            String[] tokens = expression.split("\\s+");

            for (String token : tokens) {
                if (token.matches("\\d+")) {
                    stack.push(Double.parseDouble(token));
                } else {
                    double operand2 = stack.pop();
                    double operand1 = stack.pop();
                    switch (token) {
                        case "+":
                            stack.push(operand1 + operand2);
                            break;
                        case "-":
                            stack.push(operand1 - operand2);
                            break;
                        case "*":
                            stack.push(operand1 * operand2);
                            break;
                        case "/":
                            stack.push(operand1 / operand2);
                            break;
                    }
                }
            }
            return stack.pop();
        }

        public static void main(String[] args) {
            String expression = "5 2 + 8 3 - * 4 /";
            double result = evaluate(expression);
            System.out.println("Result: " + result);
        }
    }
}
