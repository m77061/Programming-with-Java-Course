import java.util.Scanner;

public class SumNumbersInInterval {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());
		int m = Integer.parseInt(scanner.nextLine());
		int sum = 0;

		for (int counter = n; counter <= m; counter++) {
			sum += counter;
		}

		System.out.println(sum);
	}
}
