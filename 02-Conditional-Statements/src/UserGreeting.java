import java.util.Scanner;

public class UserGreeting {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String name = scanner.nextLine();
		String sex = scanner.nextLine();
		String message = "";

		if ("male".equalsIgnoreCase(sex)) {
			message = "Hello, Mr. " + name + "!";
		} else if ("female".equalsIgnoreCase(sex)) {
			message = "Hello, Ms. " + name + "!";
		} else {
			message = "Invalid input!";
		}

		System.out.println(message);
	}
}
