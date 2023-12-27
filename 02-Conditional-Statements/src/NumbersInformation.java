import java.util.Scanner;

public class NumbersInformation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double firstNumber = Double.parseDouble(scanner.nextLine());
		double secondNumber = Double.parseDouble(scanner.nextLine());
		double thirdNumber = Double.parseDouble(scanner.nextLine());

		double minNumber = firstNumber;

		if (minNumber > secondNumber) {
			minNumber = secondNumber;
		}

		if (minNumber > thirdNumber) {
			minNumber = thirdNumber;
		}

		double maxNumber = firstNumber;

		if (maxNumber < secondNumber) {
			maxNumber = secondNumber;
		}

		if (maxNumber < thirdNumber) {
			maxNumber = thirdNumber;
		}

		double sum = firstNumber + secondNumber + thirdNumber;
		double product = firstNumber * secondNumber * thirdNumber;

		System.out.println("Min: " + minNumber);
		System.out.println("Max: " + maxNumber);
		System.out.println("Sum: " + sum);
		System.out.println("Product: " + product);
	}
}
