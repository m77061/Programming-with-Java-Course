import java.util.Scanner;

public class PrintNumbersToN {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.parseInt(scanner.nextLine());

		for (int counter = 1; counter <= number; counter++) {
			System.out.println(counter);
		}
	}
}
