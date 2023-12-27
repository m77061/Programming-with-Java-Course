import java.util.Scanner;

public class PrintFrame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.parseInt(scanner.nextLine());

		for (int counter = 1; counter <= number; counter++) {
			System.out.print("*");
		}

		System.out.println();

		for (int row = 2; row < number; row++) {
			for (int column = 1; column <= number; column++) {
				if (column == 1 || column == number) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

		for (int counter = 1; counter <= number; counter++) {
			System.out.print("*");
		}

		System.out.println();
	}
}
