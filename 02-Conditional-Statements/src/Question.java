import java.util.Scanner;

public class Question {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String question = "What is the correct way to create a variable in Java?";
		String answerA = "A: int someRandomVariable = 5;";
		String answerB = "B: char symbol = \"$\";";
		String answerC = "C: float pi = 3.14;";
		String answerD = "D: int 1number = 5;";

		System.out.println(question);
		System.out.println(answerA);
		System.out.println(answerB);
		System.out.println(answerC);
		System.out.println(answerD);
		System.out.print("Your answer: ");

		String input = scanner.nextLine();
		char userAnswer = input.charAt(0);

		if (userAnswer == 'A' || userAnswer == 'a') {
			System.out.println("Correct!");
		} else {
			System.out.println("Try Again!");
		}
	}
}
