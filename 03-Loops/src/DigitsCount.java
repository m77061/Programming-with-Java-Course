import java.util.Scanner;

public class DigitsCount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.parseInt(scanner.nextLine());
		int digitsCount = 0;

		while (number > 0) {
			digitsCount++;
			number /= 10;
		}

		System.out.println(digitsCount);
	}
}
