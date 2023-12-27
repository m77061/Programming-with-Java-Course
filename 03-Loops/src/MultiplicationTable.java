import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.parseInt(scanner.nextLine());

		for (int multiplier = 0; multiplier <= 10; multiplier++) {
			int result = number * multiplier;

			System.out.println(number + " x " + multiplier + " = " + result);
		}
	}
}
