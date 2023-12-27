import java.util.Scanner;

public class GuessTheNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int random = (int)(Math.random() * 10);
		int n = Integer.parseInt(scanner.nextLine());

		while (n != random) {
			if (n > random) {
				System.out.println("Too high, try again.");
			} else if (n < random) {
				System.out.println("Too low, try again.");
			}

			n = Integer.parseInt(scanner.nextLine());
		}

		System.out.println("You guessed the number!");
	}
}
