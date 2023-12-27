import java.util.Scanner;

public class SchoolGraduation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double grade = Double.parseDouble(scanner.nextLine());

		if (grade < 2 || grade > 6) {
			System.out.println("Invalid grade!");
		} else {
			if (grade >= 5.5 && grade <= 6) {
				System.out.println("Excellent");
			} else if (grade >= 4.5 && grade < 5.5) {
				System.out.println("Very good");
			} else if (grade >= 3.5 && grade < 4.5) {
				System.out.println("Good");
			} else if (grade >= 3 && grade < 3.5) {
				System.out.println("Average");
			} else if (grade >= 2 && grade < 2) {
				System.out.println("Weak");
			}
		}
	}
}
