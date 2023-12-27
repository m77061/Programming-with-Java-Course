import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.parseInt(scanner.nextLine());
		boolean isEven = number % 2 == 0;

		System.out.println(isEven);
	}
}
