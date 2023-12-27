import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int year = Integer.parseInt(scanner.nextLine());
		boolean isLeap = (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);

		System.out.println(isLeap);
	}
}
