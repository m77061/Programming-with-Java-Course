import java.util.Scanner;

public class PrintRectangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.parseInt(scanner.nextLine());

		for (int row = 1; row <= number; row++) {
			for (int column = 1; column <= number; column++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
