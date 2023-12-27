import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountBgn = Double.parseDouble(scanner.nextLine());
        double amountEuro = amountBgn * 1.96;

        System.out.println(amountEuro);
    }
}