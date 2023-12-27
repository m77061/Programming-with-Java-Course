import java.util.Scanner;

public class Shop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double budget = Double.parseDouble(scanner.nextLine());

		double product1 = Double.parseDouble(scanner.nextLine());
		double product2 = Double.parseDouble(scanner.nextLine());
		double product3 = Double.parseDouble(scanner.nextLine());

		double totalPrice = product1 + product2 + product3;

		if (budget >= totalPrice) {
			System.out.println("You have enough money to buy these products! Money left $" + (budget - totalPrice));
		} else {
			System.out.println("Unfortunately, you do not have enough money. You need $" + (totalPrice - budget) + " more.");
		}
	}
}
