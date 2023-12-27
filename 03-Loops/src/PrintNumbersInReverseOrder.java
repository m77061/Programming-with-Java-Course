import java.util.Scanner;

public class PrintNumbersInReverseOrder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.parseInt(scanner.nextLine());

		for (int counter = number; counter >= 1; counter--) {
			System.out.println(counter);
		}
	}
}
