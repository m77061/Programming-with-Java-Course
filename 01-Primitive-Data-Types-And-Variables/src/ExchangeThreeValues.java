import java.util.Scanner;

public class ExchangeThreeValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstValue = Integer.parseInt(scanner.nextLine());
        int secondValue = Integer.parseInt(scanner.nextLine());
        int thirdValue = Integer.parseInt(scanner.nextLine());

        int temp = firstValue;
        firstValue = secondValue;
        secondValue = thirdValue;
        thirdValue = temp;

        System.out.println("First Number = " + firstValue);
        System.out.println("Second Number = " + secondValue);
        System.out.println("Third Number = " + thirdValue);
    }
}
