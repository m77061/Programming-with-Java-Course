import java.util.Scanner;

public class LetterChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		char symbol = input.charAt(0);
		boolean isUpperCaseLetter = symbol >= 65 && symbol <= 90; // ASCII codes
		boolean isLowerCaseLetter = symbol >= 97 && symbol <= 122; // ASCII codes

		if (!isUpperCaseLetter && !isLowerCaseLetter) {
			System.out.println("Invalid input!");
		} else {
			boolean isVowel =
				symbol == 'a' || symbol == 'A' ||
				symbol == 'o' || symbol == 'O' ||
				symbol == 'e' || symbol == 'E' ||
				symbol == 'u' || symbol == 'U' ||
				symbol == 'i' || symbol == 'I' ||
				symbol == 'y' || symbol == 'Y';

			if (isVowel) {
				System.out.println("Vowel");
			} else {
				System.out.println("Consonant");
			}
		}
	}
}
