import java.util.Scanner;

public class PrintPattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.parseInt(scanner.nextLine());
		int counter = 1;

		for (int row = 1; row <= number; row++) {
			for (int column = 1; column <= counter; column++) {
				System.out.print(column);
			}

			for (int column = counter + 1; column <= number; column++) {
				System.out.print("*");
			}

			System.out.println();
			counter++;
		}
	}
}
