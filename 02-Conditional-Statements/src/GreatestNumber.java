import java.util.Scanner;

public class GreatestNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a = Double.parseDouble(scanner.nextLine());
		double b = Double.parseDouble(scanner.nextLine());
		double c = Double.parseDouble(scanner.nextLine());
		double max = Math.max(a, Math.max(b, c));

		System.out.println(max);
	}
}
