import java.util.Scanner;

public class PracticeOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstIntegerVariable = Integer.parseInt(scanner.nextLine());
        int secondIntegerVariable = Integer.parseInt(scanner.nextLine());

        double firstDoubleVariable = Double.parseDouble(scanner.nextLine());
        double secondDoubleVariable = Double.parseDouble(scanner.nextLine());

        int integerSum = firstIntegerVariable + secondIntegerVariable;
        int integerDifference = Math.abs(firstIntegerVariable - secondIntegerVariable);
        int integerProduct = firstIntegerVariable * secondIntegerVariable;
        int integerQuotient = firstIntegerVariable / secondIntegerVariable;

        System.out.println("The sum of two integer numbers is: " + integerSum);
        System.out.println("The difference of two integer numbers is: " + integerDifference);
        System.out.println("The product of two integer numbers is: " + integerProduct);
        System.out.println("The quotient of two integer numbers is: " + integerQuotient);

        double doubleSum = firstDoubleVariable + secondDoubleVariable;
        double doubleDifference = Math.abs(firstDoubleVariable - secondDoubleVariable);
        double doubleProduct = firstDoubleVariable * secondDoubleVariable;
        double doubleQuotient = firstDoubleVariable / secondDoubleVariable;

        System.out.println("The sum of two double numbers is: " + doubleSum);
        System.out.println("The difference of two double numbers is: " + doubleDifference);
        System.out.println("The product of two double numbers is: " + doubleProduct);
        System.out.println("The quotient of two double numbers is: " + doubleQuotient);
    }
}
