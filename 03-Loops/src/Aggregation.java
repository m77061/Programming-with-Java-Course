import java.util.Scanner;

public class Aggregation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.parseInt(scanner.nextLine());
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		double sum = 0;

		for (int counter = 1; counter <= number; counter++) {
			double currentNumber = Double.parseDouble(scanner.nextLine());

			if (currentNumber < min) {
				min = currentNumber;
			}

			if (currentNumber > max) {
				max = currentNumber;
			}

			sum += currentNumber;
		}

		double average = sum / number;

		System.out.println("Min = " + min);
		System.out.println("Max = " + max);
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);
	}
}
