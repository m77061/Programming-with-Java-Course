import java.util.Scanner;

public class ReverseDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.parseInt(scanner.nextLine());
		int numberCopy = number;
		int digitsCount = 0;

		while (numberCopy > 0) {
			numberCopy /= 10;
			digitsCount++;
		}

		int reversedNumber = 0;
		numberCopy = number;

		while (numberCopy > 0) {
			int lastDigit = numberCopy % 10;
			reversedNumber += lastDigit * (int) Math.pow(10, digitsCount - 1);
			numberCopy /= 10;
			digitsCount--;
		}

		System.out.println(reversedNumber);
	}
}
