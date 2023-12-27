import java.util.Scanner;

public class ProductPriceCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double productPrice = Double.parseDouble(scanner.nextLine());
        double discountPercentage = Double.parseDouble(scanner.nextLine());
        double currentPrice = productPrice * (100 - discountPercentage) / 100;
        double discount = productPrice * discountPercentage / 100;

        System.out.println(currentPrice);
        System.out.println(discount);
    }
}