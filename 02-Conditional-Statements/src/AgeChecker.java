import java.util.Scanner;

public class AgeChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int age = Integer.parseInt(scanner.nextLine());

		if (age < 0 || age > 120) {
			System.out.println("Invalid age!");
		} else {
			if (age >= 18) {
				System.out.println(">= 18");
			} else {
				System.out.println("< 18");
			}
		}
	}
}
