import java.util.Scanner;

public class MultiplyNumbersInInterval {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());
		int m = Integer.parseInt(scanner.nextLine());
		int product = 1;

		for (int counter = n; counter <= m; counter++) {
			product *= counter;
		}

		System.out.println(product);
	}
}
