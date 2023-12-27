import java.util.Scanner;

public class DigitsSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.parseInt(scanner.nextLine());
		int digitsSum = 0;

		while (number > 0) {
			digitsSum += number % 10;
			number /= 10;
		}

		System.out.println(digitsSum);
	}
}
