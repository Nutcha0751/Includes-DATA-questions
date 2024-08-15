package PostfixCalculator;
import java.util.Stack;

public class PostfixCalculator {
    // Method to evaluate a postfix expression
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        // Split the expression by space to get individual tokens
        String[] tokens = expression.split(" ");

        // Loop through each token
        for (String token : tokens) {
            // Check if the token is an operator
            if (isOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();
                int result = applyOperator(token, a, b);
                stack.push(result);
            } else {
                // Otherwise, it's an operand, so push it onto the stack
                stack.push(Integer.parseInt(token));
            }
        }

        // The final result should be the only element left in the stack
        return stack.pop();
    }

    // Method to check if a token is an operator
    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    // Method to apply an operator to two operands
    private static int applyOperator(String operator, int a, int b) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b != 0) {
                    return a / b;
                } else {
                    throw new ArithmeticException("Cannot divide by zero");
                }
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    // Main method to test the postfix evaluation
    public static void main(String[] args) {
        String expression = "5 1 2 + 4 * + 3 -";
        int result = evaluatePostfix(expression);
        System.out.println("Result: " + result); // Output should be 14
    }
}

//O(log n) >> Binary Search
//int middle = Math.floor((start + stop) / 2)