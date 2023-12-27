import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a = Double.parseDouble(scanner.nextLine());
		double b = Double.parseDouble(scanner.nextLine());
		double c = Double.parseDouble(scanner.nextLine());
		double discriminant = b * b - 4 * a * c;

		if (discriminant == 0) {
			double x = - b / (2 * a);
			System.out.println("x1 = x2 = " + x);
		} else if (discriminant > 0) {
			double x1 = (- b - Math.sqrt(discriminant)) / (2 * a);
			double x2 = (- b + Math.sqrt(discriminant)) / (2 * a);
			System.out.println("x1 = " + x1 + ", x2 = " + x2);
		} else {
			System.out.println("No real roots");
		}
	}
}
