import java.util.Scanner;

public class PrintTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.parseInt(scanner.nextLine());
		int starsCount = 1;

		for (int row = 1; row <= number; row++) {
			for (int column = 1; column <= starsCount; column++) {
				System.out.print("*");
			}

			System.out.println();
			starsCount++;
		}
	}
}
