import java.util.Scanner;

public class DaysOfTheMonth {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String month = scanner.nextLine().toLowerCase();
		int days = 0;

		switch (month) {
			case "january":
			case "march":
			case "may":
			case "july":
			case "august":
			case "october":
			case "december":
				days = 31;
				break;
			case "april":
			case "june":
			case "september":
			case "november":
				days = 30;
				break;
			case "february":
				days = 28;
				break;
		}

		System.out.println(days);
	}
}
