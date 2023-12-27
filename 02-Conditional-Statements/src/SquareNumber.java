import java.util.Scanner;

public class SquareNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.parseInt(scanner.nextLine());

		if ((int)Math.sqrt(number) == Math.sqrt(number)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
