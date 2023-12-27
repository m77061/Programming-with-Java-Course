import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {
        String[] testCases = {
            "2 3 +",
            "5 1 2 + 4 * + 3 -",
            "10 6 9 3 + -11 * / * 17 + 5 +",
            "11 7 8 9 + 11 - 2 2 /"
        };

        for (int index = 0; index < testCases.length; index++) {
            System.out.println(String.format("%s = %d", testCases[index], solve(testCases[index])));
        }
    }

    private static int solve(String expression) {
        String[] tokens = expression.split(" ");
        Stack<String> stack = new Stack<String>();

        for (int index = 0; index < tokens.length; index++) {
            String token = tokens[index];
            int element;
            int firstElement;
            int secondElement;

            switch (token) {
                case "+":
                    element = Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop());
                    stack.push(Integer.toString(element));
                    break;
                case "-":
                    firstElement = Integer.parseInt(stack.pop());
                    secondElement = Integer.parseInt(stack.pop());
                    element = secondElement - firstElement;
                    stack.push(Integer.toString(element));
                    break;
                case "*":
                    element = Integer.parseInt(stack.pop()) * Integer.parseInt(stack.pop());
                    stack.push(Integer.toString(element));
                    break;
                case "/":
                    firstElement = Integer.parseInt(stack.pop());
                    secondElement = Integer.parseInt(stack.pop());
                    element = secondElement / firstElement;
                    stack.push(Integer.toString(element));
                    break;
                default:
                    stack.push(token);
                    break;
            }
        }

        return Integer.parseInt(stack.pop());
    }
}
