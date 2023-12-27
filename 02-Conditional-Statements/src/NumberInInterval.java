import java.util.Scanner;

public class NumberInInterval {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());
		int m = Integer.parseInt(scanner.nextLine());
		int x = Integer.parseInt(scanner.nextLine());
		boolean inInterval = x > n && x <= m;

		System.out.println(inInterval);
	}
}
