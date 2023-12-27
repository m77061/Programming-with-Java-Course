import java.util.Scanner;

public class SignChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = Integer.parseInt(scanner.nextLine());
		int b = Integer.parseInt(scanner.nextLine());
		int c = Integer.parseInt(scanner.nextLine());
		boolean isZero = a == 0 || b == 0 || c == 0;
		boolean isNegative =
			(a < 0 && b > 0 && c > 0) ||
			(a > 0 && b < 0 && c > 0) ||
			(a > 0 && b > 0 && c < 0) ||
			(a < 0 && b < 0 && c < 0);

		char sign = '\0'; // default char value

		if (isZero) {
			sign = '0';
		} else if (isNegative) {
			sign = '-';
		} else {
			sign = '+';
		}

		System.out.println(sign);
	}
}
