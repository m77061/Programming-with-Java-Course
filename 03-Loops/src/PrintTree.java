import java.util.Scanner;

public class PrintTree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.parseInt(scanner.nextLine());
		int spacesCount = number;
		int starsCount = 0;

		for (int row = 0; row <= number; row++) {
			for (int counter = 1; counter <= spacesCount; counter++) {
				System.out.print(" ");
			}

			for (int counter = 1; counter <= starsCount; counter++) {
				System.out.print("*");
			}

			System.out.print("|");

			for (int counter = 1; counter <= starsCount; counter++) {
				System.out.print("*");
			}

			for (int counter = 1; counter <= spacesCount; counter++) {
				System.out.print(" ");
			}

			System.out.println();
			spacesCount--;
			starsCount++;
		}
	}
}
