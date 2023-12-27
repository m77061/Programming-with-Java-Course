import java.util.Scanner;

public class BeersPrice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double budget = Double.parseDouble(scanner.nextLine());

		String zateckyHusString = "Zatecky Hus";
		double zateckyHusPrice = 1.69;

		if (budget >= zateckyHusPrice) {
			System.out.println(zateckyHusString + " - " + zateckyHusPrice);
		}

		String budweiserString = "Budweiser";
		double budweiserPrice = 2.59;

		if (budget >= budweiserPrice) {
			System.out.println(budweiserString + " - " + budweiserPrice);
		}

		String zagorkaString = "Zagorka";
		double zagorkaPrice = 1.49;

		if (budget >= zagorkaPrice) {
			System.out.println(zagorkaString + " - " + zagorkaPrice);
		}

		String pirinskoString = "Pirinsko";
		double pirinskoPrice = 2.19;

		if (budget >= pirinskoPrice) {
			System.out.println(pirinskoString + " - " + pirinskoPrice);
		}

		String staropramenString = "Staropramen";
		double staropramenPrice = 2.11;

		if (budget >= staropramenPrice) {
			System.out.println(staropramenString + " - " + staropramenPrice);
		}

		String hobgoblinString = "Hobgoblin";
		double hobgoblinPrice = 4.59;

		if (budget >= hobgoblinPrice) {
			System.out.println(hobgoblinString + " - " + hobgoblinPrice);
		}
	}
}
