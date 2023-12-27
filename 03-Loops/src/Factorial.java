import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.parseInt(scanner.nextLine());
		int factorial = 1;

		for (int counter = 1; counter <= number; counter++) {
			factorial *= counter;
		}

		System.out.println(number + "! = " + factorial);
	}
}
