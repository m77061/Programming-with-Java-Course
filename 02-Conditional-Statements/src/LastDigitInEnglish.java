import java.util.Scanner;

public class LastDigitInEnglish {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.parseInt(scanner.nextLine());
		int lastDigit = number % 10;
		String lastDigitString = "";

		switch (lastDigit) {
			case 0:
				lastDigitString = "zero";
				break;
			case 1:
				lastDigitString = "one";
				break;
			case 2:
				lastDigitString = "two";
				break;
			case 3:
				lastDigitString = "three";
				break;
			case 4:
				lastDigitString = "four";
				break;
			case 5:
				lastDigitString = "five";
				break;
			case 6:
				lastDigitString = "six";
				break;
			case 7:
				lastDigitString = "seven";
				break;
			case 8:
				lastDigitString = "eight";
				break;
			case 9:
				lastDigitString = "nine";
				break;
		}

		System.out.println(lastDigitString);
	}
}
