import java.util.Scanner;

public class TriangleProperties {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a = Double.parseDouble(scanner.nextLine());
		double b = Double.parseDouble(scanner.nextLine());
		double c = Double.parseDouble(scanner.nextLine());
		boolean isTriangleEquilateral = a == b && b == c;
		boolean isTriangleIsosceles = (a == b && a != c) || (b == c && b != a) || (a == c && b != a);
		boolean isTriangleScalene = a != b && b != c;

		System.out.println("Is Equilateral: " + isTriangleEquilateral);
		System.out.println("Is Isosceles: " + isTriangleIsosceles);
		System.out.println("Is Scalene: " + isTriangleScalene);
	}
}
