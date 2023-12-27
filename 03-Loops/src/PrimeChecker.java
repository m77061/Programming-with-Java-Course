import java.util.Scanner;

public class PrimeChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.parseInt(scanner.nextLine());
		boolean isPrime = number >= 2;

		for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
			if (number % divisor == 0) {
				isPrime = false;
				break;
			}
		}

		System.out.println(isPrime);
	}
}
