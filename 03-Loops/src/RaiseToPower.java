import java.util.Scanner;

public class RaiseToPower {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.parseInt(scanner.nextLine());
		int power = Integer.parseInt(scanner.nextLine());
		int result = 1;

		for (int counter = 1; counter <= power; counter++) {
			result *= number;
		}

		System.out.println(result);
	}
}
