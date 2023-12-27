import java.util.Scanner;

public class PrintLetterH {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.parseInt(scanner.nextLine());

		for (int row = 1; row <= number; row++) {
			if (row == (number + 1) / 2) {
				for (int column = 1; column <= number; column++) {
					System.out.print("*");
				}

				System.out.println();
				continue;
			}

			System.out.print("*");

			for (int column = 2; column < number; column++) {
				System.out.print(" ");
			}

			System.out.println("*");
		}
	}
}
