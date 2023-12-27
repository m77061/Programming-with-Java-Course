import java.util.Scanner;

public class ExchangeTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstValue = Integer.parseInt(scanner.nextLine());
        int secondValue = Integer.parseInt(scanner.nextLine());

        secondValue = secondValue - firstValue;
        firstValue = firstValue + secondValue;
        secondValue = firstValue - secondValue;

        System.out.println("First number = " + firstValue);
        System.out.println("Second Number = " + secondValue);
    }
}
