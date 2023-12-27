import java.util.Scanner;

public class DigitsProduct {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.parseInt(scanner.nextLine());
		int digitsProduct = 1;

		while (number > 0) {
			digitsProduct *= number % 10;
			number /= 10;
		}

		System.out.println(digitsProduct);
	}
}
