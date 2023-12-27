import java.util.Scanner;

public class WaterDegrees {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int degrees = Integer.parseInt(scanner.nextLine());
		String output = "";

		if (degrees == 0) {
			output = "Ice";
		} else if (degrees >= 1 && degrees <= 20) {
			output = "Cold Water";
		} else if (degrees >= 21 && degrees <= 30) {
			output = "Normal Temperature";
		} else if (degrees >= 31 && degrees <= 50) {
			output = "Hot Water";
		} else if (degrees >= 51 && degrees <= 99) {
			output = "Very Hot Water";
		} else if (degrees == 100) {
			output = "Boiling Water";
		}

		System.out.println(output);
	}
}
