import java.util.Scanner;

public class SumCalculation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());
		double sum = 0;

		for (int counter = 1; counter <= n; counter++) {
			sum += 1.0 / counter;
		}

		System.out.println(sum);
	}
}
