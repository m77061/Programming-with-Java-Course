import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        boolean endsWithSeven = number % 10 == 7;

        System.out.println(endsWithSeven);
    }
}