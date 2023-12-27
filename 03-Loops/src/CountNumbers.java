import java.util.Scanner;

public class CountNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.parseInt(scanner.nextLine());
		int positivesCount = 0;
		int negativesCount = 0;

		for (int counter = 1; counter <= number; counter++) {
			double currentNumber = Double.parseDouble(scanner.nextLine());

			if (currentNumber > 0) {
				positivesCount++;
			} else if (currentNumber < 0) {
				negativesCount++;
			}
		}

		System.out.println("Positives count = " + positivesCount);
		System.out.println("Negatives count = " + negativesCount);
	}
}
