import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.parseInt(scanner.nextLine());
		int divisorsSum = 0;

		for (int divisor = 1; divisor < number; divisor++) {
			if (number % divisor == 0) {
				divisorsSum += divisor;
			}
		}

		boolean isPerfect = number == divisorsSum;

		System.out.println(isPerfect);
	}
}
