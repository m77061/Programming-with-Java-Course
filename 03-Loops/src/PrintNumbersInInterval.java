import java.util.Scanner;

public class PrintNumbersInInterval {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());
		int m = Integer.parseInt(scanner.nextLine());

		for (int counter = n; counter <= m; counter++) {
			System.out.println(counter);
		}
	}
}
