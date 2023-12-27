import java.util.Scanner;

public class ScoreCalculation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double points = Double.parseDouble(scanner.nextLine());
		double bonusPoints = 0;

		if (points < 0 || points > 1000) {
			System.out.println("Error!");
			return; // stops the execution of main method
		}

		if (points >= 10 && points <= 100) {
			bonusPoints = points * 0.1;
		} else if (points >= 101 && points <= 200) {
			bonusPoints = 25;
		} else if (points >= 201 && points <= 300) {
			bonusPoints = points;
		} else if (points >= 301 && points <= 400) {
			bonusPoints = points * 2;
		} else if (points >= 401 && points <= 600) {
			bonusPoints = points * 3.5;
		} else if (points >= 601 && points <= 1000) {
			bonusPoints = points * 5;
		}

		double totalPoints = points + bonusPoints;

		if (totalPoints % 2 == 1) {
			totalPoints += 5;
		}

		System.out.println(totalPoints);
	}
}
