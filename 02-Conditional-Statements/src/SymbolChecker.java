import java.util.Scanner;

public class SymbolChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		char symbol = input.charAt(0);
		boolean isUpperCaseLetter = symbol >= 65 && symbol <= 90;
		boolean isLowerCaseLetter = symbol >= 97 && symbol <= 122;
		boolean isLetter = isUpperCaseLetter || isLowerCaseLetter;
		boolean isDigit = symbol >= 48 && symbol <= 57;

		if (isLetter) {
			System.out.println(symbol + " is letter.");
		} else if (isDigit) {
			System.out.println(symbol + " is digit.");
		} else {
			System.out.println(symbol + " is another symbol.");
		}
	}
}
