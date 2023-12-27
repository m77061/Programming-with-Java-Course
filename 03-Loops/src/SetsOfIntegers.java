import java.util.Scanner;

public class SetsOfIntegers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.parseInt(scanner.nextLine());
		int sumEvens = 0;
		int productOdds = 1;

		for (int counter = 1; counter <= number; counter++) {
			int currentNumber = Integer.parseInt(scanner.nextLine());
			boolean isEven = currentNumber % 2==0;

			if (isEven) {
				sumEvens += currentNumber;
			} else {
				productOdds *= currentNumber;
			}
		}

		System.out.println("Sum evens = " + sumEvens);
		System.out.println("Product odds = " + productOdds);
	}
}
