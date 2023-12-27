import java.util.Scanner;

public class TicketsPrices {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double ticketPrice = 50;
		int age = Integer.parseInt(scanner.nextLine());

		if (age < 16 || age > 65) {
			ticketPrice *= 0.5;
		} else if (age >= 16 && age <= 24) {
			ticketPrice *= 0.65;
		}

		System.out.println(ticketPrice);
	}
}
