import java.util.Scanner;

public class SimpleCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double operand1 = Double.parseDouble(scanner.nextLine());
    double operand2 = Double.parseDouble(scanner.nextLine());
    char operator = scanner.nextLine().charAt(0);
    double result = 0;

    switch (operator) {
      case '+':
        result = operand1 + operand2;
        break;
      case '-':
        result = operand1 - operand2;
        break;
      case '*':
        result = operand1 * operand2;
        break;
      case '/':
        result = operand1 / operand2;
        break;
      case '^':
        result = Math.pow(operand1, operand2);
        break;
    }

    System.out.println(result);
  }
}
