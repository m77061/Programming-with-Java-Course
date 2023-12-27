import java.util.Scanner;

public class NumberChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double number = Double.parseDouble(scanner.nextLine());
		boolean canBeConvertedToInteger = number == (int)number;

		System.out.println(canBeConvertedToInteger);
	}
}
